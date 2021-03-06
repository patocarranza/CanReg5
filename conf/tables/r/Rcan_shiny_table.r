  ## To get the R folder of the actual script
  initial.options <- commandArgs(trailingOnly = FALSE)
  file.arg.name <- "--file="
  script.name <- sub(file.arg.name, "", 
                     initial.options[grep(file.arg.name, initial.options)])
  script.basename <- dirname(script.name)
  
  ## Load Rcan function
  source(paste(sep="/", script.basename, "Rcan_core.r"))
  
  ## to get canreg argument list
  Args <- commandArgs(TRUE)
  ls_args <- canreg_args(Args)
  
  
tryCatch({
  
  canreg_load_packages(c("Rcpp", "data.table", "ggplot2","shiny","shinydashboard", "shinyjs","gridExtra", "scales", "Cairo","grid","officer","flextable", "zip", "bmp", "jpeg", "png"), Rcan_source=script.basename)
  
  dt_base <- csu_merge_inc_pop(
    inc_file =ls_args$inc,
    pop_file =ls_args$pop,
    group_by = c("ICD10GROUP", "ICD10GROUPLABEL","ICD10GROUPCOLOR", "YEAR", "SEX"),
    column_group_list =list(c("ICD10GROUP", "ICD10GROUPLABEL", "ICD10GROUPCOLOR"))
  )
  
  
  canreg_age_group <- canreg_get_agegroup_label(dt_base, ls_args$agegroup)
  year_info <- canreg_get_years(dt_base)
  
  shiny_dir <- paste(sep="/", script.basename, "shiny")
  runApp(appDir =shiny_dir, launch.browser =TRUE)
 

#talk to canreg
  cat(paste("-outFile",ls_args$filename,sep=":"))
	
	
  },
  
  error = function(e){
    if (exists("doc")) {
      print(doc, ls_args$filename)
     if (file.exists(ls_args$filename)) file.remove(ls_args$filename)
    }
    
    canreg_error_log(e,ls_args$filename,ls_args$out,Args,ls_args$inc,ls_args$pop)
  }
)
	
	
	
	
