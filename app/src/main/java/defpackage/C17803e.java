package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17803e extends AbstractC16828e implements InterfaceC3220e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f34891e;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, eُۡٔ] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, eِّؔ] */
    public C17803e(C3098e c3098e, C1729e c1729e, Executor executor, C17856e c17856e) {
        super(c1729e, executor);
        boolean metrica = AbstractC4214e.metrica();
        this.f34891e = metrica;
        ?? obj = new Object();
        obj.f22772e = AbstractC4214e.ad(c3098e);
        C5244e c5244e = new C5244e(obj);
        ?? obj2 = new Object();
        obj2.f6385e = metrica ? EnumC5396e.TYPE_THICK : EnumC5396e.TYPE_THIN;
        obj2.f6387e = c5244e;
        EnumC2663e.f6529e.execute(new RunnableC11327e(16, c17856e, new C7306e(obj2, 1), EnumC11135e.ON_DEVICE_BARCODE_CREATE, c17856e.metrica(), false));
    }

    @Override // defpackage.InterfaceC12533e
    public final C1032e[] ad() {
        return this.f34891e ? AbstractC14014e.ad : new C1032e[]{AbstractC14014e.vip};
    }

    @Override // defpackage.AbstractC16828e, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }
}
