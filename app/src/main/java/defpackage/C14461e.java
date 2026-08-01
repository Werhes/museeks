package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14461e implements InterfaceC15813e, InterfaceC12233e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f28585e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f28586e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f28587e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f28588e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f28589e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f28590e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f28591e;

    public C14461e() {
        this.f28587e = null;
        this.f28589e = null;
        this.f28586e = null;
        this.f28588e = null;
        this.f28585e = null;
        this.f28591e = null;
    }

    public C14461e(C2532e c2532e, InterfaceC5052e interfaceC5052e, C11709e c11709e, List list, InterfaceC3054e interfaceC3054e) {
        this.f28586e = c2532e;
        this.f28588e = interfaceC5052e;
        this.f28585e = c11709e;
        this.f28591e = list;
        this.f28590e = interfaceC3054e;
        this.f28589e = c2532e;
        this.f28587e = new HashMap();
    }

    public /* synthetic */ C14461e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f28589e = obj;
        this.f28587e = obj2;
        this.f28586e = obj3;
        this.f28588e = obj4;
        this.f28585e = obj5;
        this.f28591e = obj6;
        this.f28590e = obj7;
    }

    public static C3023e ad(C3023e c3023e, C16911e c16911e, C10017e c10017e, Map map) {
        Map unmodifiableMap;
        C10841e ad = c3023e.ad();
        String license = ((InterfaceC5974e) c16911e.f33136e).license();
        if (license != null) {
            ad.appmetrica = new C9121e(license);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        C5609e c5609e = (C5609e) c10017e.f19784e;
        if (map.isEmpty()) {
            unmodifiableMap = ((C0620e) ((AtomicMarkableReference) c5609e.f11962e).getReference()).ad();
        } else {
            HashMap hashMap = new HashMap(((C0620e) ((AtomicMarkableReference) c5609e.f11962e).getReference()).ad());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String vip = C0620e.vip(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(vip)) {
                    hashMap.put(vip, C0620e.vip(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List startapp = startapp(unmodifiableMap);
        List startapp2 = startapp(((C0620e) ((AtomicMarkableReference) ((C5609e) c10017e.f19791e).f11962e).getReference()).ad());
        if (!startapp.isEmpty() || !startapp2.isEmpty()) {
            C13690e c13690e = (C13690e) c3023e.metrica;
            ad.metrica = new C13690e(c13690e.ad, startapp, startapp2, c13690e.license, c13690e.appmetrica, c13690e.purchase, c13690e.billing);
        }
        return ad.ad();
    }

    public static synchronized void advert(File file) {
        synchronized (C14461e.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String appmetrica(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C12916e loadAd(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C3599e m1382interface = C3599e.m1382interface(byteArrayInputStream, C5712e.ad());
            byteArrayInputStream.close();
            return new C12916e(14, (C18074e) C17424e.isVip(m1382interface).ads().inmobi());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static List pro(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static C14461e purchase(Context context, C17960e c17960e, C14461e c14461e, C15621e c15621e, C16911e c16911e, C10017e c10017e, C5891e c5891e, C4956e c4956e, C3168e c3168e, C1386e c1386e, C12894e c12894e) {
        C9601e c9601e = new C9601e(context, c17960e, c15621e, c5891e, c4956e);
        C14848e c14848e = new C14848e(c14461e, c4956e, c1386e);
        C0109e c0109e = C6003e.vip;
        C6553e.vip(context);
        return new C14461e(c9601e, c14848e, new C6003e(new C17553e(C6553e.ad().metrica(new C12664e(C6003e.metrica, C6003e.license)).ad("FIREBASE_CRASHLYTICS_REPORT", new C12007e("json"), C6003e.appmetrica), c4956e.mopub(), c3168e)), c16911e, c10017e, c17960e, c12894e);
    }

    public static byte[] smaato(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return AbstractC5706e.metrica(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC5087e.m1746extends("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static List startapp(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C13001e(str, str2));
        }
        Collections.sort(arrayList, new C6575e(23));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean subscription(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                subscription(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eؖۢؕ, java.lang.Object] */
    public static AbstractC7796e vip(C3023e c3023e, C10017e c10017e) {
        List metrica = ((C7417e) c10017e.f19790e).metrica();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < metrica.size(); i++) {
            AbstractC15737e abstractC15737e = (AbstractC15737e) metrica.get(i);
            abstractC15737e.getClass();
            ?? obj = new Object();
            C12258e c12258e = (C12258e) abstractC15737e;
            String str = c12258e.appmetrica;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c12258e.vip;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            obj.ad = new C15373e(str2, str);
            String str3 = c12258e.metrica;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            obj.vip = str3;
            String str4 = c12258e.license;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            obj.metrica = str4;
            obj.license = c12258e.purchase;
            obj.appmetrica = (byte) (obj.appmetrica | 1);
            arrayList.add(obj.ad());
        }
        if (arrayList.isEmpty()) {
            return c3023e;
        }
        C10841e ad = c3023e.ad();
        ad.purchase = new C14441e(arrayList);
        return ad.ad();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؑۡٛ, java.lang.Object] */
    public C12916e Signature(byte[] bArr) {
        try {
            this.f28585e = new Object().vip((String) this.f28588e);
            try {
                return new C12916e(14, (C18074e) AbstractC17808e.billing(new C7850e(4, new ByteArrayInputStream(bArr)), (C4536e) this.f28585e, new byte[0]).ads().inmobi());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return loadAd(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                C12916e loadAd = loadAd(bArr);
                Object obj = C2362e.f5913e;
                Log.w("eؘؔؕ", "cannot use Android Keystore, it'll be disabled", e2);
                return loadAd;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, eؘُۛ] */
    public void adcel(Throwable th, Thread thread, String str, C13787e c13787e, boolean z) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b;
        boolean equals = str.equals("crash");
        C9601e c9601e = (C9601e) this.f28589e;
        long j = c13787e.vip;
        Context context = c9601e.ad;
        int i = context.getResources().getConfiguration().orientation;
        C5891e c5891e = c9601e.license;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        C11467e c11467e = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            c11467e = new C11467e(th3.getLocalizedMessage(), th3.getClass().getName(), c5891e.advert(th3.getStackTrace()), c11467e);
        }
        ?? obj = new Object();
        obj.vip = str;
        obj.ad = j;
        obj.billing = (byte) (obj.billing | 1);
        AbstractC0235e vip = C7136e.ad.vip(context);
        int i2 = ((C3116e) vip).metrica;
        Boolean valueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList ad = C7136e.ad(context);
        byte b2 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c11467e.f23069e;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b3 = (byte) 1;
        List license = C9601e.license(stackTraceElementArr, 4);
        if (license == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = valueOf;
        if (b3 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b3 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
        }
        arrayList.add(new C10899e(4, name, license));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b = b3;
                } else {
                    StackTraceElement[] advert = c5891e.advert(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List license2 = C9601e.license(advert, 0);
                    if (license2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b3 != 1) {
                        byte b4 = b3;
                        StringBuilder sb2 = new StringBuilder();
                        if (b4 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb2));
                    }
                    b = b3;
                    arrayList.add(new C10899e(0, name2, license2));
                }
                it2 = it;
                b3 = b;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        C10216e metrica = C9601e.metrica(c11467e, 0);
        C10330e appmetrica = C9601e.appmetrica();
        List ad2 = c9601e.ad();
        if (ad2 == null) {
            throw new NullPointerException("Null binaries");
        }
        C15644e c15644e = new C15644e(unmodifiableList, metrica, null, appmetrica, ad2);
        if (b2 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b2 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb3));
        }
        obj.metrica = new C13690e(c15644e, null, null, bool, vip, ad, i);
        obj.license = c9601e.vip(i);
        C3023e ad3 = obj.ad();
        Map map = c13787e.metrica;
        C16911e c16911e = (C16911e) this.f28588e;
        C10017e c10017e = (C10017e) this.f28585e;
        AbstractC7796e vip2 = vip(ad(ad3, c16911e, c10017e, map), c10017e);
        if (z) {
            ((C14848e) this.f28587e).license(vip2, c13787e.ad, equals);
        } else {
            ((ExecutorC4614e) ((C12894e) this.f28590e).f25750e).ad(new RunnableC8044e(this, vip2, c13787e, equals, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؑۡٛ, java.lang.Object] */
    public C4536e admob() {
        Object obj = C2362e.f5913e;
        ?? obj2 = new Object();
        try {
            boolean ad = C0633e.ad((String) this.f28588e);
            try {
                return obj2.vip((String) this.f28588e);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!ad) {
                    throw new KeyStoreException(AbstractC5087e.m1746extends("the master key ", (String) this.f28588e, " exists but is unusable"), e);
                }
                Object obj3 = C2362e.f5913e;
                Log.w("eؘؔؕ", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj4 = C2362e.f5913e;
            Log.w("eؘؔؕ", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
        AbstractC13656e adcel = C9616e.adcel((C16113e) ((C2532e) this.f28589e).f6385e, obj);
        if (adcel == null) {
            adcel = new C15873e("Unsupported annotation argument: " + c0520e);
        }
        ((HashMap) this.f28587e).put(c0520e, adcel);
    }

    public C12916e billing() {
        C2362e c2362e = (C2362e) this.f28591e;
        if (c2362e == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        AbstractC12699e abstractC12699e = (AbstractC12699e) c2362e.f5914e;
        int i = 14;
        if (abstractC12699e == null) {
            try {
                abstractC12699e = AbstractC15268e.license((abstractC12699e instanceof C4062e ? (C7818e) ((C4062e) abstractC12699e).ad.f34141e : (C7818e) ((C17424e) C15619e.vip.yandex(abstractC12699e)).f34141e).appmetrica());
            } catch (GeneralSecurityException e) {
                throw new C14803e(14, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + abstractC12699e, e);
            }
        }
        C17424e inmobi = C17424e.inmobi(abstractC12699e);
        Context context = (Context) this.f28587e;
        String str = (String) this.f28589e;
        C10312e c10312e = new C10312e(context, str, (String) this.f28586e);
        C4536e c4536e = (C4536e) this.f28585e;
        Object obj = C2362e.f5913e;
        try {
            if (c4536e != null) {
                AbstractC17808e.adcel(inmobi, c10312e, c4536e, new byte[0]);
            } else {
                if (!((SharedPreferences.Editor) c10312e.f20360e).putString(str, AbstractC5706e.license(inmobi.ads().appmetrica())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            }
            return new C12916e(i, (C18074e) inmobi.ads().inmobi());
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
        ((HashMap) this.f28587e).put(c0520e, new C8259e(c11709e, c0520e2));
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, eؗ٘ٔ] */
    @Override // defpackage.InterfaceC16964e
    public Object get() {
        Context context = (Context) ((InterfaceC16964e) this.f28589e).get();
        C11833e c11833e = (C11833e) ((InterfaceC16964e) this.f28587e).get();
        InterfaceC8685e interfaceC8685e = (InterfaceC8685e) ((InterfaceC16964e) this.f28586e).get();
        C12894e c12894e = (C12894e) ((C6029e) this.f28588e).get();
        Executor executor = (Executor) ((InterfaceC16964e) this.f28585e).get();
        InterfaceC1640e interfaceC1640e = (InterfaceC1640e) ((InterfaceC16964e) this.f28591e).get();
        C7936e c7936e = new C7936e(12);
        C14595e c14595e = new C14595e(12);
        InterfaceC2361e interfaceC2361e = (InterfaceC2361e) ((InterfaceC16964e) this.f28590e).get();
        ?? obj = new Object();
        obj.f10517e = context;
        obj.f10513e = c11833e;
        obj.f10512e = interfaceC8685e;
        obj.f10515e = c12894e;
        obj.f10511e = executor;
        obj.f10519e = interfaceC1640e;
        obj.f10518e = c7936e;
        obj.f10514e = c14595e;
        obj.f10516e = interfaceC2361e;
        return obj;
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        ArrayList arrayList = new ArrayList();
        C2532e c2532e = (C2532e) this.f28589e;
        return new C18464e(new C14461e(c2532e, AbstractC1284e.purchase((C16113e) c2532e.f6385e, c11709e, (C11980e) c2532e.f6387e), c11709e, arrayList, InterfaceC3054e.f7112e), this, c0520e, arrayList);
    }

    public void license(String str) {
        File file = new File((File) this.f28587e, str);
        if (file.exists() && subscription(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public synchronized C2362e metrica() {
        C2362e c2362e;
        try {
            if (((String) this.f28589e) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C2362e.f5913e) {
                try {
                    byte[] smaato = smaato((Context) this.f28587e, (String) this.f28589e, (String) this.f28586e);
                    if (smaato == null) {
                        if (((String) this.f28588e) != null) {
                            this.f28585e = admob();
                        }
                        this.f28590e = billing();
                    } else if (((String) this.f28588e) != null) {
                        this.f28590e = Signature(smaato);
                    } else {
                        this.f28590e = loadAd(smaato);
                    }
                    c2362e = new C2362e(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2362e;
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
        C2532e c2532e = (C2532e) this.f28586e;
        C11709e c11709e = (C11709e) this.f28585e;
        HashMap hashMap = (HashMap) this.f28587e;
        boolean z = false;
        if (c11709e.equals(AbstractC13894e.vip)) {
            Object obj = hashMap.get(C0520e.appmetrica("value"));
            C5644e c5644e = obj instanceof C5644e ? (C5644e) obj : null;
            if (c5644e != null) {
                Object obj2 = c5644e.ad;
                C1646e c1646e = obj2 instanceof C1646e ? (C1646e) obj2 : null;
                if (c1646e != null) {
                    z = c2532e.m934switch(c1646e.ad.ad);
                }
            }
        }
        if (z || c2532e.m934switch(c11709e)) {
            return;
        }
        ((List) this.f28591e).add(new C4263e(((InterfaceC5052e) this.f28588e).mo1458e(), hashMap, (InterfaceC3054e) this.f28590e));
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
        ((HashMap) this.f28587e).put(c0520e, new C5644e(c5302e));
    }

    public C0560e signatures(String str, Executor executor) {
        C16281e c16281e;
        C8988e c8988e;
        ArrayList vip = ((C14848e) this.f28587e).vip();
        ArrayList arrayList = new ArrayList();
        Iterator it = vip.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C0109e c0109e = C14848e.billing;
                String appmetrica = C14848e.appmetrica(file);
                c0109e.getClass();
                arrayList.add(new C16281e(C0109e.startapp(appmetrica), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C16281e c16281e2 = (C16281e) it2.next();
            if (str == null || str.equals(c16281e2.vip)) {
                C6003e c6003e = (C6003e) this.f28586e;
                C0823e c0823e = c16281e2.ad;
                if (c0823e.purchase == null || c0823e.billing == null) {
                    C3046e vip2 = ((C17960e) this.f28591e).vip(true);
                    C0823e c0823e2 = c16281e2.ad;
                    String str2 = vip2.ad;
                    C17366e ad = c0823e2.ad();
                    ad.appmetrica = str2;
                    C0823e ad2 = ad.ad();
                    String str3 = vip2.vip;
                    C17366e ad3 = ad2.ad();
                    ad3.purchase = str3;
                    c16281e = new C16281e(ad3.ad(), c16281e2.vip, c16281e2.metrica);
                } else {
                    c16281e = c16281e2;
                }
                boolean z = str != null;
                C17553e c17553e = c6003e.ad;
                synchronized (c17553e.purchase) {
                    try {
                        c8988e = new C8988e();
                        if (z) {
                            ((AtomicInteger) c17553e.startapp.f7271e).getAndIncrement();
                            if (c17553e.purchase.size() < c17553e.appmetrica) {
                                C5438e c5438e = C5438e.f11671e;
                                c5438e.subscription("Enqueueing report: " + c16281e.vip);
                                c5438e.subscription("Queue size: " + c17553e.purchase.size());
                                c17553e.billing.execute(new RunnableC11666e(c17553e, c16281e, c8988e, false, 3));
                                c5438e.subscription("Closing task for report: " + c16281e.vip);
                                c8988e.license(c16281e);
                            } else {
                                c17553e.ad();
                                String str4 = "Dropping report due to queue being full: " + c16281e.vip;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) c17553e.startapp.f7272e).getAndIncrement();
                                c8988e.license(c16281e);
                            }
                        } else {
                            c17553e.vip(c16281e, c8988e);
                        }
                    } finally {
                    }
                }
                arrayList2.add(c8988e.ad.billing(executor, new C11180e(7, this)));
            }
        }
        return AbstractC1749e.yandex(arrayList2);
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        return new C11980e((C2532e) this.f28589e, c0520e, this);
    }

    public File yandex(String str, String str2) {
        File file = new File((File) this.f28588e, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
