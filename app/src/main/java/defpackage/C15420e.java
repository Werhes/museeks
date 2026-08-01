package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15420e extends AbstractC14972e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15420e f30490e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕۥٙ, eّٕٓ, eٔۛۧ] */
    static {
        int i = AbstractC10617e.metrica;
        int i2 = AbstractC10617e.license;
        long j = AbstractC10617e.appmetrica;
        String str = AbstractC10617e.ad;
        ?? abstractC3743e = new AbstractC3743e();
        abstractC3743e.f29687e = new ExecutorC8080e(i, i2, j, str);
        f30490e = abstractC3743e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public final AbstractC3743e mo685static(int i) {
        AbstractC2356e.vip(i);
        return i >= AbstractC10617e.metrica ? this : super.mo685static(i);
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return "Dispatchers.Default";
    }
}
