package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.IStartCarApp;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.firebase.FirebaseCommonRegistrar;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.MigrationCallback;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11565e implements InterfaceC12523e, InterfaceC8759e, InterfaceC17091e, InterfaceC5808e, MigrationCallback, InterfaceC12504e, InterfaceC14173e, InterfaceC6440e, InterfaceC16996e, InterfaceC12765e, InterfaceC6269e, InterfaceC9595e, InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f23231e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f23232e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23233e;

    public /* synthetic */ C11565e(Context context, C16975e c16975e) {
        this.f23233e = 24;
        this.f23231e = context;
        this.f23232e = c16975e;
    }

    public /* synthetic */ C11565e(C6681e c6681e, C14677e c14677e) {
        this.f23233e = 18;
        Map map = Collections.EMPTY_MAP;
        this.f23232e = c6681e;
        this.f23231e = c14677e;
    }

    public /* synthetic */ C11565e(C12799e c12799e, C14677e c14677e) {
        this.f23233e = 20;
        Map map = Collections.EMPTY_MAP;
        this.f23232e = c12799e;
        this.f23231e = c14677e;
    }

    public /* synthetic */ C11565e(C18177e c18177e, Object obj, long j) {
        this.f23233e = 15;
        this.f23232e = c18177e;
        this.f23231e = obj;
    }

    public /* synthetic */ C11565e(Object obj, Object obj2, int i) {
        this.f23233e = i;
        this.f23232e = obj;
        this.f23231e = obj2;
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e ad(C4524e c4524e) {
        return this;
    }

    @Override // defpackage.InterfaceC14173e
    public void adcel(Object obj, C11715e c11715e) {
        InterfaceC3190e interfaceC3190e = (InterfaceC3190e) obj;
        interfaceC3190e.smaato((InterfaceC16843e) this.f23231e, new C18540e(c11715e, ((C4174e) this.f23232e).f9200e));
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        switch (this.f23233e) {
            case 0:
                C13945e c13945e = (C13945e) this.f23232e;
                Context context = (Context) this.f23231e;
                Executor executor = c13945e.license;
                executor.execute(new RunnableC12320e(c13945e, context, executor, 1, c7169e, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            case 6:
                C8823e c8823e = (C8823e) this.f23232e;
                String str = (String) this.f23231e;
                c8823e.mo692else(new C9041e(c7169e, c8823e, 7));
                return str;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6681e c6681e = (C6681e) this.f23232e;
                C14677e c14677e = (C14677e) this.f23231e;
                Map map = Collections.EMPTY_MAP;
                c6681e.license(new RunnableC4904e(c6681e, c14677e, c7169e), new RunnableC5512e(3));
                return "Init GlRenderer";
            default:
                C12799e c12799e = (C12799e) this.f23232e;
                C14677e c14677e2 = (C14677e) this.f23231e;
                Map map2 = Collections.EMPTY_MAP;
                c12799e.license(new RunnableC4904e(c12799e, c14677e2, c7169e), new RunnableC5512e(3));
                return "Init GlRenderer";
        }
    }

    @Override // defpackage.InterfaceC6269e
    public Uri appmetrica(Uri uri) {
        return uri;
    }

    @Override // defpackage.InterfaceC6269e
    public C2435e billing(C2435e c2435e) {
        Function0 function0 = (Function0) this.f23232e;
        C15945e c15945e = (C15945e) this.f23231e;
        if (((Boolean) function0.invoke()).booleanValue()) {
            C11537e ad = c2435e.ad();
            ad.adcel = 1;
            return ad.ad();
        }
        Uri uri = c2435e.ad;
        c15945e.getClass();
        C10839e c10839e = C10839e.ad;
        Uri uri2 = null;
        String str = (AbstractC7890e.billing(uri.getScheme(), "vkx") && uri.getPathSegments().size() == 2) ? (String) AbstractC13480e.m3570break(uri.getPathSegments()) : null;
        if (str != null) {
            List m1869private = AbstractC5304e.m1869private(str, new String[]{"_"}, 6);
            String str2 = (String) AbstractC13480e.m3592native(0, m1869private);
            if (str2 != null) {
                long parseLong = Long.parseLong(str2);
                String str3 = (String) AbstractC13480e.m3592native(1, m1869private);
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(parseLong);
                    sb.append('_');
                    sb.append(parseInt);
                    String sb2 = sb.toString();
                    C4199e m4502e = C18353e.vip.m4502e();
                    CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null;
                    if (cachedTrack != null && cachedTrack.crashlytics() && AbstractC11062e.f21949e.isVip(AbstractC12546e.billing(cachedTrack))) {
                        uri2 = Uri.parse(AbstractC12546e.billing(cachedTrack).f21024e.remoteconfig());
                    }
                }
            }
        }
        if (uri2 == null) {
            return c2435e;
        }
        C11537e ad2 = c2435e.ad();
        ad2.ad = uri2;
        ad2.adcel = 1;
        return ad2.ad();
    }

    @Override // defpackage.InterfaceC8759e
    public Object call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.f23232e;
        Intent intent = (Intent) this.f23231e;
        int i = CarAppNotificationBroadcastReceiver.ad;
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        ((AbstractServiceC13175e) this.f23232e).ad((Intent) this.f23231e);
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        switch (this.f23233e) {
            case 7:
                ((InterfaceC3190e) obj).purchase((C18177e) this.f23232e, (C4194e) this.f23231e);
                return;
            case 8:
            default:
                ((InterfaceC3190e) obj).mo1300default((C18177e) this.f23232e, (Exception) this.f23231e);
                return;
            case 9:
                ((InterfaceC3190e) obj).remoteconfig((C18177e) this.f23232e, (C3335e) this.f23231e);
                return;
            case 10:
                ((InterfaceC3190e) obj).amazon((C18177e) this.f23232e, (C17750e) this.f23231e);
                return;
            case 11:
                ((InterfaceC3190e) obj).mo1295abstract((C18177e) this.f23232e, (C18255e) this.f23231e);
                return;
            case 12:
                ((InterfaceC3190e) obj).mo1302final((C18177e) this.f23232e, (C8256e) this.f23231e);
                return;
            case 13:
                ((InterfaceC3190e) obj).mo1301extends((C18177e) this.f23232e, (C11387e) this.f23231e);
                return;
            case 14:
                C18177e c18177e = (C18177e) this.f23232e;
                C2351e c2351e = (C2351e) this.f23231e;
                ((InterfaceC3190e) obj).tapsense(c18177e, c2351e);
                int i = c2351e.ad;
                return;
            case 15:
                ((InterfaceC3190e) obj).adcel((C18177e) this.f23232e, this.f23231e);
                return;
        }
    }

    @Override // defpackage.InterfaceC16996e
    public void license(C0167e c0167e) {
        C6681e c6681e = (C6681e) this.f23232e;
        C6122e c6122e = (C6122e) this.f23231e;
        c6681e.getClass();
        EnumC5822e enumC5822e = (c6122e.metrica.ad() && c0167e.license) ? EnumC5822e.f12268e : EnumC5822e.f12269e;
        C7188e c7188e = c6681e.f13795e;
        AbstractC7328e.license((AtomicBoolean) c7188e.f14683e, true);
        AbstractC7328e.metrica((Thread) c7188e.f14680e);
        if (((EnumC5822e) c7188e.f14681e) != enumC5822e) {
            c7188e.f14681e = enumC5822e;
            c7188e.remoteconfig(c7188e.f14690e);
        }
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f23233e) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4275e c4275e = (C4275e) this.f23232e;
                interfaceC3001e.mo977e(c4275e.metrica, i, (Surface) this.f23231e);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4275e c4275e2 = (C4275e) this.f23232e;
                interfaceC3001e.mo970e(c4275e2.metrica, i, ((C12053e) this.f23231e).metrica(c4275e2.tapsense()));
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                interfaceC3001e.mo952e(((C4275e) this.f23232e).metrica, i, ((C4491e) this.f23231e).metrica());
                return;
            default:
                C4275e c4275e3 = (C4275e) this.f23232e;
                C4194e c4194e = (C4194e) this.f23231e;
                BinderC4329e binderC4329e = c4275e3.metrica;
                c4194e.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(C4194e.appmetrica, c4194e.ad);
                bundle.putFloat(C4194e.purchase, c4194e.vip);
                interfaceC3001e.mo983e(binderC4329e, i, bundle);
                return;
        }
    }

    @Override // io.realm.kotlin.internal.interop.MigrationCallback
    public void migrate(NativePointer nativePointer, NativePointer nativePointer2, NativePointer nativePointer3) {
        C14918e c14918e = (C14918e) this.f23232e;
        C14694e c14694e = (C14694e) this.f23231e;
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_begin_read(ptr$cinterop_release);
        realmcJNI.realm_begin_read(((LongPointerWrapper) nativePointer2).getPtr$cinterop_release());
        C15506e c15506e = new C15506e(new C7222e(c14918e, nativePointer, 1), new C7222e(c14918e, nativePointer2, 0));
        C18353e c18353e = c14694e.f29113e;
        System.currentTimeMillis();
        C18353e c18353e2 = C18353e.ad;
        C18353e.license(c15506e, 3L, new C10981e(1, C13759e.ad, C13759e.class, "migrate", "migrate(Lio/realm/kotlin/migration/AutomaticSchemaMigration$MigrationContext;)V", 0, 0, 16));
        long ptr$cinterop_release2 = ((LongPointerWrapper) c15506e.ad.yandex().remoteconfig()).getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        if (4 > realmcJNI.realm_get_schema_version(ptr$cinterop_release2)) {
            c15506e.ad("CachedAlbum", new C17689e(21, c15506e.vip));
            Unit unit = Unit.INSTANCE;
        }
        C18353e.license(c15506e, 8L, new C10981e(1, C10818e.ad, C10818e.class, "migrate", "migrate(Lio/realm/kotlin/migration/AutomaticSchemaMigration$MigrationContext;)V", 0, 0, 17));
        System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC1272e[] mopub(Uri uri, Map map) {
        C0433e c0433e = (C0433e) this.f23232e;
        C16975e c16975e = (C16975e) this.f23231e;
        return new InterfaceC1272e[]{c0433e.metrica.mopub(c16975e) ? new C11611e(c0433e.metrica.remoteconfig(c16975e)) : new C14853e(c16975e)};
    }

    @Override // defpackage.InterfaceC17091e
    public void purchase(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = (CarAppPermissionActivity) this.f23232e;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = (IOnRequestPermissionsListener) this.f23231e;
        int i = CarAppPermissionActivity.f276e;
        carAppPermissionActivity.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Boolean bool = (Boolean) entry.getValue();
            if (bool == null || !bool.booleanValue()) {
                arrayList2.add((String) entry.getKey());
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        String valueOf;
        switch (this.f23233e) {
            case 4:
                String str = (String) this.f23232e;
                C7259e c7259e = (C7259e) this.f23231e;
                try {
                    Trace.beginSection(str);
                    return c7259e.purchase.smaato(c18464e);
                } finally {
                    Trace.endSection();
                }
            default:
                String str2 = (String) this.f23232e;
                C12582e c12582e = (C12582e) this.f23231e;
                Context context = (Context) c18464e.ad(Context.class);
                switch (c12582e.f25290e) {
                    case 12:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = BuildConfig.FLAVOR;
                        break;
                    case 13:
                        valueOf = FirebaseCommonRegistrar.ad(context);
                        break;
                    case 14:
                        int i = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = BuildConfig.FLAVOR;
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.vip(installerPackageName);
                            break;
                        }
                        valueOf = BuildConfig.FLAVOR;
                        break;
                }
                return new C7934e(str2, valueOf);
        }
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e startapp(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC6440e
    public InterfaceC6440e vip(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC9595e
    public int yandex(Object obj) {
        Context context = (Context) this.f23231e;
        C16975e c16975e = (C16975e) this.f23232e;
        C10643e c10643e = (C10643e) obj;
        String str = c10643e.vip;
        return ((str.equals(c16975e.loadAd) || str.equals(AbstractC7473e.metrica(c16975e))) && c10643e.metrica(context, c16975e, false) && c10643e.license(c16975e)) ? 1 : 0;
    }
}
