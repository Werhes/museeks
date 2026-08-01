package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2841e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14398e f6812e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6813e;

    public /* synthetic */ C2841e(C14398e c14398e, int i) {
        this.f6813e = i;
        this.f6812e = c14398e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6813e) {
            case 0:
                this.f6812e.m2514goto(new C5838e());
                return Unit.INSTANCE;
            case 1:
                this.f6812e.m2514goto(new C0365e());
                return Unit.INSTANCE;
            case 2:
                this.f6812e.m2514goto(new C11379e());
                return Unit.INSTANCE;
            case 3:
                this.f6812e.f28471e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                this.f6812e.f28474e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                C14398e c14398e = this.f6812e;
                c14398e.f28471e.setValue(Boolean.FALSE);
                c14398e.pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=amirz.musicfx.material")));
                return Unit.INSTANCE;
            case 6:
                this.f6812e.m2514goto(new C5164e());
                return Unit.INSTANCE;
            case 7:
                this.f6812e.f28474e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                C14398e c14398e2 = this.f6812e;
                C0576e c0576e = c14398e2.f28476e;
                c0576e.setValue(Boolean.valueOf(!((Boolean) c0576e.getValue()).booleanValue()));
                C8063e c8063e = AbstractC16524e.loadAd;
                Boolean bool = (Boolean) c0576e.getValue();
                bool.booleanValue();
                c8063e.vip(bool);
                AbstractC6232e.billing(C16716e.ad, AbstractC4608e.metrica(c14398e2.vip()));
                return Unit.INSTANCE;
            case 9:
                C8063e c8063e2 = AbstractC16524e.amazon;
                EnumC9702e enumC9702e = EnumC9702e.f19202e;
                c8063e2.vip(enumC9702e);
                C14398e c14398e3 = this.f6812e;
                c14398e3.f28475e.setValue(enumC9702e);
                AbstractC6232e.billing(C16716e.ad, AbstractC4608e.metrica(c14398e3.vip()));
                return Unit.INSTANCE;
            case 10:
                C8063e c8063e3 = AbstractC16524e.amazon;
                EnumC9702e enumC9702e2 = EnumC9702e.f19200e;
                c8063e3.vip(enumC9702e2);
                C14398e c14398e4 = this.f6812e;
                c14398e4.f28475e.setValue(enumC9702e2);
                AbstractC6232e.billing(C16716e.ad, AbstractC4608e.metrica(c14398e4.vip()));
                return Unit.INSTANCE;
            case 11:
                return AbstractC10024e.ad(this.f6812e.pro());
            case 12:
                C14398e c14398e5 = this.f6812e;
                try {
                    Activity pro = c14398e5.pro();
                    Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                    intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
                    int i = C6572e.f13545e;
                    if (i != 0) {
                        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
                    }
                    pro.startActivityForResult(intent, 390);
                } catch (Exception unused) {
                    c14398e5.f28471e.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 13:
                this.f6812e.f28471e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                this.f6812e.f28474e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                this.f6812e.m2514goto(new C16929e());
                return Unit.INSTANCE;
            default:
                this.f6812e.m2514goto(new C7897e());
                return Unit.INSTANCE;
        }
    }
}
