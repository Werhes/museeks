package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4870e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10341e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f10342e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4870e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10341e = i;
        this.f10343e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4870e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10341e = i;
        this.f10342e = obj;
        this.f10343e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10341e) {
            case 0:
                return new C4870e((C13471e) this.f10342e, (C17816e) this.f10343e, interfaceC5083e, 0);
            case 1:
                return new C4870e((C9173e) this.f10342e, (C17816e) this.f10343e, interfaceC5083e, 1);
            case 2:
                return new C4870e((File) this.f10342e, (Bitmap) this.f10343e, interfaceC5083e, 2);
            case 3:
                return new C4870e((Cpackage) this.f10342e, (C8650e) this.f10343e, interfaceC5083e, 3);
            case 4:
                return new C4870e((C10709e) this.f10342e, (C11467e) this.f10343e, interfaceC5083e, 4);
            case 5:
                return new C4870e((C13135e) this.f10342e, (C0216e) this.f10343e, interfaceC5083e, 5);
            case 6:
                return new C4870e((String) this.f10342e, (C11546e) this.f10343e, interfaceC5083e, 6);
            case 7:
                return new C4870e((C7520e) this.f10342e, (String) this.f10343e, interfaceC5083e, 7);
            case 8:
                C4870e c4870e = new C4870e((C3566e) this.f10343e, interfaceC5083e, 8);
                c4870e.f10342e = obj;
                return c4870e;
            case 9:
                return new C4870e((AbstractC16904e) this.f10342e, (C13107e) this.f10343e, interfaceC5083e, 9);
            case 10:
                return new C4870e((C2038e) this.f10342e, (AudioPlaylist) this.f10343e, interfaceC5083e, 10);
            case 11:
                C4870e c4870e2 = new C4870e((C0895e) this.f10343e, interfaceC5083e, 11);
                c4870e2.f10342e = obj;
                return c4870e2;
            case 12:
                C4870e c4870e3 = new C4870e((C10771e) this.f10343e, interfaceC5083e, 12);
                c4870e3.f10342e = obj;
                return c4870e3;
            case 13:
                C4870e c4870e4 = new C4870e((AbstractC10595e) this.f10343e, interfaceC5083e, 13);
                c4870e4.f10342e = obj;
                return c4870e4;
            case 14:
                C4870e c4870e5 = new C4870e((DedicatedCacheMigrationService) this.f10343e, interfaceC5083e, 14);
                c4870e5.f10342e = obj;
                return c4870e5;
            case 15:
                C4870e c4870e6 = new C4870e((DedicatedCacheService) this.f10343e, interfaceC5083e, 15);
                c4870e6.f10342e = obj;
                return c4870e6;
            case 16:
                C4870e c4870e7 = new C4870e((C10095e) this.f10343e, interfaceC5083e, 16);
                c4870e7.f10342e = obj;
                return c4870e7;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C4870e c4870e8 = new C4870e((DownloaderService) this.f10343e, interfaceC5083e, 17);
                c4870e8.f10342e = obj;
                return c4870e8;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C4870e((C12284e) this.f10342e, (C6064e) this.f10343e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C4870e c4870e9 = new C4870e((C12402e) this.f10343e, interfaceC5083e, 19);
                c4870e9.f10342e = obj;
                return c4870e9;
            case 20:
                C4870e c4870e10 = new C4870e((ArrayList) this.f10343e, interfaceC5083e, 20);
                c4870e10.f10342e = obj;
                return c4870e10;
            case 21:
                return new C4870e((C9302e) this.f10342e, (C2109e) this.f10343e, interfaceC5083e, 21);
            case 22:
                C4870e c4870e11 = new C4870e((C18464e) this.f10343e, interfaceC5083e, 22);
                c4870e11.f10342e = obj;
                return c4870e11;
            case 23:
                C4870e c4870e12 = new C4870e((Function0) this.f10343e, interfaceC5083e, 23);
                c4870e12.f10342e = obj;
                return c4870e12;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C4870e c4870e13 = new C4870e((Function1) this.f10343e, interfaceC5083e, 24);
                c4870e13.f10342e = obj;
                return c4870e13;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4870e c4870e14 = new C4870e((Long) this.f10343e, interfaceC5083e, 25);
                c4870e14.f10342e = obj;
                return c4870e14;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4870e c4870e15 = new C4870e((C6660e) this.f10343e, interfaceC5083e, 26);
                c4870e15.f10342e = obj;
                return c4870e15;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C4870e((C8054e) this.f10342e, (List) this.f10343e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4870e c4870e16 = new C4870e((C18220e) this.f10343e, interfaceC5083e, 28);
                c4870e16.f10342e = obj;
                return c4870e16;
            default:
                return new C4870e((C12528e) this.f10342e, (List) this.f10343e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10341e) {
            case 0:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C4870e) advert((InterfaceC5083e) obj2, (AbstractC16824e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C4870e) advert((InterfaceC5083e) obj2, (AbstractC10595e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C7163e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C8003e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C4870e) advert((InterfaceC5083e) obj2, (AbstractC0468e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C13687e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC1618e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C0044e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C5033e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C0044e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C0044e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (C1222e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C4870e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r4v14, types: [eؗٝٝ, eؘؙٔ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC4895e mo1012e;
        Throwable th;
        int i;
        int i2;
        int i3 = this.f10341e;
        int i4 = 9;
        int i5 = 4;
        int i6 = 5;
        final int i7 = 2;
        boolean z = true;
        InterfaceC5083e interfaceC5083e = null;
        Throwable th2 = null;
        interfaceC5083e = null;
        final int i8 = 0;
        Object obj2 = this.f10343e;
        switch (i3) {
            case 0:
                AbstractC2003e.purchase(obj);
                ((C13471e) this.f10342e).Signature(((C17816e) obj2).ad);
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                Iterator it = ((C9173e) this.f10342e).appmetrica.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18069e) it.next()).Signature(((C17816e) obj2).ad);
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                File file = (File) this.f10342e;
                AbstractC1641e.smaato(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    ((Bitmap) obj2).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                Cpackage cpackage = (Cpackage) this.f10342e;
                AbstractC12834e abstractC12834e = ((C1343e) cpackage.f36443e).vip((C8650e) obj2).purchase().f21945e;
                if (abstractC12834e != null && (mo1012e = abstractC12834e.mo1012e()) != null) {
                    try {
                        Object ad = cpackage.mo3232e().ad(mo1012e);
                        try {
                            mo1012e.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                        Throwable th4 = th2;
                        interfaceC5083e = ad;
                        th = th4;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            mo1012e.close();
                        } catch (Throwable th6) {
                            AbstractC13362e.license(th, th6);
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    if (interfaceC5083e != null) {
                        return interfaceC5083e;
                    }
                }
                throw new IllegalStateException("HashObject is supposedly null");
            case 4:
                AbstractC2003e.purchase(obj);
                ((C10709e) this.f10342e).vip.premium(AbstractC4340e.purchase, (C11467e) obj2);
                return Unit.INSTANCE;
            case 5:
                AbstractC2003e.purchase(obj);
                C13135e c13135e = (C13135e) this.f10342e;
                if (c13135e != null) {
                    c13135e.loadAd();
                }
                C0216e c0216e = (C0216e) obj2;
                if (c0216e != null) {
                    c0216e.ad(null);
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2003e.purchase(obj);
                String str = (String) this.f10342e;
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) C5060e.vip(str)));
                C11546e c11546e = (C11546e) obj2;
                C14328e c14328e = c11546e.metrica;
                try {
                    C11352e c11352e = (C11352e) c11546e.advert.getValue();
                    c11352e.getClass();
                    ArrayList arrayList = new ArrayList();
                    C3511e c3511e = c11352e.ad;
                    if (c3511e != null) {
                        arrayList.add(new C14779e(c3511e.ad, str));
                    }
                    C3511e c3511e2 = c11352e.vip;
                    if (c3511e2 != null) {
                        try {
                            arrayList.add(new C14779e(c3511e2.ad, str));
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new C7856e(arrayList);
                } catch (Exception e2) {
                    if (!(e2 instanceof CameraAccessException)) {
                        if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof SecurityException) && !(e2 instanceof UnsupportedOperationException) && !(e2 instanceof NullPointerException)) {
                            if (!(e2 instanceof IllegalStateException)) {
                                throw e2;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            return null;
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        c14328e.ad(str, false, 9);
                        return null;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e2;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                    c14328e.ad(str, true, i);
                    return null;
                }
            case 7:
                AbstractC2003e.purchase(obj);
                return ((C7520e) this.f10342e).appmetrica((String) obj2);
            case 8:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f10342e;
                AbstractC2003e.purchase(obj);
                C3566e c3566e = (C3566e) obj2;
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14358e(c3566e, interfaceC5083e, i8), 3);
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C12972e(c3566e, interfaceC5083e, i8), 3);
                return Unit.INSTANCE;
            case 9:
                AbstractC2003e.purchase(obj);
                AbstractC16904e abstractC16904e = (AbstractC16904e) this.f10342e;
                if (abstractC16904e.loadAd() != ((C13107e) obj2).ad) {
                    if (abstractC16904e.loadAd() == 0) {
                        C7838e c7838e = VKXApplication.f36530e;
                        C7838e c7838e2 = c7838e != null ? c7838e : null;
                        c7838e2.getClass();
                        c7838e2.startapp(C11293e.f22689e);
                    } else if (abstractC16904e.loadAd() == 1 || abstractC16904e.loadAd() == 2) {
                        C7838e c7838e3 = VKXApplication.f36530e;
                        if (c7838e3 == null) {
                            c7838e3 = null;
                        }
                        c7838e3.getClass();
                        c7838e3.startapp(new C10954e(c7838e3, interfaceC5083e, 7));
                    }
                }
                return Unit.INSTANCE;
            case 10:
                AbstractC2003e.purchase(obj);
                C2038e c2038e = (C2038e) this.f10342e;
                c2038e.ad.isVip(new C15820e((AudioPlaylist) obj2));
                c2038e.ad.firebase();
                return Unit.INSTANCE;
            case 11:
                AbstractC16824e abstractC16824e = (AbstractC16824e) this.f10342e;
                AbstractC2003e.purchase(obj);
                C3434e method = AbstractC11263e.mopub(abstractC16824e).getMethod();
                Long ad2 = AbstractC17419e.ad(abstractC16824e);
                if (ad2 != null && ad2.longValue() == 0) {
                    return null;
                }
                if (ad2 == null && AbstractC7890e.billing(method, C3434e.billing)) {
                    return null;
                }
                C0895e c0895e = (C0895e) obj2;
                InterfaceC4911e interfaceC4911e = AbstractC10725e.ad;
                if (abstractC16824e.ad().mo459e("Content-Encoding") == null) {
                    return abstractC16824e;
                }
                String mo459e = abstractC16824e.ad().mo459e("Content-Encoding");
                if (mo459e == null) {
                    throw new IllegalStateException("Content-Encoding unavailable");
                }
                List m1869private = AbstractC5304e.m1869private(mo459e, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m1869private, 10));
                Iterator it2 = m1869private.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC5304e.m1855const((String) it2.next()).toString().toLowerCase(Locale.ROOT));
                }
                C15942e c15942e = new C15942e(z ? 1 : 0, arrayList2);
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(c15942e, 10));
                Iterator it3 = c15942e.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C0053e) it3).f1190e;
                    if (!listIterator.hasPrevious()) {
                        C15802e c15802e = InterfaceC18107e.ad;
                        C10095e c10095e = new C10095e(0);
                        abstractC16824e.ad().mo460e(new C11213e(15, c10095e));
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            if (!arrayList2.contains((String) next)) {
                                arrayList4.add(next);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            c10095e.mo859e("Content-Encoding", AbstractC13480e.m3608try(arrayList4, ",", null, null, null, 62));
                        }
                        Unit unit = Unit.INSTANCE;
                        C0069e m2759e = c10095e.m2759e();
                        abstractC16824e.vip().getAttributes().billing(AbstractC10725e.metrica, arrayList2);
                        C5042e vip = abstractC16824e.vip();
                        C2191e c2191e = new C2191e(z ? 1 : 0, arrayList3);
                        ?? c5042e = new C5042e(vip.f10752e);
                        InterfaceC4393e interfaceC4393e = vip.f10751e;
                        if (interfaceC4393e == null) {
                            interfaceC4393e = null;
                        }
                        c5042e.f10751e = new C18119e(c5042e, interfaceC4393e, i8);
                        AbstractC16824e abstractC16824e2 = vip.f10750e;
                        C12526e c12526e = new C12526e(c5042e, abstractC16824e2 != null ? abstractC16824e2 : null, c2191e, m2759e);
                        c5042e.f10750e = c12526e;
                        return c12526e;
                    }
                    String str2 = (String) listIterator.previous();
                    InterfaceC3552e interfaceC3552e = (InterfaceC3552e) c0895e.get(str2);
                    if (interfaceC3552e == null) {
                        throw new C9442e(str2);
                    }
                    arrayList3.add(interfaceC3552e);
                }
                break;
            case 12:
                AbstractC2003e.purchase(obj);
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f10342e;
                C10771e c10771e = (C10771e) obj2;
                AtomicReference atomicReference = c10771e.vip;
                C8419e purchase = AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C15966e((InterfaceC10500e) atomicReference.getAndSet(null), c10771e, interfaceC5083e, i6), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, purchase)) {
                        if (atomicReference.get() != null) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                AbstractC10595e abstractC10595e = (AbstractC10595e) this.f10342e;
                AbstractC2003e.purchase(obj);
                return Boolean.valueOf((abstractC10595e instanceof C10950e) && ((C10950e) abstractC10595e).ad <= ((C10950e) ((AbstractC10595e) obj2)).ad);
            case 14:
                C7163e c7163e = (C7163e) this.f10342e;
                AbstractC2003e.purchase(obj);
                DedicatedCacheMigrationService dedicatedCacheMigrationService = (DedicatedCacheMigrationService) obj2;
                if (dedicatedCacheMigrationService.f36556e) {
                    return Unit.INSTANCE;
                }
                C18220e metrica = AbstractC4608e.metrica(dedicatedCacheMigrationService.vip());
                C15420e c15420e = AbstractC6731e.ad;
                AbstractC5336e.purchase(metrica, ExecutorC3603e.f8134e, 0, new C15966e(dedicatedCacheMigrationService, c7163e, interfaceC5083e, 23), 2);
                return Unit.INSTANCE;
            case 15:
                C8003e c8003e = (C8003e) this.f10342e;
                AbstractC2003e.purchase(obj);
                DedicatedCacheService dedicatedCacheService = (DedicatedCacheService) obj2;
                AbstractC3002e abstractC3002e = c8003e.ad;
                if (!dedicatedCacheService.f10870e.isCanceled()) {
                    AbstractC5336e.purchase(AbstractC4608e.metrica(dedicatedCacheService.vip()), AbstractC6731e.ad, 0, new C1853e(dedicatedCacheService, abstractC3002e, interfaceC5083e, i5), 2);
                }
                return Unit.INSTANCE;
            case 16:
                AbstractC0468e abstractC0468e = (AbstractC0468e) this.f10342e;
                AbstractC2003e.purchase(obj);
                if (abstractC0468e instanceof C13542e) {
                    C13244e c13244e = (C13244e) abstractC0468e.metrica.getValue();
                    String m3036e = c13244e != null ? c13244e.m3036e("name") : null;
                    if (m3036e != null) {
                        ((C10095e) obj2).mo859e(m3036e, ((C13542e) abstractC0468e).license);
                    }
                }
                abstractC0468e.ad.invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13687e c13687e = (C13687e) this.f10342e;
                AbstractC2003e.purchase(obj);
                DownloaderService downloaderService = (DownloaderService) obj2;
                AbstractC3002e abstractC3002e2 = c13687e.ad;
                if (!downloaderService.f10870e.isCanceled()) {
                    AbstractC5336e.purchase(AbstractC4608e.metrica(downloaderService.vip()), AbstractC6731e.ad, 0, new C1853e(downloaderService, abstractC3002e2, interfaceC5083e, i5), 2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC2003e.purchase(obj);
                C12284e c12284e = (C12284e) this.f10342e;
                c12284e.m3335transient(true);
                c12284e.m3332import(true);
                AbstractC5336e.purchase(AbstractC4608e.metrica(c12284e.vip()), null, 0, new C8857e((C6064e) obj2, c12284e, interfaceC5083e, i4), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC1618e interfaceC1618e = (InterfaceC1618e) this.f10342e;
                AbstractC2003e.purchase(obj);
                interfaceC1618e.appmetrica().inmobi(((C12402e) obj2).ad());
                return Unit.INSTANCE;
            case 20:
                AbstractC2003e.purchase(obj);
                C0044e appmetrica = ((C0044e) this.f10342e).appmetrica();
                ArrayList arrayList5 = (ArrayList) obj2;
                C11951e c11951e = C1890e.billing;
                ArrayList arrayList6 = new ArrayList(AbstractC0746e.subscription(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((AbstractC12260e) it5.next()).getClass().getName());
                }
                appmetrica.license(c11951e, AbstractC13480e.m3582e(arrayList6));
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    AbstractC12260e abstractC12260e = (AbstractC12260e) it6.next();
                    C5749e c5749e = C1890e.license;
                    c5749e.getClass();
                    String canonicalName = abstractC12260e.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        throw new IllegalArgumentException("no receiver name");
                    }
                    C11951e vip2 = C5749e.vip(c5749e, canonicalName);
                    String canonicalName2 = abstractC12260e.appmetrica().getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        throw new IllegalArgumentException("no provider name");
                    }
                    appmetrica.license(vip2, canonicalName2);
                }
                return appmetrica.purchase();
            case 21:
                AbstractC2003e.purchase(obj);
                C9302e c9302e = (C9302e) this.f10342e;
                boolean z2 = !c9302e.f18534e;
                c9302e.f18534e = z2;
                ((C2109e) obj2).invoke(Boolean.valueOf(z2));
                return Unit.INSTANCE;
            case 22:
                C5033e c5033e = (C5033e) this.f10342e;
                AbstractC2003e.purchase(obj);
                AbstractC2094e.license(c5033e, AbstractC17926e.vip, new C14407e(19));
                final C18464e c18464e = (C18464e) obj2;
                Function1 function1 = new Function1() { // from class: eؚٖۛ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i8) {
                            case 0:
                                InterfaceC6055e interfaceC6055e = (InterfaceC6055e) obj3;
                                C18464e c18464e2 = c18464e;
                                InterfaceC5083e interfaceC5083e2 = null;
                                AbstractC0083e.m232case(interfaceC6055e, "/", C3434e.vip, new C13749e(15, new C15686e(c18464e2, interfaceC5083e2, 0)));
                                for (C5933e c5933e : (List) c18464e2.f36190e) {
                                    c5933e.getClass();
                                    C8857e c8857e = new C8857e(c5933e, interfaceC5083e2, 19);
                                    C3434e c3434e = C3434e.metrica;
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/start", c3434e, new C13749e(c8857e));
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/finish", c3434e, new C13749e(new C14117e(c5933e, interfaceC5083e2, 0)));
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C10709e c10709e = (C10709e) ((C5033e) obj3).f10719e.get();
                                C18464e c18464e3 = c18464e;
                                AbstractC5336e.purchase((C14826e) c18464e3.f36191e, null, 0, new C1247e(c18464e3, c10709e, (InterfaceC5083e) null, 19), 3);
                                return Unit.INSTANCE;
                            default:
                                C1615e c1615e = (C1615e) c18464e.f36189e;
                                C6571e c6571e = new C6571e(0, 0);
                                c1615e.getClass();
                                c1615e.smaato(null, c6571e);
                                return Unit.INSTANCE;
                        }
                    }
                };
                C8208e c8208e = AbstractC12044e.ad;
                C0136e c0136e = C7000e.f14334e;
                Object purchase2 = AbstractC2094e.metrica(c5033e).purchase(c0136e.getKey());
                C5389e c5389e = c5033e.f10722e;
                C7000e c7000e = (C7000e) purchase2;
                if (c7000e != null) {
                    function1.invoke(c7000e);
                }
                final int i9 = z ? 1 : 0;
                c5389e.m1896goto(AbstractC4340e.license, new Function1() { // from class: eؚٖۛ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i9) {
                            case 0:
                                InterfaceC6055e interfaceC6055e = (InterfaceC6055e) obj3;
                                C18464e c18464e2 = c18464e;
                                InterfaceC5083e interfaceC5083e2 = null;
                                AbstractC0083e.m232case(interfaceC6055e, "/", C3434e.vip, new C13749e(15, new C15686e(c18464e2, interfaceC5083e2, 0)));
                                for (C5933e c5933e : (List) c18464e2.f36190e) {
                                    c5933e.getClass();
                                    C8857e c8857e = new C8857e(c5933e, interfaceC5083e2, 19);
                                    C3434e c3434e = C3434e.metrica;
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/start", c3434e, new C13749e(c8857e));
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/finish", c3434e, new C13749e(new C14117e(c5933e, interfaceC5083e2, 0)));
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C10709e c10709e = (C10709e) ((C5033e) obj3).f10719e.get();
                                C18464e c18464e3 = c18464e;
                                AbstractC5336e.purchase((C14826e) c18464e3.f36191e, null, 0, new C1247e(c18464e3, c10709e, (InterfaceC5083e) null, 19), 3);
                                return Unit.INSTANCE;
                            default:
                                C1615e c1615e = (C1615e) c18464e.f36189e;
                                C6571e c6571e = new C6571e(0, 0);
                                c1615e.getClass();
                                c1615e.smaato(null, c6571e);
                                return Unit.INSTANCE;
                        }
                    }
                });
                c5389e.m1896goto(AbstractC4340e.yandex, new Function1() { // from class: eؚٖۛ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i7) {
                            case 0:
                                InterfaceC6055e interfaceC6055e = (InterfaceC6055e) obj3;
                                C18464e c18464e2 = c18464e;
                                InterfaceC5083e interfaceC5083e2 = null;
                                AbstractC0083e.m232case(interfaceC6055e, "/", C3434e.vip, new C13749e(15, new C15686e(c18464e2, interfaceC5083e2, 0)));
                                for (C5933e c5933e : (List) c18464e2.f36190e) {
                                    c5933e.getClass();
                                    C8857e c8857e = new C8857e(c5933e, interfaceC5083e2, 19);
                                    C3434e c3434e = C3434e.metrica;
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/start", c3434e, new C13749e(c8857e));
                                    AbstractC0083e.m232case(interfaceC6055e, "/auth/finish", c3434e, new C13749e(new C14117e(c5933e, interfaceC5083e2, 0)));
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C10709e c10709e = (C10709e) ((C5033e) obj3).f10719e.get();
                                C18464e c18464e3 = c18464e;
                                AbstractC5336e.purchase((C14826e) c18464e3.f36191e, null, 0, new C1247e(c18464e3, c10709e, (InterfaceC5083e) null, 19), 3);
                                return Unit.INSTANCE;
                            default:
                                C1615e c1615e = (C1615e) c18464e.f36189e;
                                C6571e c6571e = new C6571e(0, 0);
                                c1615e.getClass();
                                c1615e.smaato(null, c6571e);
                                return Unit.INSTANCE;
                        }
                    }
                });
                return Unit.INSTANCE;
            case 23:
                AbstractC2003e.purchase(obj);
                InterfaceC8850e advert = ((InterfaceC18435e) this.f10342e).advert();
                Function0 function0 = (Function0) obj2;
                try {
                    C16409e c16409e = new C16409e();
                    c16409e.f32223e = AbstractC6629e.smaato(AbstractC6629e.startapp(advert), true, c16409e);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C16409e.f32221e;
                    try {
                        do {
                            i2 = atomicIntegerFieldUpdater.get(c16409e);
                            if (i2 != 0) {
                                if (i2 != 2 && i2 != 3) {
                                    C16409e.smaato(i2);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(c16409e, i2, 0));
                        return function0.invoke();
                    } finally {
                        c16409e.advert();
                    }
                } catch (InterruptedException e3) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
                }
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2003e.purchase(obj);
                ((Function1) obj2).invoke((C0044e) this.f10342e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2003e.purchase(obj);
                ((C0044e) this.f10342e).license(C7551e.vip, (Long) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2003e.purchase(obj);
                C1222e c1222e = (C1222e) this.f10342e;
                AbstractC12161e abstractC12161e = (AbstractC12161e) c1222e.license(5);
                if (!abstractC12161e.f24448e.equals(c1222e)) {
                    abstractC12161e.metrica();
                    AbstractC12161e.license(abstractC12161e.f24447e, c1222e);
                }
                C6660e c6660e = (C6660e) obj2;
                C4391e c4391e = (C4391e) abstractC12161e;
                int remoteconfig = ((C1222e) c4391e.f24447e).remoteconfig();
                c4391e.metrica();
                C1222e.Signature((C1222e) c4391e.f24447e, remoteconfig);
                c4391e.metrica();
                C1222e.loadAd((C1222e) c4391e.f24447e);
                for (Map.Entry entry : c6660e.vip.entrySet()) {
                    C14888e c14888e = (C14888e) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (c6660e.appmetrica.contains(new Integer(intValue))) {
                        C3689e subscription = C3994e.subscription();
                        subscription.metrica();
                        C3994e.amazon((C3994e) subscription.f24447e, c14888e);
                        subscription.metrica();
                        C3994e.loadAd((C3994e) subscription.f24447e, intValue);
                        c4391e.metrica();
                        C1222e.amazon((C1222e) c4391e.f24447e, (C3994e) subscription.ad());
                    }
                }
                return c4391e.ad();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2003e.purchase(obj);
                C8054e c8054e = (C8054e) this.f10342e;
                c8054e.f16364e.ad((AppActivity) c8054e.f10582e, c8054e.f16367e, (List) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2003e.purchase(obj);
                InterfaceC18435e interfaceC18435e3 = (InterfaceC18435e) this.f10342e;
                C18220e c18220e = (C18220e) obj2;
                AbstractC0003e abstractC0003e = c18220e.f35681e;
                if (((C4891e) abstractC0003e).license.compareTo(EnumC7785e.f15778e) >= 0) {
                    abstractC0003e.ad(c18220e);
                } else {
                    AbstractC6629e.license(interfaceC18435e3.advert(), null);
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                ((C12528e) this.f10342e).getClass();
                C17018e c17018e = new C17018e();
                Iterator it7 = ((List) obj2).iterator();
                while (it7.hasNext()) {
                    c17018e.ad(((AbstractC16510e) it7.next()).admob);
                }
                return Boolean.valueOf(((Number) c17018e.vip().billing.ad().getUpper()).intValue() > 30);
        }
    }
}
