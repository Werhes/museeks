package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassifier;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8086e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16435e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f16436e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f16437e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f16438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8086e(TextClassifier textClassifier, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16435e = 8;
        this.f16437e = textClassifier;
        this.f16436e = (AbstractC7185e) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8086e(C18464e c18464e, Object obj, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16435e = 22;
        this.f16436e = c18464e;
        this.f16437e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8086e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16435e = i;
        this.f16436e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8086e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16435e = i;
        this.f16437e = obj;
        this.f16436e = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16435e) {
            case 0:
                C8086e c8086e = new C8086e((AbstractC14601e) this.f16436e, interfaceC5083e, 0);
                c8086e.f16437e = obj;
                return c8086e;
            case 1:
                return new C8086e((Context) this.f16437e, (C8436e) this.f16436e, interfaceC5083e, 1);
            case 2:
                return new C8086e((C11235e) this.f16437e, (C8510e) this.f16436e, interfaceC5083e, 2);
            case 3:
                return new C8086e((C9042e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 3);
            case 4:
                C8086e c8086e2 = new C8086e((C9042e) this.f16436e, interfaceC5083e, 4);
                c8086e2.f16437e = obj;
                return c8086e2;
            case 5:
                return new C8086e((C10590e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 5);
            case 6:
                C8086e c8086e3 = new C8086e((C10590e) this.f16436e, interfaceC5083e, 6);
                c8086e3.f16437e = obj;
                return c8086e3;
            case 7:
                return new C8086e((AudioPlaylist) this.f16437e, (C14873e) this.f16436e, interfaceC5083e, 7);
            case 8:
                return new C8086e((TextClassifier) this.f16437e, (Function2) this.f16436e, interfaceC5083e);
            case 9:
                return new C8086e((AbstractC16904e) this.f16437e, (AbstractC16904e) this.f16436e, interfaceC5083e, 9);
            case 10:
                return new C8086e((C7838e) this.f16437e, (C14609e) this.f16436e, interfaceC5083e, 10);
            case 11:
                return new C8086e((C4397e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 11);
            case 12:
                C8086e c8086e4 = new C8086e((C4397e) this.f16436e, interfaceC5083e, 12);
                c8086e4.f16437e = obj;
                return c8086e4;
            case 13:
                return new C8086e((C4397e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 13);
            case 14:
                C8086e c8086e5 = new C8086e((C4397e) this.f16436e, interfaceC5083e, 14);
                c8086e5.f16437e = obj;
                return c8086e5;
            case 15:
                return new C8086e((C10954e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 15);
            case 16:
                C8086e c8086e6 = new C8086e((C10954e) this.f16436e, interfaceC5083e, 16);
                c8086e6.f16437e = obj;
                return c8086e6;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C8086e((C14641e) this.f16437e, (InterfaceC16671e) this.f16436e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8086e c8086e7 = new C8086e((C14641e) this.f16436e, interfaceC5083e, 18);
                c8086e7.f16437e = obj;
                return c8086e7;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C8086e c8086e8 = new C8086e((PlaybackService) this.f16436e, interfaceC5083e, 19);
                c8086e8.f16437e = obj;
                return c8086e8;
            case 20:
                return new C8086e((C9261e) this.f16437e, (InterfaceC16132e) this.f16436e, interfaceC5083e, 20);
            case 21:
                C8086e c8086e9 = new C8086e((C15682e) this.f16436e, interfaceC5083e, 21);
                c8086e9.f16437e = obj;
                return c8086e9;
            case 22:
                return new C8086e((C18464e) this.f16436e, this.f16437e, interfaceC5083e);
            case 23:
                return new C8086e((Function2) this.f16437e, (C5769e) this.f16436e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C8086e((AudioTrack) this.f16437e, (C17532e) this.f16436e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C8086e((AudioPlaylist) this.f16437e, (AudioTrack) this.f16436e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C8086e c8086e10 = new C8086e((C17008e) this.f16436e, interfaceC5083e, 26);
                c8086e10.f16437e = obj;
                return c8086e10;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8086e c8086e11 = new C8086e((C0302e) this.f16436e, interfaceC5083e, 27);
                c8086e11.f16437e = obj;
                return c8086e11;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C8086e((C2347e) this.f16437e, (String) this.f16436e, interfaceC5083e, 28);
            default:
                return new C8086e((C15208e) this.f16437e, (C10469e) this.f16436e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16435e) {
            case 0:
                return ((C8086e) advert((InterfaceC5083e) obj2, (C9248e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (C3230e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C8086e) advert((InterfaceC5083e) obj2, (AbstractC2799e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (JSONObject) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Type inference failed for: r12v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.recyclerview.widget.startapp] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v10, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8086e.loadAd(java.lang.Object):java.lang.Object");
    }
}
