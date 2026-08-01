package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1857e extends AbstractC8000e {
    public static final /* synthetic */ InterfaceC8614e[] billing;
    public final Object appmetrica;
    public final C13475e license;
    public final C13475e metrica;
    public final C13475e purchase;

    static {
        C12156e c12156e = new C12156e(C1857e.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        billing = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C1857e.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, c12232e), AbstractC4653e.tapsense(C1857e.class, "members", "getMembers()Ljava/util/Collection;", 0, c12232e)};
    }

    public C1857e(C10671e c10671e) {
        super(c10671e);
        this.metrica = AbstractC2426e.vip(null, new C0371e(c10671e, 1));
        int i = 0;
        this.license = AbstractC2426e.vip(null, new C17197e(i, this));
        this.appmetrica = AbstractC18039e.appmetrica(2, new C4071e(this, c10671e, i));
        this.purchase = AbstractC2426e.vip(null, new C4071e(this, c10671e, 1));
    }
}
