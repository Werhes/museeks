package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6206e extends AbstractC3839e {
    public final /* synthetic */ int metrica;
    public static final C6206e license = new C6206e("must be a member function", 0);
    public static final C6206e appmetrica = new C6206e("must be a member or an extension function", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6206e(String str, int i) {
        super(str, 0);
        this.metrica = i;
    }

    @Override // defpackage.InterfaceC16897e
    public final boolean metrica(C0782e c0782e) {
        switch (this.metrica) {
            case 0:
                return c0782e.f29668e != null;
            default:
                return (c0782e.f29668e == null && c0782e.f29656e == null) ? false : true;
        }
    }
}
