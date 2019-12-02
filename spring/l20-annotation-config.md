##  TASK : implementing annotation configuration
1. applicationContext.xml
<context:annotation-confing/>
<context:component-scan base-package="com.domain"/>

2. annotations
@Repository("productRepository");
@Repository("productService");

3. autowire inside ProductServiceImpl
@Autowired
private ProductRepository productRepository;


# sterotypes
@Component : @Service @Repository

