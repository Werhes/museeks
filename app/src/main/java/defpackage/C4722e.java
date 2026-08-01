package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4722e implements InterfaceC5083e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ClassLoader f10108e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10731e f10109e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f10110e;

    public C4722e(AbstractC10731e abstractC10731e, ClassLoader classLoader) {
        this.f10109e = abstractC10731e;
        this.f10108e = classLoader;
        this.f10110e = abstractC10731e.admob();
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return this.f10110e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        Thread.currentThread().setContextClassLoader(this.f10108e);
        this.f10109e.billing(obj);
    }
}
