package defpackage;

import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class pro {
    public static final Hashtable ad;
    public static final Hashtable metrica;
    public static final Hashtable vip;

    static {
        remoteconfig remoteconfigVar = new remoteconfig(0);
        Hashtable hashtable = new Hashtable();
        ad = hashtable;
        Hashtable hashtable2 = new Hashtable();
        vip = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        metrica = hashtable3;
        Ctry ctry = signatures.ad;
        hashtable.put(AbstractC1433e.license("FRP256v1"), ctry);
        hashtable3.put(ctry, "FRP256v1");
        hashtable2.put(ctry, remoteconfigVar);
    }
}
