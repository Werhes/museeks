package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4889e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f10375e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10376e;

    public /* synthetic */ C4889e(AbstractC2832e abstractC2832e, int i) {
        this.f10376e = i;
        this.f10375e = abstractC2832e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10376e) {
            case 0:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 1:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 2:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 3:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 4:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 5:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 6:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 7:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                EnumC7792e appmetrica = abstractC3698e.appmetrica();
                EnumC7792e enumC7792e = EnumC7792e.f15794e;
                AbstractC2832e abstractC2832e = this.f10375e;
                if (appmetrica == enumC7792e || abstractC3698e.purchase() == 0) {
                    AbstractC3698e.ad(abstractC3698e, abstractC2832e);
                    abstractC2832e.mo392catch(C11490e.license(0L, abstractC2832e.f6802e), 0.0f, null);
                } else {
                    long purchase = ((abstractC3698e.purchase() - abstractC2832e.f6806e) - r1) << 32;
                    AbstractC3698e.ad(abstractC3698e, abstractC2832e);
                    abstractC2832e.mo392catch(C11490e.license((((int) 0) & 4294967295L) | purchase, abstractC2832e.f6802e), 0.0f, null);
                }
                return Unit.INSTANCE;
            case 8:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 9:
                AbstractC3698e.Signature((AbstractC3698e) obj, this.f10375e, 0, 0, null, 12);
                return Unit.INSTANCE;
            case 10:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 11:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 12:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 13:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 14:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 15:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
            case 16:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((AbstractC3698e) obj).billing(this.f10375e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            default:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f10375e, 0, 0);
                return Unit.INSTANCE;
        }
    }
}
