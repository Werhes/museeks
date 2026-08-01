package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.samsung.android.app.musiclibrary.ui.widget.TransitionView;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12439e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f24902e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f24903e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24904e;

    public /* synthetic */ C12439e(AbstractC9357e abstractC9357e, C3967e c3967e, WritableByteChannel writableByteChannel) {
        this.f24904e = 22;
        this.f24903e = c3967e;
        this.f24902e = writableByteChannel;
    }

    public /* synthetic */ C12439e(Object obj, Object obj2, int i) {
        this.f24904e = i;
        this.f24903e = obj;
        this.f24902e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30, types: [eٖۧۜ, eَۖۤ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Executor executorC14324e;
        C17856e purchase;
        C10697e c10697e;
        int i = 4;
        final int i2 = 2;
        int i3 = 3;
        int i4 = 0;
        switch (this.f24904e) {
            case 0:
                C13621e c13621e = (C13621e) this.f24903e;
                ((C2616e) this.f24902e).startapp(((Float) obj).floatValue());
                c13621e.license.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                C13621e c13621e2 = (C13621e) this.f24903e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f24902e;
                TransitionView transitionView = new TransitionView((Context) obj);
                C14314e c14314e = (C14314e) interfaceC3314e.getValue();
                if (c14314e != null) {
                    Activity activity = c14314e.f28306e;
                    if (activity instanceof AbstractActivityC15824e) {
                        c14314e.onDestroy((AbstractActivityC15824e) activity);
                    }
                }
                C14314e c14314e2 = new C14314e(c13621e2.ad.ad, transitionView);
                C5008e c5008e = c14314e2.f28310e;
                if (c5008e != null && !c5008e.license) {
                    c5008e.license = true;
                    if (c5008e.appmetrica) {
                        ((ValueAnimator) c5008e.purchase.yandex()).resume();
                    }
                }
                interfaceC3314e.setValue(c14314e2);
                return transitionView;
            case 2:
                C13621e c13621e3 = (C13621e) this.f24903e;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f24902e;
                EnumC13413e enumC13413e = (EnumC13413e) obj;
                if (enumC13413e == null || enumC13413e == EnumC13413e.f26666e || enumC13413e == EnumC13413e.f26664e || ((Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue()).booleanValue()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13301e(c13621e3, enumC13413e, null == true ? 1 : 0, 0), 3);
                } else {
                    new C9745e().signatures(c13621e3.ad.ad);
                }
                return Unit.INSTANCE;
            case 3:
                ((C15274e) this.f24903e).vip((C1867e) this.f24902e);
                return Unit.INSTANCE;
            case 4:
                C15566e c15566e = (C15566e) this.f24903e;
                C6399e c6399e = (C6399e) this.f24902e;
                C15566e c15566e2 = ((C1372e) obj).ad;
                return Boolean.valueOf(AbstractC7890e.billing(c15566e2.f30734e, c15566e.f30734e) && AbstractC17181e.admob(c15566e2, c6399e));
            case 5:
                C9570e c9570e = (C9570e) this.f24903e;
                C5624e c5624e = (C5624e) this.f24902e;
                long adcel = C2152e.adcel((AbstractC5851e.mopub(c9570e).f27610e == EnumC7792e.f15793e && c9570e.f19005e == EnumC17426e.f34145e) ? -1.0f : 1.0f, ((C0119e) obj).ad);
                c5624e.ad(c9570e.f19003e.adcel(Float.intBitsToFloat((int) (c9570e.f19005e == EnumC17426e.f34146e ? adcel & 4294967295L : adcel >> 32))), 0.0f);
                return Unit.INSTANCE;
            case 6:
                AbstractC5336e.purchase((InterfaceC18435e) this.f24903e, null, 0, new C13575e(((Boolean) obj).booleanValue(), this.f24902e, (InterfaceC5083e) (null == true ? 1 : 0), 0), 3);
                return Unit.INSTANCE;
            case 7:
                EnumC6916e enumC6916e = (EnumC6916e) this.f24903e;
                Function0 function0 = (Function0) this.f24902e;
                if (!((Boolean) obj).booleanValue() && !enumC6916e.f14178e) {
                    return Unit.INSTANCE;
                }
                VKXApplication vKXApplication = VKXApplication.f36528e;
                VKXApplication vKXApplication2 = vKXApplication != null ? vKXApplication : null;
                EnumC6916e[] values = EnumC6916e.values();
                int length = values.length;
                for (int i5 = 0; i5 < length; i5++) {
                    EnumC6916e enumC6916e2 = values[i5];
                    vKXApplication2.getPackageManager().setComponentEnabledSetting(AbstractC1535e.vip(vKXApplication2, enumC6916e2), enumC6916e2 == enumC6916e ? 1 : 2, 1);
                }
                function0.invoke();
                return Unit.INSTANCE;
            case 8:
                CatalogArtist catalogArtist = (CatalogArtist) this.f24903e;
                C5522e c5522e = (C5522e) this.f24902e;
                new C3566e(new C5891e(catalogArtist, new Cvolatile(0, c5522e, C5522e.class, "callForceRefresh", "callForceRefresh()V", 0, 0, 24), 22)).signatures(c5522e.pro());
                return Unit.INSTANCE;
            case 9:
                final C2479e c2479e = (C2479e) this.f24903e;
                final View view = (View) this.f24902e;
                InterfaceC18018e interfaceC18018e = (InterfaceC18018e) obj;
                final int i6 = 0;
                ((C14501e) interfaceC18018e).ad(R.string.bs_header_cache, R.drawable.ic_download_outline_28, new Function0() { // from class: eًؓۛ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                C2479e c2479e2 = c2479e;
                                new C8054e(C4130e.ad, new VKProfile(c2479e2.appmetrica, null, null, c2479e2.purchase, c2479e2.billing, null, null, 102)).signatures(C1059e.billing(view.getContext()));
                                return Unit.INSTANCE;
                            default:
                                C2479e c2479e3 = c2479e;
                                new C8054e(C8817e.ad, new VKProfile(c2479e3.appmetrica, null, null, c2479e3.purchase, c2479e3.billing, null, null, 102)).signatures(C1059e.billing(view.getContext()));
                                return Unit.INSTANCE;
                        }
                    }
                });
                final char c = 1 == true ? 1 : 0;
                ((C14501e) interfaceC18018e).ad(R.string.action_audio_dl, R.drawable.ic_download_cloud_outline_28, new Function0() { // from class: eًؓۛ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (c) {
                            case 0:
                                C2479e c2479e2 = c2479e;
                                new C8054e(C4130e.ad, new VKProfile(c2479e2.appmetrica, null, null, c2479e2.purchase, c2479e2.billing, null, null, 102)).signatures(C1059e.billing(view.getContext()));
                                return Unit.INSTANCE;
                            default:
                                C2479e c2479e3 = c2479e;
                                new C8054e(C8817e.ad, new VKProfile(c2479e3.appmetrica, null, null, c2479e3.purchase, c2479e3.billing, null, null, 102)).signatures(C1059e.billing(view.getContext()));
                                return Unit.INSTANCE;
                        }
                    }
                });
                return Unit.INSTANCE;
            case 10:
                C14794e c14794e = (C14794e) this.f24903e;
                C0571e c0571e = (C0571e) this.f24902e;
                C10097e c10097e = c14794e.f29316e;
                if (c10097e != null) {
                    c10097e.vip();
                }
                c14794e.f29316e = null;
                C8823e c8823e = c0571e.f2750e;
                if (c8823e != null) {
                    c8823e.m2175import(Unit.INSTANCE);
                }
                c0571e.f2750e = null;
                return Unit.INSTANCE;
            case 11:
                C7184e c7184e = (C7184e) this.f24903e;
                C5906e c5906e = (C5906e) this.f24902e;
                c7184e.ad(c5906e);
                return new C15302e(c7184e, c5906e, null == true ? 1 : 0);
            case 12:
                C14033e c14033e = (C14033e) this.f24903e;
                C11223e c11223e = (C11223e) this.f24902e;
                C5033e c5033e = (C5033e) obj;
                C13886e c13886e = c5033e.f25995e;
                C13886e c13886e2 = c5033e.f25996e;
                if (!c14033e.ad) {
                    TimeZone timeZone = AbstractC0187e.ad;
                    c14033e.vip = System.currentTimeMillis();
                }
                c13886e.smaato(c11223e.f22482e);
                c13886e2.smaato(c11223e.f22481e);
                InterfaceC4911e interfaceC4911e = AbstractC17802e.ad;
                C3079e c3079e = C13886e.f27542e;
                c13886e.mopub(c3079e, new C1053e(i3, i2, (InterfaceC5083e) (null == true ? 1 : 0)));
                C3079e c3079e2 = new C3079e("AfterTransform");
                c13886e.startapp(c3079e, c3079e2);
                c13886e.mopub(c3079e2, new C16895e(i3, i, null == true ? 1 : 0));
                C3079e c3079e3 = C13886e.f27517e;
                c13886e2.mopub(c3079e3, new C16895e(i3, i3, null == true ? 1 : 0));
                c5033e.mopub(C13065e.f25993e, new C9878e(i3, 0, null == true ? 1 : 0));
                c5033e.mopub(C13065e.f25990e, new C9878e(i3, 1 == true ? 1 : 0, null == true ? 1 : 0));
                c5033e.mopub(C13065e.f25991e, new C9878e(i3, i2, null == true ? 1 : 0));
                C3079e c3079e4 = new C3079e("BodyTransformationCheckPostRender");
                c13886e2.startapp(c3079e3, c3079e4);
                c13886e2.mopub(c3079e4, new C16895e(i3, 0, null == true ? 1 : 0));
                return Unit.INSTANCE;
            case 13:
                C14033e c14033e2 = (C14033e) this.f24903e;
                InterfaceC4911e interfaceC4911e2 = (InterfaceC4911e) ((C11467e) this.f24902e).f23070e;
                TimeZone timeZone2 = AbstractC0187e.ad;
                double currentTimeMillis = (System.currentTimeMillis() - c14033e2.vip) / 1000.0d;
                if (c14033e2.ad) {
                    interfaceC4911e2.mopub("Application started in " + currentTimeMillis + " seconds.");
                    c14033e2.ad = false;
                } else {
                    interfaceC4911e2.mopub("Application auto-reloaded in " + currentTimeMillis + " seconds.");
                }
                return Unit.INSTANCE;
            case 14:
                C11334e c11334e = (C11334e) this.f24903e;
                C10274e c10274e = (C10274e) this.f24902e;
                c11334e.ad.registerContentObserver(Settings.System.getUriFor("show_password"), false, c10274e);
                return new C15302e(c11334e, c10274e, 1 == true ? 1 : 0);
            case 15:
                C0398e c0398e = (C0398e) this.f24903e;
                Function1 function1 = (Function1) this.f24902e;
                C0398e c0398e2 = (C0398e) obj;
                if (!AbstractC7890e.billing(c0398e, c0398e2)) {
                    function1.invoke(c0398e2);
                }
                return Unit.INSTANCE;
            case 16:
                C10810e c10810e = (C10810e) this.f24903e;
                AbstractC4457e abstractC4457e = (AbstractC4457e) this.f24902e;
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                AbstractC4653e.admob(interfaceC2235e, c10810e.metrica, 0L, 0L, 0.0f, null, null, c10810e.vip, 62);
                AbstractC4653e.admob(interfaceC2235e, abstractC4457e, 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C17689e) this.f24903e).invoke((InterfaceC2235e) obj, (C16446e) this.f24902e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C17985e c17985e = (C17985e) this.f24903e;
                AbstractC4457e abstractC4457e2 = (AbstractC4457e) this.f24902e;
                C4017e c4017e = (C4017e) obj;
                c4017e.ad();
                AbstractC4653e.loadAd(c4017e, c17985e, abstractC4457e2, 0.0f, null, null, 0, 60);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10435e c10435e = (C10435e) this.f24903e;
                AbstractC4457e abstractC4457e3 = (AbstractC4457e) this.f24902e;
                C4017e c4017e2 = (C4017e) obj;
                c4017e2.ad();
                AbstractC4653e.loadAd(c4017e2, c10435e.appmetrica, abstractC4457e3, 0.0f, null, null, 0, 60);
                return Unit.INSTANCE;
            case 20:
                ((C12431e) ((C5389e) this.f24903e).f11540e).smaato((C8735e) this.f24902e);
                return Unit.INSTANCE;
            case 21:
                ((C3967e) this.f24903e).f8852e = ((ReadableByteChannel) this.f24902e).read((ByteBuffer) obj);
                return Unit.INSTANCE;
            case 22:
                C3967e c3967e = (C3967e) this.f24903e;
                WritableByteChannel writableByteChannel = (WritableByteChannel) this.f24902e;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                while (byteBuffer.hasRemaining()) {
                    do {
                        c3967e.f8852e = writableByteChannel.write(byteBuffer);
                        if (byteBuffer.hasRemaining()) {
                        }
                    } while (c3967e.f8852e > 0);
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) this.f24903e;
                ((C17213e) obj).mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new Cfor(interfaceC8346e, 12, false), new C2892e(802480018, true, new C4290e(interfaceC8346e, (C15435e) this.f24902e, 1 == true ? 1 : 0)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f24903e;
                final C15435e c15435e = (C15435e) this.f24902e;
                C17213e c17213e = (C17213e) obj;
                if (!((C2765e) interfaceC16132e.getValue()).metrica.isEmpty()) {
                    final int i7 = 0;
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(1372687529, true, new Function3() { // from class: eٍؙٚ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = i7;
                            C13770e c13770e = (C13770e) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i8) {
                                case 0:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_playlists), null, c13770e, 0, 2);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_title), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_artist), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-270407072, true, new C17672e(c15435e, interfaceC16132e, 1 == true ? 1 : 0)), 3);
                }
                if (!((C2765e) interfaceC16132e.getValue()).ad.isEmpty()) {
                    final char c2 = 1 == true ? 1 : 0;
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1371547552, true, new Function3() { // from class: eٍؙٚ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = c2;
                            C13770e c13770e = (C13770e) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i8) {
                                case 0:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_playlists), null, c13770e, 0, 2);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_title), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_artist), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                    InterfaceC8346e interfaceC8346e2 = ((C2765e) interfaceC16132e.getValue()).ad;
                    c17213e.mopub(((AbstractC7674e) interfaceC8346e2).subs(), null, new Cfor(interfaceC8346e2, 10, false), new C2892e(802480018, true, new C3406e(interfaceC8346e2, c15435e, interfaceC16132e, null == true ? 1 : 0)));
                }
                if (!((C2765e) interfaceC16132e.getValue()).vip.isEmpty()) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-794351839, true, new Function3() { // from class: eٍؙٚ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = i2;
                            C13770e c13770e = (C13770e) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i8) {
                                case 0:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_playlists), null, c13770e, 0, 2);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_title), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        c15435e.m3993import(AbstractC5297e.appmetrica(c13770e, R.string.fake_catalog_tracks), AbstractC5297e.appmetrica(c13770e, R.string.cache_v2_sort_artist), c13770e, 0, 0);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                    InterfaceC8346e interfaceC8346e3 = ((C2765e) interfaceC16132e.getValue()).vip;
                    c17213e.mopub(((AbstractC7674e) interfaceC8346e3).subs(), null, new Cfor(interfaceC8346e3, 11, false), new C2892e(802480018, true, new C3406e(interfaceC8346e3, c15435e, interfaceC16132e, 1 == true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C5250e c5250e = (C5250e) this.f24903e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f24902e;
                C17213e c17213e2 = (C17213e) obj;
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(1852538555, true, new C9209e(c5250e, null == true ? 1 : 0)), 3);
                InterfaceC8346e interfaceC8346e4 = (InterfaceC8346e) interfaceC16132e2.getValue();
                int i8 = C14485e.f28637e;
                c17213e2.mopub(((AbstractC7674e) interfaceC8346e4).subs(), new Cfor(interfaceC8346e4, 13), new Cfor(interfaceC8346e4, 14, false), new C2892e(802480018, true, new C4290e(interfaceC8346e4, c5250e, i2)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC16400e interfaceC16400e = (InterfaceC16400e) this.f24903e;
                Function1 function12 = (Function1) this.f24902e;
                Context context = (Context) obj;
                ?? abstractC16666e = new AbstractC16666e(context);
                AbstractC3743e mo685static = AbstractC6731e.ad.mo685static(2);
                AbstractC12934e abstractC12934e = mo685static instanceof AbstractC12934e ? (AbstractC12934e) mo685static : null;
                if (abstractC12934e == null || (executorC14324e = abstractC12934e.mo1383e()) == null) {
                    executorC14324e = new ExecutorC14324e(mo685static);
                }
                C3098e c3098e = new C3098e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, executorC14324e);
                C2306e c2306e = (C2306e) C2316e.metrica().ad(C2306e.class);
                C1729e c1729e = (C1729e) c2306e.ad.m4615e(c3098e);
                c2306e.vip.getClass();
                String str = true != AbstractC4214e.metrica() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
                synchronized (AbstractC5797e.class) {
                    byte b = (byte) (((byte) 1) | 2);
                    if (b != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    purchase = AbstractC5797e.purchase(new C6758e(str, 1));
                }
                C17803e c17803e = new C17803e(c3098e, c1729e, executorC14324e, purchase);
                AbstractC13062e.metrica();
                int i9 = abstractC16666e.vip;
                if (2 != i9) {
                    abstractC16666e.vip = 2;
                    AbstractC13062e.metrica();
                    AbstractC13062e.metrica();
                    abstractC16666e.smaato(new RunnableC9766e(abstractC16666e, i9, i));
                }
                AbstractC13062e.metrica();
                abstractC16666e.f20646interface = interfaceC16400e;
                abstractC16666e.smaato(null);
                C10697e c10697e2 = new C10697e(Collections.singletonList(c17803e), executorC14324e, new C2780e(function12, c17803e, 1 == true ? 1 : 0));
                AbstractC13062e.metrica();
                C10697e c10697e3 = abstractC16666e.purchase;
                if (c10697e3 != c10697e2 || abstractC16666e.appmetrica != executorC14324e) {
                    abstractC16666e.appmetrica = executorC14324e;
                    abstractC16666e.purchase = c10697e2;
                    abstractC16666e.billing.m3355throw(executorC14324e, c10697e2);
                    if (!Objects.equals(c10697e3 == null ? null : c10697e3.ad(), c10697e2.ad())) {
                        Integer num = (Integer) ((C17015e) ((C9654e) abstractC16666e.billing.yandex).mopub()).smaato(C9654e.f19136e, 0);
                        num.getClass();
                        Integer valueOf = Integer.valueOf(abstractC16666e.billing.m3354this());
                        Integer valueOf2 = Integer.valueOf(abstractC16666e.billing.m3353native());
                        AbstractC13062e.metrica();
                        abstractC16666e.loadAd();
                        C12477e license = abstractC16666e.license(num, valueOf, valueOf2);
                        abstractC16666e.billing = license;
                        Executor executor = abstractC16666e.appmetrica;
                        if (executor != null && (c10697e = abstractC16666e.purchase) != null) {
                            license.m3355throw(executor, c10697e);
                        }
                        abstractC16666e.smaato(null);
                    }
                }
                C8356e c8356e = new C8356e(context);
                c8356e.setController(abstractC16666e);
                return c8356e;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C5016e c5016e = (C5016e) this.f24903e;
                C18477e c18477e = (C18477e) this.f24902e;
                C17213e c17213e3 = (C17213e) obj;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-18238367, true, new C18499e(c5016e, i4)), 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.purchase, 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.billing, 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.yandex, 3);
                if (!((Boolean) c5016e.f10700e.getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.startapp, 3);
                    AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.adcel, 3);
                    List list = c18477e.ad;
                    c17213e3.mopub(list.size(), null, new Cfor(list, 15, null == true ? 1 : 0), new C2892e(802480018, true, new C4290e(list, c5016e, i3)));
                    AbstractC5087e.premium(c17213e3, null, null, AbstractC3265e.mopub, 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C11881e c11881e = (C11881e) this.f24903e;
                Function2 function2 = (Function2) this.f24902e;
                C8181e c8181e = (C8181e) c11881e.invoke((C8633e) obj);
                if (c8181e != null) {
                    return new C11028e(c8181e, function2);
                }
                return null;
            default:
                InterfaceC7224e interfaceC7224e = (InterfaceC7224e) this.f24903e;
                String str2 = (String) this.f24902e;
                Function0 function02 = (Function0) obj;
                C16722e metrica = interfaceC7224e.metrica();
                InterfaceC4095e interfaceC4095e = (InterfaceC4095e) ((HashMap) metrica.f32780e).get(str2);
                if (interfaceC4095e != null) {
                    return interfaceC4095e;
                }
                InterfaceC4095e interfaceC4095e2 = (InterfaceC4095e) function02.invoke();
                metrica.isVip(str2, interfaceC4095e2);
                return interfaceC4095e2;
        }
    }
}
