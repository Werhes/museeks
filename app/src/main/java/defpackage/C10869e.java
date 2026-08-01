package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10869e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f21528e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f21529e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21530e;

    public /* synthetic */ C10869e(C11438e c11438e, C3808e c3808e, AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        this.f21530e = 29;
        this.f21529e = c3808e;
        this.f21528e = audioPlaylist;
    }

    public /* synthetic */ C10869e(C13841e c13841e, C16529e c16529e, C9106e c9106e) {
        this.f21530e = 7;
        this.f21529e = c16529e;
        this.f21528e = c9106e;
    }

    public /* synthetic */ C10869e(Object obj, Object obj2, int i) {
        this.f21530e = i;
        this.f21529e = obj;
        this.f21528e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f21530e;
        int i2 = 6;
        int i3 = 8;
        int i4 = 4;
        int i5 = 2;
        int i6 = 5;
        int i7 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i8 = 1;
        Object obj2 = this.f21528e;
        Object obj3 = this.f21529e;
        switch (i) {
            case 0:
                View view = (View) obj2;
                InterfaceC18018e interfaceC18018e = (InterfaceC18018e) obj;
                for (C10985e c10985e : ((C1841e) obj3).purchase) {
                    String str = (String) c10985e.f21742e;
                    boolean booleanValue = ((Boolean) c10985e.f21741e).booleanValue();
                    C1708e c1708e = new C1708e(c10985e, view, objArr3 == true ? 1 : 0);
                    C14501e c14501e = (C14501e) interfaceC18018e;
                    c14501e.ad.add(new C16438e(0, str, booleanValue, new C5163e(c1708e, c14501e.vip, objArr2 == true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            case 1:
                MainArtist mainArtist = (MainArtist) obj2;
                AppActivity appActivity = (AppActivity) ((Context) obj3);
                String str2 = mainArtist.ad;
                if (str2 == null && (str2 = mainArtist.vip) == null) {
                    return Unit.INSTANCE;
                }
                appActivity.isVip(new C5522e(str2));
                appActivity.firebase();
                return Unit.INSTANCE;
            case 2:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                ArrayList license = AbstractC2270e.license((List) obj3, (Function0) ((C9346e) obj2).vip);
                if (license != null) {
                    int size = license.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        C6571e c6571e = (C6571e) license.get(i9);
                        AbstractC2832e abstractC2832e = (AbstractC2832e) c6571e.f13544e;
                        Function0 function0 = (Function0) c6571e.f13543e;
                        AbstractC3698e.adcel(abstractC3698e, abstractC2832e, function0 != null ? ((C11490e) function0.invoke()).ad : 0L);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                C7988e c7988e = (C7988e) obj3;
                C12742e c12742e = (C12742e) c7988e.f16176e;
                C14125e c14125e = C14125e.f27943e;
                ((C17213e) obj).mopub(c12742e.size(), new C6262e(c12742e), new C6262e(i6, c12742e), new C2892e(802480018, true, new C4208e(i4, c12742e, c7988e, (C4993e) obj2)));
                return Unit.INSTANCE;
            case 4:
                C5114e c5114e = (C5114e) obj;
                ((C16089e) obj3).getClass();
                c5114e.m1759e(c5114e.m1758e(AbstractC3820e.ad.vip(XTrackLyrics.class), "id == $0", Arrays.copyOf(new Object[]{C16089e.license((AbstractC16049e) obj2)}, 1)));
                return Unit.INSTANCE;
            case 5:
                C7469e c7469e = (C7469e) obj;
                c7469e.ad(((InterfaceC5372e) obj3).appmetrica(), "key");
                c7469e.ad(((InterfaceC5372e) obj2).appmetrica(), "value");
                return Unit.INSTANCE;
            case 6:
                C12339e c12339e = (C12339e) obj3;
                Function1 function1 = (Function1) obj2;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                if (floatValue != c12339e.license.purchase()) {
                    if (function1 != null) {
                        function1.invoke(f);
                    } else {
                        c12339e.license(floatValue);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                C4395e c4395e = (C4395e) obj;
                C13841e.amazon((C16529e) obj3, (C9106e) obj2, c4395e, 0, c4395e.purchase.ad.ad.f20850e.length());
                return Unit.INSTANCE;
            case 8:
                ((C0106e) obj3).metrica.add(new C1491e((InterfaceC15080e) obj2, obj));
                return Unit.INSTANCE;
            case 9:
                C0106e c0106e = (C0106e) obj2;
                if (((Set) obj3).contains(obj)) {
                    C0583e c0583e = c0106e.vip;
                    C12618e c12618e = c0106e.license;
                    Object billing = c0583e.billing(obj);
                    if (billing != null) {
                        if (billing instanceof C12618e) {
                            C12618e c12618e2 = (C12618e) billing;
                            Object[] objArr7 = c12618e2.vip;
                            long[] jArr = c12618e2.ad;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j = jArr[i10];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((255 & j) < 128) {
                                                c12618e.ad((InterfaceC15080e) objArr7[(i10 << 3) + i12]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i11 != 8) {
                                        }
                                    }
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                        } else {
                            c12618e.ad((InterfaceC15080e) billing);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC9543e interfaceC9543e = (InterfaceC9543e) obj2;
                if (AbstractC7890e.billing((String) obj, ((File) obj3).getName())) {
                    AbstractC17113e.appmetrica(interfaceC9543e, Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 11:
                C8791e c8791e = (C8791e) obj3;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c8791e.license.setValue(c8791e.ad());
                ((Function1) obj2).invoke(bool);
                return Unit.INSTANCE;
            case 12:
                C8791e c8791e2 = (C8791e) obj3;
                c8791e2.appmetrica = (C11192e) obj2;
                return new C6035e(14, c8791e2);
            case 13:
                C2921e c2921e = (C2921e) obj3;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(169113381, true, new C7390e(c2921e, i5)), 3);
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) ((InterfaceC16132e) obj2).getValue();
                int i13 = C1409e.f4221e;
                c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), new C6262e(interfaceC8346e, 13), new C6262e(14, interfaceC8346e), new C2892e(802480018, true, new C4290e(interfaceC8346e, c2921e, 15)));
                return Unit.INSTANCE;
            case 14:
                C3861e c3861e = (C3861e) obj3;
                NewsfeedList newsfeedList = (NewsfeedList) obj2;
                c3861e.f8697e = Integer.valueOf(newsfeedList.ad);
                c3861e.f8696e = newsfeedList.vip;
                c3861e.mo1388instanceof();
                return Unit.INSTANCE;
            case 15:
                C12742e c12742e2 = (C12742e) obj3;
                ((C17213e) obj).mopub(c12742e2.size(), null, new C6262e(16, c12742e2), new C2892e(802480018, true, new C4290e(c12742e2, (Function1) obj2, 17)));
                return Unit.INSTANCE;
            case 16:
                C7246e c7246e = (C7246e) obj3;
                AbstractC2832e abstractC2832e2 = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                if (c7246e.f14803e) {
                    float f2 = c7246e.f14804e;
                    abstractC3698e2.getClass();
                    AbstractC3698e.advert(abstractC3698e2, abstractC2832e2, AbstractC4653e.ad(abstractC3698e2, f2), AbstractC4653e.ad(abstractC3698e2, c7246e.f14805e));
                } else {
                    float f3 = c7246e.f14804e;
                    abstractC3698e2.getClass();
                    abstractC3698e2.billing(abstractC2832e2, AbstractC4653e.ad(abstractC3698e2, f3), AbstractC4653e.ad(abstractC3698e2, c7246e.f14805e), 0.0f);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C10762e c10762e = (C10762e) obj3;
                AbstractC2832e abstractC2832e3 = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e3 = (AbstractC3698e) obj;
                long j2 = ((C11490e) c10762e.f21184e.invoke(abstractC3698e3)).ad;
                if (c10762e.f21185e) {
                    AbstractC3698e.smaato(abstractC3698e3, abstractC2832e3, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                } else {
                    AbstractC3698e.Signature(abstractC3698e3, abstractC2832e3, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C17213e) obj).mopub(EnumC2646e.f6520e.subs(), null, new C3801e(5), new C2892e(802480018, true, new C4290e((C8510e) obj3, (InterfaceC16132e) obj2, 18)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6123e c6123e = (C6123e) obj3;
                C14873e c14873e = (C14873e) obj2;
                C17213e c17213e2 = (C17213e) obj;
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(-790719172, true, new C17630e(c14873e, c6123e, 27)), 3);
                String str3 = c6123e.ad.crashlytics;
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                if (str3.length() > 0) {
                    AbstractC5087e.premium(c17213e2, "cell:Description", null, new C2892e(-1276733311, true, new C17871e(9, c6123e)), 2);
                }
                AbstractC5087e.m1741abstract(c17213e2, new C2892e(-1862981712, true, new C8035e(i3, c14873e)), 2);
                C12742e c12742e3 = c14873e.f29451e;
                c17213e2.mopub(c12742e3.size(), new C17874e(new C17706e(i6), c12742e3, 17), new C6262e(22, c12742e3), new C2892e(2039820996, true, new C4208e(i2, c12742e3, c14873e, c6123e)));
                return Unit.INSTANCE;
            case 20:
                ((Function0) obj3).invoke();
                ((InterfaceC0850e) obj).ad(3);
                ((C8212e) ((InterfaceC16054e) obj2)).vip(8, true, true);
                return Unit.INSTANCE;
            case 21:
                C15755e c15755e = (C15755e) obj3;
                AbstractC2832e abstractC2832e4 = (AbstractC2832e) obj2;
                AbstractC3698e abstractC3698e4 = (AbstractC3698e) obj;
                if (c15755e.f31029e) {
                    float f4 = c15755e.f31027e;
                    abstractC3698e4.getClass();
                    AbstractC3698e.advert(abstractC3698e4, abstractC2832e4, AbstractC4653e.ad(abstractC3698e4, f4), AbstractC4653e.ad(abstractC3698e4, c15755e.f31028e));
                } else {
                    float f5 = c15755e.f31027e;
                    abstractC3698e4.getClass();
                    abstractC3698e4.billing(abstractC2832e4, AbstractC4653e.ad(abstractC3698e4, f5), AbstractC4653e.ad(abstractC3698e4, c15755e.f31028e), 0.0f);
                }
                return Unit.INSTANCE;
            case 22:
                Function2 function2 = (Function2) obj3;
                Integer valueOf = Integer.valueOf(((C5492e) obj).ad);
                C14870e c14870e = (C14870e) ((C12894e) obj2).f25750e;
                function2.invoke(valueOf, Integer.valueOf((c14870e != null ? c14870e : null).vip));
                return Unit.INSTANCE;
            case 23:
                AbstractC3698e abstractC3698e5 = (AbstractC3698e) obj;
                C2191e c2191e = new C2191e(i5, (ArrayList) obj2);
                abstractC3698e5.f8274e = true;
                c2191e.invoke(abstractC3698e5);
                abstractC3698e5.f8274e = false;
                ((InterfaceC3314e) obj3).getValue();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC0003e abstractC0003e = (AbstractC0003e) obj3;
                InterfaceC12179e interfaceC12179e = (InterfaceC12179e) obj2;
                abstractC0003e.ad(interfaceC12179e);
                return new C15302e(abstractC0003e, interfaceC12179e, i4);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14564e c14564e = (C14564e) obj3;
                C17213e c17213e3 = (C17213e) obj;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-1016686337, true, new C12471e(c14564e, i7)), 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(222726070, true, new C10452e(c14564e, (InterfaceC16132e) obj2, i8)), 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(300847159, true, new C12471e(c14564e, i4)), 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(378968248, true, new C12471e(c14564e, i6)), 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(457089337, true, new C12471e(c14564e, objArr4 == true ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AudioTrack audioTrack = (AudioTrack) obj;
                List list = ((C11268e) obj3).f11959e.purchase;
                AppActivity appActivity2 = (AppActivity) ((C16341e) obj2).pro();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC6914e.purchase((AudioTrack) it.next()));
                }
                C18231e c18231e = new C18231e(arrayList);
                String purchase = AbstractC6914e.purchase(audioTrack);
                AbstractC13201e.metrica(appActivity2, c18231e, new C0086e(purchase != null ? new C1703e(purchase) : C2406e.ad, 0L, list, false, false, false, 122));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C7184e c7184e = (C7184e) obj3;
                C10381e c10381e = (C10381e) obj2;
                c7184e.ad(c10381e);
                return new C15302e(c7184e, c10381e, i6);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C9261e c9261e = (C9261e) obj3;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj2;
                C17213e c17213e4 = (C17213e) obj;
                C12742e c12742e4 = c9261e.f18474e;
                c17213e4.mopub(c12742e4.size(), null, new C7976e(c12742e4, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0), new C2892e(802480018, true, new C4290e(c12742e4, c9261e, 21)));
                if (((Boolean) c9261e.f18469e.getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e4, null, null, new C2892e(-808489745, true, new C11828e(c9261e, interfaceC16132e, i2)), 3);
                }
                return Unit.INSTANCE;
            default:
                AbstractC16519e.vip((AppActivity) ((Activity) ((C3808e) obj3).f8437e.getContext()), new C8086e((AudioPlaylist) obj2, (AudioTrack) obj, objArr == true ? 1 : 0, 25));
                return Unit.INSTANCE;
        }
    }
}
