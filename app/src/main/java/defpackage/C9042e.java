package defpackage;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.vip;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9042e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18105e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f18106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9042e(InterfaceC5083e interfaceC5083e, C15062e c15062e) {
        super(2, interfaceC5083e);
        this.f18105e = 15;
        this.f18106e = c15062e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9042e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f18105e = i;
        this.f18106e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f18105e) {
            case 0:
                return new C9042e((C13621e) this.f18106e, interfaceC5083e, 0);
            case 1:
                return new C9042e((C15052e) this.f18106e, interfaceC5083e, 1);
            case 2:
                return new C9042e((AppActivity) this.f18106e, interfaceC5083e, 2);
            case 3:
                return new C9042e((C6540e) this.f18106e, interfaceC5083e, 3);
            case 4:
                return new C9042e((C8006e) this.f18106e, interfaceC5083e, 4);
            case 5:
                return new C9042e((AudioTrack) this.f18106e, interfaceC5083e, 5);
            case 6:
                return new C9042e((C5250e) this.f18106e, interfaceC5083e, 6);
            case 7:
                return new C9042e((C6260e) this.f18106e, interfaceC5083e, 7);
            case 8:
                return new C9042e((C13135e) this.f18106e, interfaceC5083e, 8);
            case 9:
                return new C9042e((C3409e) this.f18106e, interfaceC5083e, 9);
            case 10:
                return new C9042e((C13877e) this.f18106e, interfaceC5083e, 10);
            case 11:
                return new C9042e((byte[]) this.f18106e, interfaceC5083e, 11);
            case 12:
                return new C9042e((C3566e) this.f18106e, interfaceC5083e, 12);
            case 13:
                return new C9042e((DedicatedCacheMigrationService) this.f18106e, interfaceC5083e, 13);
            case 14:
                return new C9042e((DedicatedCacheService) this.f18106e, interfaceC5083e, 14);
            case 15:
                return new C9042e(interfaceC5083e, (C15062e) this.f18106e);
            case 16:
                return new C9042e((C8839e) this.f18106e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C9042e((DownloaderService) this.f18106e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C9042e((C6442e) this.f18106e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C9042e((C12856e) this.f18106e, interfaceC5083e, 19);
            case 20:
                return new C9042e((C16070e) this.f18106e, interfaceC5083e, 20);
            case 21:
                return new C9042e((C8004e) this.f18106e, interfaceC5083e, 21);
            case 22:
                return new C9042e((C8610e) this.f18106e, interfaceC5083e, 22);
            case 23:
                return new C9042e((C17424e) this.f18106e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C9042e((C11439e) this.f18106e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9042e((C3625e) this.f18106e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C9042e((C2921e) this.f18106e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C9042e((Activity) this.f18106e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C9042e((C15293e) this.f18106e, interfaceC5083e, 28);
            default:
                return new C9042e((C8510e) this.f18106e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18105e) {
            case 0:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C1175e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C12592e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C5642e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C0962e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C9115e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C5585e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9042e c9042e = (C9042e) advert((InterfaceC5083e) obj2, (C6442e) obj);
                AbstractC2003e.purchase(Unit.INSTANCE);
                return (C6442e) c9042e.f18106e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C0874e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C9042e) advert((InterfaceC5083e) obj2, (C4315e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [eّؑۥ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = 25;
        int i2 = 13;
        switch (this.f18105e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C13621e c13621e = (C13621e) this.f18106e;
                C2038e c2038e = c13621e.ad;
                boolean z = ((Boolean) c13621e.license.getValue()).booleanValue() || c13621e.amazon() != EnumC10483e.f20707e;
                if (((C15754e) c2038e.appmetrica.getValue()) == null) {
                    c2038e.ad.f36546e.license(z);
                }
                c2038e.subscription.yandex.setValue(Boolean.valueOf(c13621e.amazon() == EnumC10483e.f20705e));
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                ((C15052e) this.f18106e).f29820e.setValue(C15052e.m3907transient());
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                ((NextDockView) ((AppActivity) this.f18106e).f36547e.f10519e).vip(String.valueOf(AbstractC1660e.firebase(EnumC16729e.f32803e, (EnumC16729e[]) C14411e.f28494e.f36443e)), true, true);
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                ((C6540e) this.f18106e).ad();
                return Unit.INSTANCE;
            case 4:
                AbstractC2003e.purchase(obj);
                ((C8006e) this.f18106e).f16249e.setValue(AbstractC14119e.ad());
                return Unit.INSTANCE;
            case 5:
                AbstractC2003e.purchase(obj);
                AudioTrack audioTrack = (AudioTrack) this.f18106e;
                return new Long(AbstractC12322e.startapp(AbstractC4224e.startapp(audioTrack.f36496interface ? 3 : 2, AbstractC6914e.billing(audioTrack))));
            case 6:
                AbstractC2003e.purchase(obj);
                ((C5250e) this.f18106e).mo734case();
                return Unit.INSTANCE;
            case 7:
                AbstractC2003e.purchase(obj);
                C6260e.vip((C6260e) this.f18106e);
                return Unit.INSTANCE;
            case 8:
                AbstractC2003e.purchase(obj);
                ((C13135e) this.f18106e).smaato(true);
                return Unit.INSTANCE;
            case 9:
                AbstractC2003e.purchase(obj);
                C18511e c18511e = AbstractC11062e.f21949e;
                String str = C10675e.f21023e;
                c18511e.loadAd(C10215e.purchase(((C3409e) this.f18106e).f27451e.getFilesDir()).appmetrica("vkx_main_cdcm"), false);
                C5363e c5363e = AbstractC16696e.ad;
                c18511e.Signature(C10215e.purchase(AbstractC16268e.purchase().metrica()));
                return Unit.INSTANCE;
            case 10:
                AbstractC2003e.purchase(obj);
                C13877e c13877e = (C13877e) this.f18106e;
                Boolean bool = (Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue();
                bool.getClass();
                c13877e.f27490e.setValue(bool);
                return Unit.INSTANCE;
            case 11:
                AbstractC2003e.purchase(obj);
                byte[] bArr = (byte[]) this.f18106e;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            case 12:
                AbstractC2003e.purchase(obj);
                ((C3566e) this.f18106e).purchase();
                return Unit.INSTANCE;
            case 13:
                AbstractC2003e.purchase(obj);
                DedicatedCacheMigrationService dedicatedCacheMigrationService = (DedicatedCacheMigrationService) this.f18106e;
                AbstractC6232e.billing(new C16908e(dedicatedCacheMigrationService.f36556e, dedicatedCacheMigrationService.f36558e), AbstractC4608e.metrica(dedicatedCacheMigrationService.vip()));
                return Unit.INSTANCE;
            case 14:
                AbstractC2003e.purchase(obj);
                ((DedicatedCacheService) this.f18106e).license();
                return Unit.INSTANCE;
            case 15:
                AbstractC2003e.purchase(obj);
                C12810e c12810e = ((C15062e) this.f18106e).metrica;
                if (c12810e != null) {
                    c12810e.close();
                }
                return Unit.INSTANCE;
            case 16:
                AbstractC2003e.purchase(obj);
                C8839e c8839e = (C8839e) this.f18106e;
                synchronized (c8839e.f17753e) {
                    if (!c8839e.f17744e || c8839e.f17748e) {
                        return Unit.INSTANCE;
                    }
                    try {
                        c8839e.subs();
                    } catch (IOException unused) {
                        c8839e.f17751e = true;
                    }
                    try {
                        if ((c8839e.f17747e >= 2000 ? 1 : 0) != 0) {
                            c8839e.m2504goto();
                        }
                    } catch (IOException unused2) {
                        c8839e.f17752e = true;
                        c8839e.f17754e = new C9674e(new Object());
                    }
                    return Unit.INSTANCE;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC2003e.purchase(obj);
                ((DownloaderService) this.f18106e).license();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC2003e.purchase(obj);
                return (C6442e) this.f18106e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC2003e.purchase(obj);
                C12856e c12856e = (C12856e) this.f18106e;
                C10479e c10479e = new C10479e(24, c12856e);
                if (AbstractC0666e.ad) {
                    c12856e.vip.m1896goto(AbstractC4340e.ad, new C6538e(c12856e, c10479e, 11));
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c12856e.appmetrica;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    try {
                        C6571e license = c12856e.license();
                        C5033e c5033e = (C5033e) license.f13544e;
                        ClassLoader classLoader = (ClassLoader) license.f13543e;
                        c12856e.advert = c5033e;
                        c12856e.billing = classLoader;
                        Unit unit = Unit.INSTANCE;
                        for (int i4 = 0; i4 < readHoldCount; i4++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                        InterfaceC5083e interfaceC5083e = null;
                        AbstractC5336e.purchase(AbstractC9743e.ad(c12856e.appmetrica().f10724e), null, 0, new C15238e(c12856e, interfaceC5083e, 28), 3);
                        C10709e c10709e = c12856e.smaato;
                        c10709e.getClass();
                        return c12856e;
                    } catch (Throwable th) {
                        c12856e.purchase();
                        if (!c12856e.adcel.isEmpty()) {
                            c12856e.metrica();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    while (r8 < readHoldCount) {
                        readLock.lock();
                        r8++;
                    }
                    writeLock.unlock();
                    throw th2;
                }
            case 20:
                AbstractC2003e.purchase(obj);
                C16070e c16070e = (C16070e) this.f18106e;
                if (c16070e.m4107strictfp().ad == EnumC16168e.f31769e && c16070e.m4107strictfp().vip) {
                    c16070e.f31643e.setValue(Boolean.TRUE);
                    c16070e.f31645e.setValue(BuildConfig.FLAVOR);
                    AbstractC5336e.purchase(AbstractC4608e.metrica(c16070e.vip()), null, 0, new C16600e(c16070e, null, r8), 3);
                }
                return Unit.INSTANCE;
            case 21:
                AbstractC2003e.purchase(obj);
                C18479e c18479e = (C18479e) AbstractC1831e.vip().billing;
                C18479e.Companion.getClass();
                if (!AbstractC7890e.billing(c18479e, C18479e.advert)) {
                    ((AppActivity) ((C8004e) this.f18106e).pro()).crashlytics();
                }
                return Unit.INSTANCE;
            case 22:
                AbstractC2003e.purchase(obj);
                ((C8610e) this.f18106e).invoke();
                return Unit.INSTANCE;
            case 23:
                AbstractC2003e.purchase(obj);
                return vip.ad(((InterfaceC15288e) ((C17424e) this.f18106e).f34142e).smaato());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C11439e c11439e = (C11439e) this.f18106e;
                C16607e c16607e = c11439e.f23005e;
                AbstractC2003e.purchase(obj);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (C2691e.f6569e == null) {
                        VKXApplication vKXApplication = VKXApplication.f36528e;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        C2691e.f6569e = new C2691e(i2, vKXApplication.getApplicationContext().getContentResolver());
                    }
                    C2691e c2691e = C2691e.f6569e;
                    if (c2691e == null) {
                        c2691e = null;
                    }
                    c11439e.f23007e.setValue(AbstractC8228e.metrica(AbstractC17976e.appmetrica(c2691e, new C18478e(i, new C9125e(0), new C1336e(false, 2), new AbstractC3219e[]{new AbstractC3219e(AbstractC0869e.isVip(c16607e.ad, "artist_id == "))}))));
                }
                if (C2691e.f6569e == null) {
                    VKXApplication vKXApplication2 = VKXApplication.f36528e;
                    if (vKXApplication2 == null) {
                        vKXApplication2 = null;
                    }
                    C2691e.f6569e = new C2691e(i2, vKXApplication2.getApplicationContext().getContentResolver());
                }
                C2691e c2691e2 = C2691e.f6569e;
                c11439e.f23004e.setValue(AbstractC8228e.metrica(AbstractC17976e.appmetrica(c2691e2 == null ? null : c2691e2, new C18478e(i, new C9125e(2), new C1336e(), new AbstractC3219e[]{new C0144e(), new C0144e(c16607e.ad)}))));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC2003e.purchase(obj);
                C3625e c3625e = (C3625e) this.f18106e;
                if (C2691e.f6569e == null) {
                    VKXApplication vKXApplication3 = VKXApplication.f36528e;
                    if (vKXApplication3 == null) {
                        vKXApplication3 = null;
                    }
                    C2691e.f6569e = new C2691e(i2, vKXApplication3.getApplicationContext().getContentResolver());
                }
                C2691e c2691e3 = C2691e.f6569e;
                c3625e.f8170e.setValue(AbstractC8228e.metrica(AbstractC17976e.appmetrica(c2691e3 == null ? null : c2691e3, new C18478e(i, new C9125e(2), new C1336e(), new AbstractC3219e[]{new C0144e(), new AbstractC3219e(AbstractC0869e.isVip(c3625e.f8168e.ad, "album_id == "))}))));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC2003e.purchase(obj);
                ((C2921e) this.f18106e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2003e.purchase(obj);
                Activity activity = (Activity) this.f18106e;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity == null) {
                    return null;
                }
                appActivity.crashlytics();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC2003e.purchase(obj);
                C6977e c6977e = ((C15293e) this.f18106e).f11121e;
                (c6977e != null ? c6977e : null).setCurrentItem(1, true);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                ((C8510e) this.f18106e).f17310e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
