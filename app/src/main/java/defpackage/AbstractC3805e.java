package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3805e {
    public static final InterfaceC1570e ad;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        ad = property != null ? Boolean.parseBoolean(property) : false ? new Object() : new C12074e(4096, 1);
    }
}
