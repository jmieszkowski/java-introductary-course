package pl.com.empas.java_introductory_course.oop.solid.pc.configurator;

import pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts.Case;
import pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts.Cpu;
import pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts.Gpu;
import pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts.PowerSupplier;

public interface  PcConfiguratorBuilder {


    PcConfiguratorBuilder cpu(Cpu cpu);
    PcConfiguratorBuilder gpu(Gpu [] gpus) throws Exception;
    PcConfiguratorBuilder pcCase(Case pcCase);
    PcConfiguratorBuilder powerSuppier(PowerSupplier supplier);
    //PC build() ;


}
