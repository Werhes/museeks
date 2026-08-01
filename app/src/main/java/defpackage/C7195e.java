package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.playback.auto.VkxArtworkContentProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7195e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14700e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f14701e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14702e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7195e(C13622e c13622e, InterfaceC16132e interfaceC16132e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14700e = 1;
        this.f14702e = c13622e;
        this.f14701e = interfaceC16132e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7195e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14700e = i;
        this.f14702e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7195e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14700e = i;
        this.f14701e = obj;
        this.f14702e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7195e(Function1 function1, C8823e c8823e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14700e = 6;
        this.f14701e = (AbstractC7185e) function1;
        this.f14702e = c8823e;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14700e) {
            case 0:
                return new C7195e((C10985e) this.f14701e, (C13622e) this.f14702e, interfaceC5083e, 0);
            case 1:
                return new C7195e((C13622e) this.f14702e, (InterfaceC16132e) this.f14701e, interfaceC5083e);
            case 2:
                C7195e c7195e = new C7195e((C13817e) this.f14702e, interfaceC5083e, 2);
                c7195e.f14701e = obj;
                return c7195e;
            case 3:
                return new C7195e((String) this.f14701e, (C13817e) this.f14702e, interfaceC5083e, 3);
            case 4:
                return new C7195e((AbstractC1792e) this.f14701e, (C4031e) this.f14702e, interfaceC5083e, 4);
            case 5:
                C7195e c7195e2 = new C7195e((InterfaceC6034e) this.f14702e, interfaceC5083e, 5);
                c7195e2.f14701e = obj;
                return c7195e2;
            case 6:
                return new C7195e((Function1) this.f14701e, (C8823e) this.f14702e, interfaceC5083e);
            case 7:
                return new C7195e((C15274e) this.f14701e, (View) this.f14702e, interfaceC5083e, 7);
            case 8:
                return new C7195e((InterfaceC1108e) this.f14701e, (C0216e) this.f14702e, interfaceC5083e, 8);
            case 9:
                return new C7195e((C5891e) this.f14701e, (C3566e) this.f14702e, interfaceC5083e, 9);
            case 10:
                return new C7195e((C2014e) this.f14701e, (Context) this.f14702e, interfaceC5083e, 10);
            case 11:
                return new C7195e((C11268e) this.f14701e, (C5272e) this.f14702e, interfaceC5083e, 11);
            case 12:
                return new C7195e((C9438e) this.f14701e, (ArrayList) this.f14702e, interfaceC5083e, 12);
            case 13:
                C7195e c7195e3 = new C7195e((C9438e) this.f14702e, interfaceC5083e, 13);
                c7195e3.f14701e = obj;
                return c7195e3;
            case 14:
                return new C7195e((C8544e) this.f14701e, (InterfaceC16671e) this.f14702e, interfaceC5083e, 14);
            case 15:
                C7195e c7195e4 = new C7195e((C8544e) this.f14702e, interfaceC5083e, 15);
                c7195e4.f14701e = obj;
                return c7195e4;
            case 16:
                return new C7195e((C8544e) this.f14701e, (InterfaceC16671e) this.f14702e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C7195e c7195e5 = new C7195e((C8544e) this.f14702e, interfaceC5083e, 17);
                c7195e5.f14701e = obj;
                return c7195e5;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7195e((C15820e) this.f14701e, (AudioTrack) this.f14702e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7195e((C9438e) this.f14701e, (ArrayList) this.f14702e, interfaceC5083e, 19);
            case 20:
                C7195e c7195e6 = new C7195e((C9438e) this.f14702e, interfaceC5083e, 20);
                c7195e6.f14701e = obj;
                return c7195e6;
            case 21:
                C7195e c7195e7 = new C7195e((Context) this.f14702e, interfaceC5083e, 21);
                c7195e7.f14701e = obj;
                return c7195e7;
            case 22:
                return new C7195e((String) this.f14701e, (VkxArtworkContentProvider) this.f14702e, interfaceC5083e, 22);
            case 23:
                return new C7195e((C1439e) this.f14701e, (C1962e) this.f14702e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C7195e c7195e8 = new C7195e((C11046e) this.f14702e, interfaceC5083e, 24);
                c7195e8.f14701e = obj;
                return c7195e8;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7195e((Function1) this.f14702e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C7195e c7195e9 = new C7195e((AudioTrack) this.f14702e, interfaceC5083e, 26);
                c7195e9.f14701e = obj;
                return c7195e9;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7195e((C8921e) this.f14701e, (WebView) this.f14702e, interfaceC5083e, 27);
            default:
                return new C7195e((C8574e) this.f14701e, (View) this.f14702e, interfaceC5083e, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14700e) {
            case 0:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7195e) advert((InterfaceC5083e) obj2, (C6571e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C7195e) advert((InterfaceC5083e) obj2, obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C7195e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Type inference failed for: r0v41, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eًؗۖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r8v29, types: [android.view.View] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 2248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7195e.loadAd(java.lang.Object):java.lang.Object");
    }
}
