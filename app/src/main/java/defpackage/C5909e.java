package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5909e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12467e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11795e f12468e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f12469e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C11795e f12470e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f12471e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C7314e f12472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5909e(C11795e c11795e, C11795e c11795e2, Object obj, int i, C7314e c7314e, int i2) {
        super(1);
        this.f12469e = i2;
        this.f12468e = c11795e;
        this.f12470e = c11795e2;
        this.f12471e = obj;
        this.f12467e = i;
        this.f12472e = c7314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12469e) {
            case 0:
                InterfaceC16992e interfaceC16992e = (InterfaceC16992e) obj;
                C11795e c11795e = this.f12470e;
                if (this.f12468e != ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).purchase()) {
                    return Boolean.TRUE;
                }
                boolean startapp = C17150e.startapp(c11795e, (C11795e) this.f12471e, this.f12467e, this.f12472e);
                Boolean valueOf = Boolean.valueOf(startapp);
                if (startapp || !interfaceC16992e.ad()) {
                    return valueOf;
                }
                return null;
            default:
                InterfaceC16992e interfaceC16992e2 = (InterfaceC16992e) obj;
                C11795e c11795e2 = this.f12470e;
                if (this.f12468e != ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e2)).getFocusOwner()).purchase()) {
                    return Boolean.TRUE;
                }
                boolean firebase = AbstractC12442e.firebase(this.f12467e, this.f12472e, c11795e2, (C0763e) this.f12471e);
                Boolean valueOf2 = Boolean.valueOf(firebase);
                if (firebase || !interfaceC16992e2.ad()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
