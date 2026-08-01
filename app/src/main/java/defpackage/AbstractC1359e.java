package defpackage;

import java.io.PrintStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1359e {
    public static final int ad;
    public static final int vip;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property != null && !property.isEmpty()) {
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr[i3].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                }
            }
        }
        i = 1;
        ad = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        vip = i2;
    }

    public static final void ad(String str, Throwable th) {
        vip().println("SLF4J(E): " + str);
        vip().println("SLF4J(E): Reported exception:");
        th.printStackTrace(vip());
    }

    public static final void metrica(String str) {
        if (AbstractC8703e.m2467class(3) >= AbstractC8703e.m2467class(vip)) {
            vip().println("SLF4J(W): " + str);
        }
    }

    public static PrintStream vip() {
        return AbstractC8703e.m2467class(ad) != 1 ? System.err : System.out;
    }
}
