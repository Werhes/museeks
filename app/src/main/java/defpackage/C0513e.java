package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f2624e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14843e f2625e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f2626e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5014e f2627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0513e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C14843e c14843e, Function2 function2) {
        super(2);
        this.f2627e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f2625e = c14843e;
        this.f2624e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0513e(C14843e c14843e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, Function2 function2, int i) {
        super(2);
        this.f2625e = c14843e;
        this.f2627e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f2624e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2626e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    c13770e.m3676strictfp(866651995);
                    AbstractC11473e.ad(this.f2627e, this.f2625e.mopub, this.f2624e, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                this.f2625e.ad(this.f2627e, this.f2624e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
