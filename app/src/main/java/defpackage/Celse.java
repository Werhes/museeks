package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Range;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: else, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class Celse implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f1121e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f1122e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1123e;

    public /* synthetic */ Celse(Object obj, Object obj2, int i) {
        this.f1123e = i;
        this.f1122e = obj;
        this.f1121e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eًٍۘ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.text.SpannableString] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        C12916e c12916e;
        C10566e c10566e;
        int i2 = this.f1123e;
        List list = C13664e.f27089e;
        Catalog2Button catalog2Button = null;
        r5 = null;
        r5 = null;
        Range range = null;
        ?? r7 = 0;
        Object obj = this.f1121e;
        Object obj2 = this.f1122e;
        switch (i2) {
            case 0:
                Cpublic cpublic = (Cpublic) obj2;
                C16330e c16330e = (C16330e) obj;
                c16330e.startapp(c16330e.purchase() + 1);
                if (c16330e.purchase() == 5) {
                    c16330e.startapp(0);
                    if (((Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue()).booleanValue()) {
                        cpublic.m2514goto(new AbstractC10347e(0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C13621e c13621e = (C13621e) obj2;
                float purchase = ((C2616e) obj).purchase();
                C2038e c2038e = c13621e.ad;
                C7838e c7838e = VKXApplication.f36530e;
                r5 = c7838e != null ? c7838e : 0;
                r5.getClass();
                c2038e.startapp.setValue(C13177e.ad(c2038e.startapp(), (int) purchase, purchase / (c2038e.startapp().vip < 1 ? 1 : r4)));
                c13621e.license.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                String str = ((C10594e) ((C15052e) obj).f29820e.getValue()).vip;
                C10566e c10566e2 = new C10566e(str);
                ClipboardManager ad = ((C16615e) ((InterfaceC16879e) obj2)).ad();
                List list2 = c10566e2.f20849e;
                if (!(list2 == null ? list : list2).isEmpty()) {
                    ?? spannableString = new SpannableString(str);
                    C12916e c12916e2 = new C12916e(11, (boolean) r7);
                    c12916e2.f25784e = Parcel.obtain();
                    if (list2 != null) {
                        list = list2;
                    }
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        C9363e c9363e = (C9363e) list.get(i3);
                        C4282e c4282e = (C4282e) c9363e.ad;
                        int i4 = c9363e.vip;
                        int i5 = c9363e.metrica;
                        ((Parcel) c12916e2.f25784e).recycle();
                        c12916e2.f25784e = Parcel.obtain();
                        InterfaceC16522e interfaceC16522e = c4282e.ad;
                        ClipboardManager clipboardManager = ad;
                        long j = c4282e.advert;
                        int i6 = i3;
                        long j2 = c4282e.yandex;
                        List list3 = list;
                        long j3 = c4282e.vip;
                        C12916e c12916e3 = c12916e2;
                        long vip = interfaceC16522e.vip();
                        long j4 = C3618e.adcel;
                        if (C3618e.metrica(vip, j4)) {
                            i = size;
                            c12916e = c12916e3;
                        } else {
                            c12916e = c12916e3;
                            c12916e.remoteconfig((byte) 1);
                            i = size;
                            c12916e.isVip(c4282e.ad.vip());
                        }
                        long j5 = C12973e.metrica;
                        byte b = 2;
                        if (!C12973e.ad(j3, j5)) {
                            c12916e.remoteconfig((byte) 2);
                            c12916e.tapsense(j3);
                        }
                        C1812e c1812e = c4282e.metrica;
                        if (c1812e != null) {
                            c12916e.remoteconfig((byte) 3);
                            ((Parcel) c12916e.f25784e).writeInt(c1812e.f4894e);
                        }
                        C6277e c6277e = c4282e.license;
                        if (c6277e != null) {
                            int i7 = c6277e.ad;
                            c12916e.remoteconfig((byte) 4);
                            c12916e.remoteconfig((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
                        }
                        C5208e c5208e = c4282e.appmetrica;
                        if (c5208e != null) {
                            int i8 = c5208e.ad;
                            c12916e.remoteconfig((byte) 5);
                            if (i8 != 0) {
                                if (i8 == 65535) {
                                    b = 1;
                                } else if (i8 != 1) {
                                    if (i8 == 2) {
                                        b = 3;
                                    }
                                }
                                c12916e.remoteconfig(b);
                            }
                            b = 0;
                            c12916e.remoteconfig(b);
                        }
                        String str2 = c4282e.billing;
                        if (str2 != null) {
                            c12916e.remoteconfig((byte) 6);
                            ((Parcel) c12916e.f25784e).writeString(str2);
                        }
                        if (!C12973e.ad(j2, j5)) {
                            c12916e.remoteconfig((byte) 7);
                            c12916e.tapsense(j2);
                        }
                        C8065e c8065e = c4282e.startapp;
                        if (c8065e != null) {
                            float f = c8065e.ad;
                            c12916e.remoteconfig((byte) 8);
                            c12916e.signatures(f);
                        }
                        C3759e c3759e = c4282e.adcel;
                        if (c3759e != null) {
                            c12916e.remoteconfig((byte) 9);
                            c12916e.signatures(c3759e.ad);
                            c12916e.signatures(c3759e.vip);
                        }
                        if (!C3618e.metrica(j, j4)) {
                            c12916e.remoteconfig((byte) 10);
                            c12916e.isVip(j);
                        }
                        C11964e c11964e = c4282e.smaato;
                        if (c11964e != null) {
                            c12916e.remoteconfig((byte) 11);
                            ((Parcel) c12916e.f25784e).writeInt(c11964e.ad);
                        }
                        C13973e c13973e = c4282e.amazon;
                        if (c13973e != null) {
                            c12916e.remoteconfig((byte) 12);
                            c12916e.isVip(c13973e.ad);
                            long j6 = c13973e.vip;
                            c12916e.signatures(Float.intBitsToFloat((int) (j6 >> 32)));
                            c12916e.signatures(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                            c12916e.signatures(c13973e.metrica);
                        }
                        spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c12916e.f25784e).marshall(), 0)), i4, i5, 33);
                        i3 = i6 + 1;
                        c12916e2 = c12916e;
                        size = i;
                        ad = clipboardManager;
                        list = list3;
                    }
                    str = spannableString;
                }
                ad.setPrimaryClip(ClipData.newPlainText("plain text", str));
                return Unit.INSTANCE;
            case 3:
                ((C13749e) obj2).invoke((C15458e) obj);
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) obj2;
                C15076e c15076e = (C15076e) obj;
                if (context instanceof AppActivity) {
                    C9402e.ad((AppActivity) context, c15076e);
                } else {
                    Toast.makeText(context, c15076e.vip, 1).show();
                }
                return Unit.INSTANCE;
            case 5:
                Range[] rangeArr = (Range[]) ((C9000e) ((InterfaceC2531e) obj2)).metrica(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                ((AeFpsRangeLegacyQuirk) obj).getClass();
                if (rangeArr != null && rangeArr.length != 0) {
                    int length = rangeArr.length;
                    while (r7 < length) {
                        Range range2 = rangeArr[r7];
                        Integer num = (Integer) range2.getUpper();
                        Integer num2 = (Integer) range2.getLower();
                        if (((Number) range2.getUpper()).intValue() >= 1000) {
                            num = Integer.valueOf(((Number) range2.getUpper()).intValue() / 1000);
                        }
                        if (((Number) range2.getLower()).intValue() >= 1000) {
                            num2 = Integer.valueOf(((Number) range2.getLower()).intValue() / 1000);
                        }
                        Range range3 = new Range(num2, num);
                        Integer num3 = (Integer) range3.getUpper();
                        if (num3 != null && num3.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                            range = range3;
                        }
                        r7++;
                    }
                }
                return range;
            case 6:
                ((C4246e) obj2).f9318e = ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 7:
                ((InterfaceC0888e) obj2).amazon(obj);
                return Unit.INSTANCE;
            case 8:
                return C10472e.vip((C10472e) obj2, (C9302e) obj);
            case 9:
                C10685e c10685e = (C10685e) obj2;
                if (((Boolean) ((InterfaceC16132e) obj).getValue()).booleanValue()) {
                    c10685e.m2514goto(new AbstractC10347e(0));
                } else {
                    new C9745e().signatures(c10685e.pro());
                }
                return Unit.INSTANCE;
            case 10:
                AbstractC5336e.purchase((InterfaceC18435e) obj2, null, 0, new C16350e((InterfaceC3314e) obj, r5, r7), 3);
                return Unit.INSTANCE;
            case 11:
                ((C14398e) obj2).f28474e.setValue(Boolean.FALSE);
                C1158e c1158e = C1158e.f3743e;
                ((InterfaceC3314e) obj).setValue(C1158e.yandex());
                return Unit.INSTANCE;
            case 12:
                C3739e c3739e = (C3739e) obj2;
                Context context2 = ((C11204e) obj).f22469e.getContext();
                InterfaceC8370e interfaceC8370e = c3739e.f8327e;
                List metrica = c3739e.f8326e.getMetrica();
                if (metrica != null) {
                    list = metrica;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (((Catalog2Button) next).ad instanceof C8799e) {
                            catalog2Button = next;
                        }
                    }
                }
                Catalog2Button catalog2Button2 = catalog2Button;
                if (catalog2Button2 != null) {
                    AbstractC0223e.startapp(context2, interfaceC8370e, catalog2Button2);
                }
                return Unit.INSTANCE;
            case 13:
                C5658e.ad.vip(((AudioSnippetEntry) obj2).license);
                ((C1718e) obj).m680import();
                return Unit.INSTANCE;
            case 14:
                EnumC12505e enumC12505e = (EnumC12505e) obj2;
                C7888e c7888e = (C7888e) obj;
                C15409e.ad.getClass();
                C15409e.signatures.vip(enumC12505e);
                c7888e.f15965e.setValue(enumC12505e);
                c7888e.f15963e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                ((C5906e) obj2).f12466e = (Function0) obj;
                return Unit.INSTANCE;
            case 16:
                C10127e c10127e = (C10127e) obj2;
                C4017e c4017e = (C4017e) obj;
                c10127e.f20031e = c10127e.f20025e.ad(c4017e.f8940e.f28537e.m4560try(), c4017e.getLayoutDirection(), c4017e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0398e c0398e = (C0398e) obj2;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj;
                if (!C12347e.metrica(c0398e.vip, ((C0398e) interfaceC3314e.getValue()).vip) || !AbstractC7890e.billing(c0398e.metrica, ((C0398e) interfaceC3314e.getValue()).metrica)) {
                    interfaceC3314e.setValue(c0398e);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C2809e c2809e = (C2809e) obj2;
                C10566e c10566e3 = (C10566e) obj;
                if (c2809e == null) {
                    return c10566e3;
                }
                C12742e c12742e = c2809e.metrica;
                if (c12742e.isEmpty()) {
                    c10566e = c2809e.vip;
                } else {
                    C0694e c0694e = new C0694e(c2809e.vip);
                    int size2 = c12742e.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        ((Function1) c12742e.get(i9)).invoke(c0694e);
                    }
                    c10566e = c0694e.vip;
                }
                c2809e.vip = c10566e;
                return c10566e == null ? c10566e3 : c10566e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC5336e.purchase((InterfaceC18435e) obj2, null, 0, new C9863e((C6540e) obj, r5, r7), 3);
                return Boolean.TRUE;
            case 20:
                try {
                    ((FrameLayout) ((C10279e) obj2).ad.f36547e.f10515e).removeView((View) obj);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 21:
                return AbstractC2223e.appmetrica((InterfaceC5372e) obj, (C8633e) obj2);
            case 22:
                CachedPlaylist cachedPlaylist = (CachedPlaylist) obj;
                ((C15435e) obj2).m2514goto(new C14873e(cachedPlaylist.metrica(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.inmobi(), null, null, 110)));
                return Unit.INSTANCE;
            case 23:
                ((CameraManager) obj2).unregisterAvailabilityCallback((C13404e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C14246e) obj2).f28158e.unregisterAvailabilityCallback((C11755e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((CameraManager) obj2).unregisterAvailabilityCallback((C11755e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C13314e) obj).getClass();
                ((Function1) obj2).invoke(C11747e.ad);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Function1) obj2).invoke(((C4341e) obj).license);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Function1) obj2).invoke(((C16641e) obj).license);
                return Unit.INSTANCE;
            default:
                return new C11028e((C8181e) ((C5671e) obj2).invoke(), (Function2) obj);
        }
    }
}
