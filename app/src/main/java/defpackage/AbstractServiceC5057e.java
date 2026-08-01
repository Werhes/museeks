package defpackage;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.PowerManager;
import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC5057e extends AbstractServiceC5667e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final String f10869e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f10871e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC3002e f10872e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public PowerManager.WakeLock f10873e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5363e f10875e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public WifiManager.WifiLock f10876e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AudioTrack f10877e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5363e f10878e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5363e f10879e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C5363e f10880e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C14137e f10874e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public CancellationSignal f10870e = new CancellationSignal();

    static {
        StringBuilder sb = new StringBuilder();
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        sb.append(vKXApplication.getPackageName());
        sb.append(".action.STOP_DL");
        f10869e = sb.toString();
    }

    public AbstractServiceC5057e() {
        final int i = 0;
        this.f10880e = new C5363e(new Function0(this) { // from class: eٔٛ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5057e f29355e;

            {
                this.f29355e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f29355e.appmetrica();
                    case 1:
                        int i2 = Build.VERSION.SDK_INT;
                        AbstractServiceC5057e abstractServiceC5057e = this.f29355e;
                        if (i2 >= 29) {
                            return new C11415e(abstractServiceC5057e.getApplicationContext());
                        }
                        C5775e c5775e = C5775e.ad;
                        c5775e.getClass();
                        C12309e c12309e = C5775e.appmetrica;
                        InterfaceC8614e interfaceC8614e = C5775e.vip[2];
                        return ((Boolean) c12309e.tapsense(c5775e)).booleanValue() ? new C11415e(abstractServiceC5057e.getApplicationContext()) : new Object();
                    case 2:
                        return (PowerManager) this.f29355e.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) this.f29355e.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i2 = 1;
        this.f10879e = new C5363e(new Function0(this) { // from class: eٔٛ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5057e f29355e;

            {
                this.f29355e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f29355e.appmetrica();
                    case 1:
                        int i22 = Build.VERSION.SDK_INT;
                        AbstractServiceC5057e abstractServiceC5057e = this.f29355e;
                        if (i22 >= 29) {
                            return new C11415e(abstractServiceC5057e.getApplicationContext());
                        }
                        C5775e c5775e = C5775e.ad;
                        c5775e.getClass();
                        C12309e c12309e = C5775e.appmetrica;
                        InterfaceC8614e interfaceC8614e = C5775e.vip[2];
                        return ((Boolean) c12309e.tapsense(c5775e)).booleanValue() ? new C11415e(abstractServiceC5057e.getApplicationContext()) : new Object();
                    case 2:
                        return (PowerManager) this.f29355e.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) this.f29355e.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i3 = 2;
        this.f10875e = new C5363e(new Function0(this) { // from class: eٔٛ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5057e f29355e;

            {
                this.f29355e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f29355e.appmetrica();
                    case 1:
                        int i22 = Build.VERSION.SDK_INT;
                        AbstractServiceC5057e abstractServiceC5057e = this.f29355e;
                        if (i22 >= 29) {
                            return new C11415e(abstractServiceC5057e.getApplicationContext());
                        }
                        C5775e c5775e = C5775e.ad;
                        c5775e.getClass();
                        C12309e c12309e = C5775e.appmetrica;
                        InterfaceC8614e interfaceC8614e = C5775e.vip[2];
                        return ((Boolean) c12309e.tapsense(c5775e)).booleanValue() ? new C11415e(abstractServiceC5057e.getApplicationContext()) : new Object();
                    case 2:
                        return (PowerManager) this.f29355e.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) this.f29355e.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        final int i4 = 3;
        this.f10878e = new C5363e(new Function0(this) { // from class: eٔٛ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractServiceC5057e f29355e;

            {
                this.f29355e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return this.f29355e.appmetrica();
                    case 1:
                        int i22 = Build.VERSION.SDK_INT;
                        AbstractServiceC5057e abstractServiceC5057e = this.f29355e;
                        if (i22 >= 29) {
                            return new C11415e(abstractServiceC5057e.getApplicationContext());
                        }
                        C5775e c5775e = C5775e.ad;
                        c5775e.getClass();
                        C12309e c12309e = C5775e.appmetrica;
                        InterfaceC8614e interfaceC8614e = C5775e.vip[2];
                        return ((Boolean) c12309e.tapsense(c5775e)).booleanValue() ? new C11415e(abstractServiceC5057e.getApplicationContext()) : new Object();
                    case 2:
                        return (PowerManager) this.f29355e.getApplicationContext().getSystemService(PowerManager.class);
                    default:
                        return (WifiManager) this.f29355e.getApplicationContext().getSystemService(WifiManager.class);
                }
            }
        });
        C12927e.license().loadAd = true;
    }

    public final void adcel() {
        try {
            PowerManager.WakeLock wakeLock = this.f10873e;
            if (wakeLock != null) {
                wakeLock.release();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
        try {
            WifiManager.WifiLock wifiLock = this.f10876e;
            if (wifiLock != null) {
                wifiLock.release();
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Throwable unused2) {
        }
    }

    public abstract AbstractC16039e appmetrica();

    public final AbstractC16039e billing() {
        return (AbstractC16039e) this.f10880e.getValue();
    }

    public final void license() {
        AbstractC16039e billing = billing();
        NotificationManager notificationManager = billing.f31589e;
        AbstractServiceC5057e abstractServiceC5057e = billing.f31590e;
        if (abstractServiceC5057e.f10872e != null) {
            billing.f31588e = true;
            notificationManager.cancel(billing.appmetrica());
            notificationManager.cancel(abstractServiceC5057e.f10872e.ad.hashCode());
            billing.smaato(true);
        }
        this.f10870e.cancel();
        adcel();
        AbstractC5336e.purchase(AbstractC4608e.metrica(vip()), AbstractC6731e.ad, 0, new C13176e(this, null, 0), 2);
    }

    public final void metrica() {
        PowerManager.WakeLock wakeLock;
        PowerManager powerManager;
        PowerManager.WakeLock wakeLock2 = this.f10873e;
        if (wakeLock2 == null || this.f10876e == null) {
            WifiManager.WifiLock wifiLock = null;
            if (wakeLock2 == null) {
                try {
                    powerManager = (PowerManager) this.f10875e.getValue();
                } catch (Exception unused) {
                }
                if (powerManager != null) {
                    wakeLock = powerManager.newWakeLock(1, "VKX:BdsWakeLock-".concat(billing().billing()));
                    this.f10873e = wakeLock;
                }
                wakeLock = null;
                this.f10873e = wakeLock;
            }
            if (this.f10876e == null) {
                try {
                    WifiManager wifiManager = (WifiManager) this.f10878e.getValue();
                    if (wifiManager != null) {
                        wifiLock = wifiManager.createWifiLock(3, "VKX:BdsWifiLock-".concat(billing().billing()));
                    }
                } catch (Exception unused2) {
                }
                this.f10876e = wifiLock;
            }
        }
        try {
            PowerManager.WakeLock wakeLock3 = this.f10873e;
            if (wakeLock3 != null) {
                C17647e c17647e = C14157e.f27993e;
                wakeLock3.acquire(C14157e.license(AbstractC0326e.Signature(5, EnumC15934e.MINUTES)));
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused3) {
        }
        try {
            WifiManager.WifiLock wifiLock2 = this.f10876e;
            if (wifiLock2 != null) {
                wifiLock2.acquire();
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Throwable unused4) {
        }
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC16039e billing = billing();
        AbstractC11815e.Signature(billing.f31590e, billing.vip(), billing.metrica(), billing.ad());
        C18220e metrica = AbstractC4608e.metrica(vip());
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(metrica, ExecutorC3603e.f8134e, 0, new C13176e(this, null, 1), 2);
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final void onDestroy() {
        adcel();
        this.f10872e = null;
        this.f10877e = null;
        this.f10873e = null;
        this.f10876e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (!AbstractC7890e.billing(intent != null ? intent.getAction() : null, f10869e)) {
            return 1;
        }
        license();
        return 1;
    }

    public abstract Object purchase(AbstractC3002e abstractC3002e, AbstractC10731e abstractC10731e);

    public final InterfaceC9842e startapp() {
        return (InterfaceC9842e) this.f10879e.getValue();
    }
}
