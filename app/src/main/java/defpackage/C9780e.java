package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C9780e extends AbstractC15582e implements InterfaceC12449e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C9780e f19324e = new C9780e(C9709e.appmetrica, 0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19325e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9709e f19326e;

    public C9780e(C9709e c9709e, int i) {
        this.f19326e = c9709e;
        this.f19325e = i;
    }

    @Override // defpackage.InterfaceC12449e
    /* renamed from: ad */
    public C6556e builder() {
        return new C6556e(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f19326e.license(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f19326e.billing(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final C9780e vip(Object obj, C7731e c7731e) {
        C13572e signatures = this.f19326e.signatures(obj != null ? obj.hashCode() : 0, obj, c7731e, 0);
        return signatures == null ? this : new C9780e((C9709e) signatures.f26878e, this.f19325e + signatures.f26879e);
    }
}
