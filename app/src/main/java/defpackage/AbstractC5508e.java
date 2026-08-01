package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5508e {
    public static final Charset ad = Charset.forName("UTF-8");
    public static volatile Charset appmetrica;
    public static final Charset license;
    public static final Charset metrica;
    public static volatile Charset purchase;
    public static final Charset vip;

    static {
        Charset.forName("UTF-16");
        vip = Charset.forName("UTF-16BE");
        metrica = Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        license = Charset.forName("ISO-8859-1");
    }
}
