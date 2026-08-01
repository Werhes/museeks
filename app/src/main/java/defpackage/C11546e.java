package defpackage;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11546e {
    public final InterfaceC16964e ad;
    public final int adcel;
    public final C5363e advert;
    public final C14826e appmetrica;
    public ArrayList billing;
    public final InterfaceC16964e license;
    public final C14328e metrica;
    public final C4013e mopub;
    public final Object purchase;
    public final LinkedHashMap startapp;
    public final C17280e vip;
    public final LinkedHashMap yandex;

    /* JADX WARN: Type inference failed for: r1v0, types: [eٍؗۥ, eٌٍۨ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [int, boolean] */
    public C11546e(InterfaceC16964e interfaceC16964e, C17280e c17280e, PackageManager packageManager, C14328e c14328e, InterfaceC16964e interfaceC16964e2, C11802e c11802e, InterfaceC10500e interfaceC10500e) {
        this.ad = interfaceC16964e;
        this.vip = c17280e;
        this.metrica = c14328e;
        this.license = interfaceC16964e2;
        C14826e ad = AbstractC9743e.ad(AbstractC5797e.vip(new C6799e(interfaceC10500e), c17280e.purchase).mo394const(new C5621e("Camera2DeviceCache")));
        this.appmetrica = ad;
        this.purchase = new Object();
        this.yandex = new LinkedHashMap();
        this.startapp = new LinkedHashMap();
        int hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? hasSystemFeature + 1 : hasSystemFeature;
        this.adcel = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        c11802e.metrica(2, new RunnableC17584e(11, this));
        InterfaceC1108e yandex = AbstractC7535e.yandex(AbstractC7535e.metrica(new C1853e(this, (InterfaceC5083e) null, 18)));
        ?? obj = new Object();
        C9831e ad2 = AbstractC14073e.ad(yandex);
        C5981e vip = AbstractC6959e.vip(1, ad2.vip, ad2.metrica);
        AbstractC5336e.appmetrica(obj.equals(C10666e.ad) ? 1 : 4, (InterfaceC8850e) ad2.appmetrica, ad, new C1247e((InterfaceC9347e) obj, (InterfaceC1108e) ad2.license, vip, AbstractC6959e.f14258e, (InterfaceC5083e) null));
        this.mopub = new C4013e(vip);
        this.advert = new C5363e(new C14515e(25, this));
    }

    public static final void ad(C11546e c11546e, InterfaceC9543e interfaceC9543e, String str, boolean z) {
        ArrayList arrayList;
        synchronized (c11546e.purchase) {
            arrayList = c11546e.billing;
        }
        ArrayList arrayList2 = null;
        if (!z) {
            if (!z) {
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (AbstractC7890e.billing(((C5060e) it.next()).ad, str)) {
                            }
                        }
                    }
                }
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayList2 = c11546e.license();
                break;
            }
            throw new C14803e(10);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (AbstractC7890e.billing(((C5060e) it2.next()).ad, str)) {
                    break;
                }
            }
        }
        Log.i("CXCP", "New camera " + str + " detected");
        arrayList2 = c11546e.license();
        if (arrayList2 != null && (arrayList2.size() >= c11546e.adcel || arrayList == null)) {
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            appmetrica(interfaceC9543e, arrayList);
        }
    }

    public static void appmetrica(InterfaceC9543e interfaceC9543e, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (AbstractC17113e.appmetrica(interfaceC9543e, arrayList) instanceof C8870e) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    public final ArrayList license() {
        try {
            String[] cameraIdList = ((CameraManager) this.ad.get()).getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                C5060e.ad(str);
                arrayList.add(new C5060e(str));
            }
            if (arrayList.size() < this.adcel) {
                Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
                return arrayList;
            }
            synchronized (this.purchase) {
                this.billing = arrayList;
                Unit unit = Unit.INSTANCE;
            }
            Log.i("CXCP", "Loaded CameraIdList " + arrayList);
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(java.lang.String r10, defpackage.AbstractC10731e r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C0510e
            if (r0 == 0) goto L13
            r0 = r11
            eؑۗۤ r0 = (defpackage.C0510e) r0
            int r1 = r0.f2608e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2608e = r1
            goto L18
        L13:
            eؑۗۤ r0 = new eؑۗۤ
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f2611e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f2608e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eؙؓٚ r10 = r0.f2607e
            java.lang.String r0 = r0.f2609e
            defpackage.AbstractC2003e.purchase(r11)
            r2 = r10
            r10 = r0
            goto L70
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.AbstractC2003e.purchase(r11)
            java.lang.Object r11 = r9.purchase
            monitor-enter(r11)
            java.util.LinkedHashMap r2 = r9.startapp     // Catch: java.lang.Throwable -> L5d
            eؗٞٚ r4 = new eؗٞٚ     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L5d
            if (r5 != 0) goto L5f
            eٔٛۤ r5 = r9.appmetrica     // Catch: java.lang.Throwable -> L5d
            eٗۜۧ r6 = r9.vip     // Catch: java.lang.Throwable -> L5d
            eؕۥٙ r6 = r6.license     // Catch: java.lang.Throwable -> L5d
            eًٕ۠ r7 = new eًٕ۠     // Catch: java.lang.Throwable -> L5d
            r8 = 0
            r7.<init>(r10, r9, r8)     // Catch: java.lang.Throwable -> L5d
            r8 = 2
            eٌ٘ٚ r5 = defpackage.AbstractC5336e.vip(r8, r6, r5, r7)     // Catch: java.lang.Throwable -> L5d
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r10 = move-exception
            goto L9e
        L5f:
            r2 = r5
            eؙؓٚ r2 = (defpackage.InterfaceC1908e) r2     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r11)
            r0.f2609e = r10
            r0.f2607e = r2
            r0.f2608e = r3
            java.lang.Object r11 = r2.m722e(r0)
            if (r11 != r1) goto L70
            return r1
        L70:
            eؑؗؑ r11 = (defpackage.InterfaceC0107e) r11
            if (r11 != 0) goto L9d
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null camera2DeviceSetupWrapper from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.C5060e.vip(r10)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r9.purchase
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r9.startapp     // Catch: java.lang.Throwable -> L9a
            eؗٞٚ r3 = new eؗٞٚ     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L9a
            j$.util.Map.EL.remove(r1, r3, r2)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r0)
            return r11
        L9a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L9d:
            return r11
        L9e:
            monitor-exit(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11546e.metrica(java.lang.String, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(java.lang.String r11, defpackage.AbstractC10731e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.C14616e
            if (r0 == 0) goto L13
            r0 = r12
            eٍُٔ r0 = (defpackage.C14616e) r0
            int r1 = r0.f28838e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28838e = r1
            goto L18
        L13:
            eٍُٔ r0 = new eٍُٔ
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f28841e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f28838e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eؙؓٚ r11 = r0.f28837e
            java.lang.String r0 = r0.f28839e
            defpackage.AbstractC2003e.purchase(r12)
            r2 = r11
            r11 = r0
            goto L78
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            defpackage.AbstractC2003e.purchase(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            r4 = 0
            if (r12 >= r2) goto L40
            return r4
        L40:
            java.lang.Object r12 = r10.purchase
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.yandex     // Catch: java.lang.Throwable -> L65
            eؗٞٚ r5 = new eؗٞٚ     // Catch: java.lang.Throwable -> L65
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L67
            eٔٛۤ r6 = r10.appmetrica     // Catch: java.lang.Throwable -> L65
            eٗۜۧ r7 = r10.vip     // Catch: java.lang.Throwable -> L65
            eؕۥٙ r7 = r7.license     // Catch: java.lang.Throwable -> L65
            eُؗٓ r8 = new eُؗٓ     // Catch: java.lang.Throwable -> L65
            r9 = 6
            r8.<init>(r11, r10, r4, r9)     // Catch: java.lang.Throwable -> L65
            r4 = 2
            eٌ٘ٚ r6 = defpackage.AbstractC5336e.vip(r4, r7, r6, r8)     // Catch: java.lang.Throwable -> L65
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r11 = move-exception
            goto La6
        L67:
            r2 = r6
            eؙؓٚ r2 = (defpackage.InterfaceC1908e) r2     // Catch: java.lang.Throwable -> L65
            monitor-exit(r12)
            r0.f28839e = r11
            r0.f28837e = r2
            r0.f28838e = r3
            java.lang.Object r12 = r2.m722e(r0)
            if (r12 != r1) goto L78
            return r1
        L78:
            eؚّْ r12 = (defpackage.InterfaceC7106e) r12
            if (r12 != 0) goto La5
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null CameraDeviceSetupCompat from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.C5060e.vip(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.purchase
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r10.yandex     // Catch: java.lang.Throwable -> La2
            eؗٞٚ r3 = new eؗٞٚ     // Catch: java.lang.Throwable -> La2
            r3.<init>(r11)     // Catch: java.lang.Throwable -> La2
            j$.util.Map.EL.remove(r1, r3, r2)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r0)
            return r12
        La2:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        La5:
            return r12
        La6:
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11546e.vip(java.lang.String, eُؑ۠):java.lang.Object");
    }
}
