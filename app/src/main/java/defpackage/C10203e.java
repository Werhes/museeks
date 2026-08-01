package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10203e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20171e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4473e f20172e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10203e(C4473e c4473e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f20171e = i;
        this.f20172e = c4473e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f20171e) {
            case 0:
                return new C10203e(this.f20172e, interfaceC5083e, 0);
            default:
                return new C10203e(this.f20172e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f20171e) {
            case 0:
                return ((C10203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C10203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f20171e) {
            case 0:
                int i = this.f20173e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C4473e c4473e = this.f20172e;
                    C11318e c11318e = new C11318e(c4473e.appmetrica.ad(), new C1053e(c4473e, (InterfaceC5083e) null, 10));
                    C5845e c5845e = new C5845e(15, c4473e);
                    this.f20173e = 1;
                    Object ad = c11318e.ad(c5845e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f20173e;
                InterfaceC5083e interfaceC5083e = null;
                C4473e c4473e2 = this.f20172e;
                try {
                    if (i2 == 0) {
                        AbstractC2003e.purchase(obj);
                        InterfaceC8018e interfaceC8018e = c4473e2.appmetrica;
                        C3910e c3910e = new C3910e(c4473e2, interfaceC5083e, 0);
                        this.f20173e = 1;
                        Object vip = interfaceC8018e.vip(c3910e, this);
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (vip == enumC2821e2) {
                            return enumC2821e2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                    }
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    C12893e c12893e = c4473e2.yandex;
                    if (c12893e == null) {
                        c12893e = null;
                    }
                    c4473e2.yandex = C12893e.ad(c12893e, null, c4473e2.license.ad(), null, 5);
                }
                return Unit.INSTANCE;
        }
    }
}
