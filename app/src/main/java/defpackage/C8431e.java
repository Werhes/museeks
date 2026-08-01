package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8431e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17197e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17198e;

    public /* synthetic */ C8431e(int i, Object obj) {
        this.f17198e = i;
        this.f17197e = obj;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        switch (this.f17198e) {
            case 0:
                try {
                    return (InterfaceC13125e) ((Class) this.f17197e).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (C2734e) this.f17197e;
            case 2:
                return (C0142e) this.f17197e;
            default:
                return (C0433e) this.f17197e;
        }
    }
}
