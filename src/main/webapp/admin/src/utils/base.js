const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm1g1l5/",
            name: "ssm1g1l5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1g1l5/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "疫情状态下的图书馆座位预约系统"
        } 
    }
}
export default base
