class BootStrap {

    def init = { servletContext ->
    	new somepackage.SomeDomain(type: Date).save(flush: true)
    }
    def destroy = {
    }
}
