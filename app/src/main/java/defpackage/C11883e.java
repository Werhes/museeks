package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.session.MediaController;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.license;
import android.support.v4.media.session.vip;
import android.util.Log;
import android.util.SparseArray;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase_Impl;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11883e implements InterfaceC3399e, InterfaceC2295e, InterfaceC12233e, InterfaceC12163e, InterfaceC16794e, InterfaceC5283e, InterfaceC17556e, InterfaceC2868e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f23814e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f23815e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23816e;

    public C11883e(int i) {
        this.f23816e = i;
        switch (i) {
            case 20:
                this.f23815e = new C16253e(128);
                this.f23814e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                return;
            default:
                this.f23815e = new HashMap();
                this.f23814e = new HashMap();
                return;
        }
    }

    public C11883e(int i, Object obj) {
        this.f23816e = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f23815e = obj;
                this.f23814e = Thread.currentThread();
                return;
            default:
                this.f23814e = obj;
                this.f23815e = new ArrayList();
                return;
        }
    }

    public /* synthetic */ C11883e(int i, boolean z) {
        this.f23816e = i;
    }

    public C11883e(Context context, int i) {
        this.f23816e = i;
        switch (i) {
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f23815e = context;
                return;
            default:
                AbstractC9528e.startapp(context);
                Resources resources = context.getResources();
                this.f23815e = resources;
                this.f23814e = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public C11883e(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f23816e = 1;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f23814e = DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23815e = new vip(context, mediaSessionCompat$Token);
        } else {
            this.f23815e = new vip(context, mediaSessionCompat$Token);
        }
    }

    public C11883e(IBinder iBinder, Bundle bundle) {
        this.f23816e = 0;
        this.f23815e = new Messenger(iBinder);
        this.f23814e = bundle;
    }

    public C11883e(WorkDatabase_Impl workDatabase_Impl) {
        this.f23816e = 29;
        this.f23815e = workDatabase_Impl;
        this.f23814e = new C3606e(workDatabase_Impl, 5);
    }

    public C11883e(C1410e c1410e, int[] iArr) {
        this.f23816e = 4;
        this.f23815e = AbstractC17475e.remoteconfig(c1410e);
        this.f23814e = iArr;
    }

    public C11883e(C6928e c6928e) {
        this.f23816e = 21;
        this.f23814e = c6928e;
        this.f23815e = new C2125e(4, new byte[4]);
    }

    public C11883e(C17919e c17919e) {
        this.f23816e = 9;
        this.f23815e = new HashMap(c17919e.ad);
        this.f23814e = new HashMap(c17919e.vip);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x04e5, code lost:
    
        r42 = r5;
        r29 = r8;
        r28 = r10;
        r31 = r11;
        r36 = r12;
        r40 = r13;
        r44 = r14;
        r39 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04f9, code lost:
    
        if (r7 <= 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04fb, code lost:
    
        r2 = defpackage.C0914e.ad;
        r3 = defpackage.EnumC1005e.f3456e;
        r2.getClass();
        r2 = defpackage.C1724e.ad;
        r50.skip(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0508, code lost:
    
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05a0, code lost:
    
        r24 = r3;
        r42 = r5;
        r28 = r10;
        r31 = r11;
        r36 = r12;
        r40 = r13;
        r44 = r14;
        r39 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05b4, code lost:
    
        r50.skip(r6);
        r10 = r28;
        r0 = r44;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x06b2, code lost:
    
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x06b5, code lost:
    
        if (r10 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06b7, code lost:
    
        if (r18 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06bc, code lost:
    
        if (r4.appmetrica != (-1)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x06be, code lost:
    
        r4.appmetrica = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06c3, code lost:
    
        if (r4.license != (-1)) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06c5, code lost:
    
        r4.license = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x06cb, code lost:
    
        if (r4.billing != (-1)) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06cd, code lost:
    
        r4.billing = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x06d7, code lost:
    
        if (defpackage.AbstractC8433e.license(r4.yandex) == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x06d9, code lost:
    
        r4.yandex = "AAC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x06dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x06e3, code lost:
    
        throw new java.lang.Exception("This file does not appear to be an Mp4 Audio file, could be corrupted or video ");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [eٍُٝ, eْٟؓ] */
    /* JADX WARN: Type inference failed for: r2v28, types: [eؘؚْ, eٍُٝ] */
    /* JADX WARN: Type inference failed for: r5v35, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eًۖۧ, eٍُٝ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11883e(defpackage.C18529e r49, defpackage.C13197e r50, defpackage.C7051e r51, long r52, boolean r54) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11883e.<init>(eۨؕ, eُْۗ, eَؙؚ, long, boolean):void");
    }

    public /* synthetic */ C11883e(Object obj, Object obj2, int i) {
        this.f23816e = i;
        this.f23815e = obj;
        this.f23814e = obj2;
    }

    public /* synthetic */ C11883e(Object obj, Object obj2, boolean z, int i) {
        this.f23816e = i;
        this.f23814e = obj;
        this.f23815e = obj2;
    }

    public C11883e(ExecutorService executorService) {
        this.f23816e = 12;
        this.f23814e = new C17519e(0);
        this.f23815e = executorService;
    }

    public C11883e(Csynchronized csynchronized) {
        this.f23816e = 6;
        this.f23815e = csynchronized;
        this.f23814e = new AtomicInteger(0);
    }

    @Override // defpackage.InterfaceC12163e
    public Object Signature(C13840e c13840e, Object obj) {
        return ((Function2) this.f23815e).invoke(c13840e, obj);
    }

    @Override // defpackage.InterfaceC5283e
    public void ad(C1292e c1292e) {
        C6928e c6928e = (C6928e) this.f23814e;
        SparseArray sparseArray = c6928e.yandex;
        C2125e c2125e = (C2125e) this.f23815e;
        if (c1292e.ads() == 0 && (c1292e.ads() & 128) != 0) {
            c1292e.m568protected(6);
            int ad = c1292e.ad() / 4;
            for (int i = 0; i < ad; i++) {
                c1292e.mopub(0, 4, c2125e.vip);
                c2125e.smaato(0);
                int billing = c2125e.billing(16);
                c2125e.loadAd(3);
                if (billing == 0) {
                    c2125e.loadAd(13);
                } else {
                    int billing2 = c2125e.billing(13);
                    if (sparseArray.get(billing2) == null) {
                        sparseArray.put(billing2, new C16531e(new C10379e(c6928e, billing2)));
                        c6928e.amazon++;
                    }
                }
            }
            if (c6928e.ad != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public String adcel(String str) {
        String str2 = (String) this.f23814e;
        Resources resources = (Resources) this.f23815e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void admob(C13632e c13632e) {
        if (c13632e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f23814e).add(c13632e)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        c13632e.purchase(handler);
        vip vipVar = (vip) this.f23815e;
        vipVar.ad.registerCallback(c13632e.ad, handler);
        synchronized (vipVar.vip) {
            if (vipVar.appmetrica.ad() != null) {
                BinderC7743e binderC7743e = new BinderC7743e(c13632e);
                vipVar.license.put(c13632e, binderC7743e);
                c13632e.metrica = binderC7743e;
                try {
                    vipVar.appmetrica.ad().mo17e(binderC7743e);
                    c13632e.appmetrica(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                c13632e.metrica = null;
                vipVar.metrica.add(c13632e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.support.v4.media.session.license, eؘْۧ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.support.v4.media.session.license, eؘْۧ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.support.v4.media.session.license, eؘْۧ] */
    public C13097e advert() {
        MediaController.TransportControls transportControls = ((vip) this.f23815e).ad.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 && i >= 24) {
            return new license(transportControls);
        }
        return new license(transportControls);
    }

    public void amazon(int i, int i2) {
        int[] iArr = (int[]) this.f23815e;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        purchase(i3);
        int[] iArr2 = (int[]) this.f23815e;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f23815e, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f23814e;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12788e c12788e = (C12788e) ((ArrayList) this.f23814e).get(size);
            int i4 = c12788e.f25591e;
            if (i4 >= i) {
                c12788e.f25591e = i4 + i2;
            }
        }
    }

    @Override // defpackage.InterfaceC2868e
    public InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        AbstractC9932e[] abstractC9932eArr;
        AbstractC9932e[] abstractC9932eArr2;
        C15664e c15664e = interfaceC6396e instanceof C15664e ? (C15664e) interfaceC6396e : null;
        C15664e c15664e2 = (C15664e) this.f23815e;
        int i = c15664e2.purchase;
        int length = c15664e2.metrica.length;
        if (c15664e != null && c15664e.purchase >= i && (abstractC9932eArr = c15664e.metrica) != null && abstractC9932eArr.length >= length && (abstractC9932eArr2 = c15664e.license) != null && abstractC9932eArr2.length >= length) {
            int i2 = c15664e.ad;
            if (i2 > 0) {
                c15664e.ad = i2 - 1;
            }
            return c15664e;
        }
        C15664e c15664e3 = new C15664e();
        c15664e3.ad = c15664e2.ad;
        AbstractC9932e abstractC9932e = ((C15664e) this.f23815e).appmetrica;
        if (abstractC9932e != null) {
            c15664e3.appmetrica = abstractC9932e.pro((AbstractC7861e) ((C6594e) this.f23814e).f13613e);
        }
        AbstractC9932e[] abstractC9932eArr3 = ((C15664e) this.f23815e).metrica;
        int length2 = abstractC9932eArr3.length;
        AbstractC9932e[] abstractC9932eArr4 = new AbstractC9932e[length2];
        for (int i3 = 0; i3 < abstractC9932eArr3.length; i3++) {
            abstractC9932eArr4[i3] = abstractC9932eArr3[i3].pro((AbstractC7861e) ((C6594e) this.f23814e).f13613e);
        }
        c15664e3.metrica = abstractC9932eArr4;
        c15664e3.purchase = i;
        AbstractC9932e[] abstractC9932eArr5 = new AbstractC9932e[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            abstractC9932eArr5[i4] = abstractC9932eArr4[i4].loadAd();
        }
        c15664e3.license = abstractC9932eArr5;
        return c15664e3;
    }

    @Override // defpackage.InterfaceC5283e
    public void billing(C8010e c8010e, InterfaceC5483e interfaceC5483e, C18316e c18316e) {
    }

    @Override // defpackage.InterfaceC3399e
    public void cancel() {
        if (((C11936e) this.f23814e).compareAndSet(1, 1)) {
            return;
        }
        ((Csynchronized) this.f23815e).invoke();
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        int i = 12;
        C7936e c7936e = new C7936e(i);
        C14595e c14595e = new C14595e(i);
        Object obj = ((InterfaceC16964e) this.f23815e).get();
        InterfaceC16964e interfaceC16964e = (InterfaceC16964e) this.f23814e;
        return new C2417e(c7936e, c14595e, C0176e.purchase, (C17438e) obj, interfaceC16964e);
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        FileWriter fileWriter;
        C4956e c4956e = (C4956e) this.f23814e;
        JSONObject jSONObject = (JSONObject) ((ExecutorC4614e) ((C12894e) this.f23815e).f25752e).f9946e.submit(new CallableC16976e(1, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            C13827e m3751while = ((C13935e) c4956e.f10512e).m3751while(jSONObject);
            C7988e c7988e = (C7988e) c4956e.f10511e;
            long j = m3751while.metrica;
            c7988e.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) c7988e.f16176e);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        AbstractC6494e.billing(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    AbstractC6494e.billing(fileWriter, "Failed to close settings writer.");
                    C4956e.subscription(jSONObject, "Loaded settings: ");
                    String str = ((C6708e) c4956e.f10513e).purchase;
                    SharedPreferences.Editor edit = ((Context) c4956e.f10517e).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    ((AtomicReference) c4956e.f10514e).set(m3751while);
                    ((C8988e) ((AtomicReference) c4956e.f10516e).get()).license(m3751while);
                    return AbstractC1749e.appmetrica(null);
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC6494e.billing(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            AbstractC6494e.billing(fileWriter, "Failed to close settings writer.");
            C4956e.subscription(jSONObject, "Loaded settings: ");
            String str2 = ((C6708e) c4956e.f10513e).purchase;
            SharedPreferences.Editor edit2 = ((Context) c4956e.f10517e).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ((AtomicReference) c4956e.f10514e).set(m3751while);
            ((C8988e) ((AtomicReference) c4956e.f10516e).get()).license(m3751while);
        }
        return AbstractC1749e.appmetrica(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:18:0x00ac, B:19:0x00b2, B:22:0x0138, B:37:0x00b7, B:38:0x00c3, B:39:0x00ca, B:41:0x00ce, B:43:0x00d5, B:44:0x00e8, B:46:0x00ec, B:48:0x00f1, B:50:0x00fb, B:51:0x0101, B:52:0x0116, B:53:0x0117, B:55:0x011d, B:58:0x0122, B:59:0x0129, B:60:0x012a, B:61:0x0131, B:63:0x0132), top: B:17:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:18:0x00ac, B:19:0x00b2, B:22:0x0138, B:37:0x00b7, B:38:0x00c3, B:39:0x00ca, B:41:0x00ce, B:43:0x00d5, B:44:0x00e8, B:46:0x00ec, B:48:0x00f1, B:50:0x00fb, B:51:0x0101, B:52:0x0116, B:53:0x0117, B:55:0x011d, B:58:0x0122, B:59:0x0129, B:60:0x012a, B:61:0x0131, B:63:0x0132), top: B:17:0x00ac }] */
    @Override // defpackage.InterfaceC2295e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void license(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11883e.license(java.lang.Object):void");
    }

    public void loadAd(int i, int i2) {
        int[] iArr = (int[]) this.f23815e;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        purchase(i3);
        int[] iArr2 = (int[]) this.f23815e;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f23815e;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f23814e;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C12788e c12788e = (C12788e) ((ArrayList) this.f23814e).get(size);
            int i4 = c12788e.f25591e;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f23814e).remove(size);
                } else {
                    c12788e.f25591e = i4 - i2;
                }
            }
        }
    }

    public void metrica() {
        int[] iArr = (int[]) this.f23815e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f23814e = null;
    }

    public ArrayList mopub(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23815e;
        C6096e purchase = C6096e.purchase(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                arrayList.add(billing.getString(0));
            }
            return arrayList;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    public void pro(C13632e c13632e) {
        if (c13632e == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f23814e).remove(c13632e)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((vip) this.f23815e).vip(c13632e);
        } finally {
            c13632e.purchase(null);
        }
    }

    public void purchase(int i) {
        int[] iArr = (int[]) this.f23815e;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f23815e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f23815e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f23815e;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void remoteconfig(InterfaceC8614e interfaceC8614e, Object obj) {
        if (AbstractC7890e.billing(this.f23814e, obj)) {
            return;
        }
        this.f23814e = obj;
        ((C2899e) this.f23815e).invoke();
    }

    public void signatures(boolean z, boolean z2) {
        Context context = (Context) this.f23815e;
        if (z && ((WifiManager.WifiLock) this.f23814e) == null) {
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                AbstractC2803e.smaato("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                AbstractC2803e.smaato("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f23814e = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f23814e;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public boolean smaato(C16184e c16184e, String str) {
        Context context = (Context) this.f23815e;
        int i = c16184e.vip;
        return i < 0 ? context.getPackageManager().checkPermission(str, c16184e.ad) == 0 : context.checkPermission(str, i, c16184e.metrica) == 0;
    }

    @Override // defpackage.InterfaceC12163e
    public Object startapp(Object obj) {
        return ((Function1) this.f23814e).invoke(obj);
    }

    public void subscription(C9938e c9938e) {
        HashMap hashMap = (HashMap) this.f23815e;
        if (c9938e == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C2738e c2738e = new C2738e(c9938e.ad, c9938e.vip);
        if (!hashMap.containsKey(c2738e)) {
            hashMap.put(c2738e, c9938e);
            return;
        }
        C9938e c9938e2 = (C9938e) hashMap.get(c2738e);
        if (c9938e2.equals(c9938e) && c9938e.equals(c9938e2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + c2738e);
    }

    public String toString() {
        switch (this.f23816e) {
            case 5:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f23814e.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f23815e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "var " + ((String) this.f23815e) + " = " + ((InterfaceC17556e) this.f23814e) + ";";
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((InterfaceC7004e) this.f23815e) + " + " + ((InterfaceC7004e) this.f23814e);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C2443e) this.f23815e) + " = " + ((InterfaceC17556e) this.f23814e) + ";";
            default:
                return super.toString();
        }
    }

    public void vip(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f23815e).add(AbstractC8647e.ads(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        AbstractC9464e.pro("Recorder", "VideoEncoder Setup error: " + th, th);
        C16042e c16042e = (C16042e) this.f23814e;
        int i = c16042e.f31596e;
        if (i < c16042e.f31598e) {
            c16042e.f31596e = i + 1;
            RunnableC2783e runnableC2783e = new RunnableC2783e(28, this);
            c16042e.f31600e = AbstractC3062e.amazon().schedule(new RunnableC11247e(((C13343e) c16042e.f31599e).license, runnableC2783e, 4), C13343e.f26599throw, TimeUnit.MILLISECONDS);
            return;
        }
        C13343e c13343e = (C13343e) c16042e.f31599e;
        synchronized (c13343e.purchase) {
            try {
                switch (c13343e.yandex.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                        c13343e.pro(-1);
                        c13343e.remoteconfig(EnumC18485e.f36243e);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + c13343e.yandex + ": " + th);
                }
            } finally {
            }
        }
    }
}
