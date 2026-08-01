package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16911e implements InterfaceC1363e, InterfaceC14343e, InterfaceC3582e, InterfaceC16256e, InterfaceC2295e, InterfaceC5368e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f33136e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f33137e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33138e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String[] f33135e = {"name", "length", "last_touch_timestamp"};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C10659e f33134e = new C10659e(4);

    public C16911e(int i) {
        this.f33138e = i;
        switch (i) {
            case 22:
                this.f33137e = new AtomicReference(C13747e.f27231e);
                this.f33136e = new C12894e(16, false);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f33137e = new HashMap();
                return;
            default:
                this.f33137e = ByteBuffer.allocateDirect(500);
                return;
        }
    }

    public /* synthetic */ C16911e(int i, Object obj) {
        this.f33138e = i;
        this.f33137e = obj;
    }

    public /* synthetic */ C16911e(int i, boolean z) {
        this.f33138e = i;
    }

    public C16911e(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.f33138e = 26;
        this.f33137e = componentName;
        this.f33136e = componentName2;
    }

    public C16911e(View view) {
        this.f33138e = 0;
        this.f33137e = view;
        this.f33136e = AbstractC18039e.appmetrica(3, new C12851e(6, this));
    }

    public C16911e(EditText editText) {
        this.f33138e = 6;
        this.f33137e = editText;
        this.f33136e = new C5389e(editText);
    }

    public C16911e(C0624e c0624e) {
        Object c13875e;
        this.f33138e = 4;
        this.f33137e = c0624e;
        int i = Build.VERSION.SDK_INT;
        int i2 = 2;
        if (i < 26) {
            boolean z = AbstractC12274e.ad;
        } else if (!AbstractC12274e.ad) {
            c13875e = (i == 26 || i == 27) ? new C11672e(3) : new C13875e(true, i2);
            this.f33136e = c13875e;
        }
        c13875e = new C13875e(false, i2);
        this.f33136e = c13875e;
    }

    public C16911e(C2532e c2532e, HashMap hashMap, HashMap hashMap2) {
        this.f33138e = 3;
        this.f33137e = c2532e;
        this.f33136e = hashMap;
    }

    public C16911e(C7815e c7815e) {
        this.f33138e = 16;
        this.f33137e = c7815e;
        this.f33136e = new AtomicBoolean(false);
    }

    public C16911e(C11068e c11068e, C7967e c7967e) {
        this.f33138e = 20;
        this.f33136e = c11068e;
        this.f33137e = c7967e;
    }

    public C16911e(C13391e c13391e) {
        this.f33138e = 17;
        Context context = (Context) c13391e.f26645e;
        int adcel = AbstractC6494e.adcel(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (adcel != 0) {
            this.f33137e = "Unity";
            String string = context.getResources().getString(adcel);
            this.f33136e = string;
            String Signature = AbstractC17861e.Signature("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", Signature, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f33137e = "Flutter";
                this.f33136e = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f33137e = null;
                this.f33136e = null;
            }
        }
        this.f33137e = null;
        this.f33136e = null;
    }

    public C16911e(C13915e c13915e, InterfaceC2747e interfaceC2747e) {
        this.f33138e = 28;
        this.f33137e = c13915e;
        this.f33136e = AbstractC14533e.startapp(interfaceC2747e);
    }

    public C16911e(C14461e c14461e) {
        this.f33138e = 2;
        this.f33137e = c14461e;
        this.f33136e = f33134e;
    }

    public C16911e(C16911e c16911e) {
        C12431e c12431e;
        this.f33138e = 12;
        this.f33137e = new C12431e(0, new C4085e[16]);
        this.f33136e = new C12431e(0, new C4085e[16]);
        if (c16911e == null || (c12431e = (C12431e) c16911e.f33137e) == null) {
            return;
        }
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C4085e c4085e = (C4085e) objArr[i2];
            ((C12431e) this.f33137e).license(new C4085e(c4085e.ad, c4085e.vip, c4085e.metrica, c4085e.license));
        }
    }

    public /* synthetic */ C16911e(Object obj, Object obj2, int i) {
        this.f33138e = i;
        this.f33137e = obj;
        this.f33136e = obj2;
    }

    public C16911e(Function1 function1) {
        this.f33138e = 13;
        this.f33137e = function1;
        this.f33136e = new ConcurrentHashMap();
    }

    public C16911e(float[] fArr) {
        this.f33138e = 10;
        this.f33137e = fArr;
        this.f33136e = new int[2];
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    public static C16911e firebase(String... strArr) {
        try {
            C0193e[] c0193eArr = new C0193e[strArr.length];
            ?? obj = new Object();
            for (int i = 0; i < strArr.length; i++) {
                C12867e.m3409extends(obj, strArr[i]);
                obj.readByte();
                c0193eArr[i] = obj.isPro(obj.f31731e);
            }
            return new C16911e((String[]) strArr.clone(), AbstractC14114e.billing(c0193eArr), 29);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static AbstractC0003e pro(C14542e c14542e) {
        InterfaceC1363e interfaceC1363e = c14542e.metrica;
        Object context = interfaceC1363e instanceof C17702e ? ((C17702e) interfaceC1363e).f34698e.getContext() : c14542e.ad;
        while (!(context instanceof InterfaceC16400e)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((InterfaceC16400e) context).vip();
    }

    public static boolean subs(C14542e c14542e, Bitmap.Config config) {
        if (!AbstractC11815e.firebase(config)) {
            return true;
        }
        if (!((Boolean) AbstractC8306e.metrica(c14542e, AbstractC15659e.purchase)).booleanValue()) {
            return false;
        }
        InterfaceC1363e interfaceC1363e = c14542e.metrica;
        if (!(interfaceC1363e instanceof C17702e)) {
            return true;
        }
        ImageView imageView = ((C17702e) interfaceC1363e).f34698e;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    public C0398e Signature(List list) {
        InterfaceC5366e interfaceC5366e;
        InterfaceC5366e interfaceC5366e2 = null;
        try {
            int size = list.size();
            int i = 0;
            InterfaceC5366e interfaceC5366e3 = null;
            while (i < size) {
                try {
                    interfaceC5366e = (InterfaceC5366e) list.get(i);
                } catch (Exception e) {
                    e = e;
                    interfaceC5366e2 = interfaceC5366e3;
                }
                try {
                    interfaceC5366e.ad((C11199e) this.f33136e);
                    i++;
                    interfaceC5366e3 = interfaceC5366e;
                } catch (Exception e2) {
                    e = e2;
                    interfaceC5366e2 = interfaceC5366e;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((C9831e) ((C11199e) this.f33136e).f22467e).m2700interface());
                    sb2.append(", composition=");
                    sb2.append(((C11199e) this.f33136e).appmetrica());
                    sb2.append(", selection=");
                    C11199e c11199e = (C11199e) this.f33136e;
                    sb2.append((Object) C12347e.adcel(AbstractC9262e.metrica(c11199e.f22464e, c11199e.f22463e)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC13480e.m3610while(list, sb, "\n", null, null, new C10739e(interfaceC5366e2, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            C11199e c11199e2 = (C11199e) this.f33136e;
            c11199e2.getClass();
            C10566e c10566e = new C10566e(((C9831e) c11199e2.f22467e).toString());
            C11199e c11199e3 = (C11199e) this.f33136e;
            long metrica = AbstractC9262e.metrica(c11199e3.f22464e, c11199e3.f22463e);
            C12347e c12347e = C12347e.yandex(((C0398e) this.f33137e).vip) ? null : new C12347e(metrica);
            C0398e c0398e = new C0398e(c10566e, c12347e != null ? c12347e.ad : AbstractC9262e.metrica(C12347e.purchase(metrica), C12347e.billing(metrica)), ((C11199e) this.f33136e).appmetrica());
            this.f33137e = c0398e;
            return c0398e;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // defpackage.InterfaceC1363e
    public void ad(InterfaceC4082e interfaceC4082e) {
    }

    @Override // defpackage.InterfaceC5368e
    public InterfaceC17431e adcel() {
        return new C13391e(((InterfaceC5368e) this.f33137e).adcel(), (List) this.f33136e, 22);
    }

    public void admob() {
        ((C12431e) this.f33137e).startapp();
    }

    public synchronized Map ads() {
        try {
            if (((Map) this.f33136e) == null) {
                this.f33136e = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f33137e));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f33136e;
    }

    public void advert(C4085e c4085e, int i, int i2, int i3) {
        int i4;
        C12431e c12431e = (C12431e) this.f33136e;
        int i5 = c12431e.f24868e;
        if (i5 == 0) {
            i4 = 0;
        } else {
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            C4085e c4085e2 = (C4085e) c12431e.f24870e[i5 - 1];
            i4 = c4085e2.vip - c4085e2.license;
        }
        if (c4085e == null) {
            int i6 = i - i4;
            c4085e = new C4085e(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (c4085e.ad > i) {
                c4085e.ad = i;
                c4085e.metrica = i;
            }
            int i7 = c4085e.vip;
            if (i2 > i7) {
                int i8 = i7 - c4085e.license;
                c4085e.vip = i2;
                c4085e.license = i2 - i8;
            }
            c4085e.vip += i3;
        }
        c12431e.license(c4085e);
    }

    @Override // defpackage.InterfaceC1363e
    public void amazon(InterfaceC4082e interfaceC4082e) {
        AbstractC10727e smaato;
        C14542e c14542e = (C14542e) this.f33137e;
        C13108e c13108e = (C13108e) this.f33136e;
        AbstractC10727e license = interfaceC4082e != null ? AbstractC14753e.license(interfaceC4082e, c14542e.ad, c13108e.f26060e) : null;
        if (license == null && ((Boolean) AbstractC8306e.metrica(c14542e, AbstractC4256e.ad)).booleanValue() && (smaato = c13108e.smaato()) != null) {
            license = smaato;
        }
        C13108e.advert(c13108e, new C15106e(license));
    }

    public InterfaceC2747e applovin() {
        return (InterfaceC2747e) ((C0576e) this.f33136e).getValue();
    }

    @Override // defpackage.InterfaceC5368e
    public InterfaceC17431e appmetrica(C5833e c5833e, C9144e c9144e) {
        return new C13391e(((InterfaceC5368e) this.f33137e).appmetrica(c5833e, c9144e), (List) this.f33136e, 22);
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture billing(C12053e c12053e) {
        Uri uri;
        byte[] bArr;
        C12894e c12894e = (C12894e) this.f33136e;
        if (c12894e != null && (((uri = (Uri) c12894e.f25750e) != null && uri.equals(c12053e.amazon)) || ((bArr = (byte[]) c12894e.f25751e) != null && Arrays.equals(bArr, c12053e.mopub)))) {
            ListenableFuture listenableFuture = (ListenableFuture) ((C12894e) this.f33136e).f25752e;
            listenableFuture.getClass();
            return listenableFuture;
        }
        ListenableFuture billing = ((InterfaceC14343e) this.f33137e).billing(c12053e);
        if (billing == null) {
            return null;
        }
        this.f33136e = new C12894e(c12053e, billing);
        return billing;
    }

    /* renamed from: break, reason: not valid java name */
    public void m4213break(ArrayList arrayList) {
        C17714e c17714e;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C17569e) arrayList.get(i)).ad == 1) {
                try {
                    c17714e = new C17714e((C17569e) arrayList.get(i));
                } catch (C8022e unused) {
                    c17714e = null;
                }
                this.f33136e = c17714e;
            }
        }
    }

    /* renamed from: class, reason: not valid java name */
    public C16738e m4214class(InputConnection inputConnection, EditorInfo editorInfo) {
        C5389e c5389e = (C5389e) this.f33136e;
        if (inputConnection == null) {
            c5389e.getClass();
            inputConnection = null;
        } else {
            C13391e c13391e = (C13391e) c5389e.f11540e;
            c13391e.getClass();
            if (!(inputConnection instanceof C16738e)) {
                inputConnection = new C16738e((EditText) c13391e.f26645e, inputConnection, editorInfo);
            }
        }
        return (C16738e) inputConnection;
    }

    public void crashlytics(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.f33137e).getContext().obtainStyledAttributes(attributeSet, AbstractC6062e.startapp, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m4221throw(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public void m4215extends(String str, long j, long j2) {
        ((String) this.f33136e).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C5455e) this.f33137e).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.f33136e, null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger getOrder() {
        return ((AbstractC3903e) this.f33137e).f8719e.f32974e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 e￘ﾙ￙ﾎ￘ﾗ, still in use, count: 3, list:
          (r1v0 e￘ﾙ￙ﾎ￘ﾗ) from 0x0086: MOVE (r18v0 e￘ﾙ￙ﾎ￘ﾗ) = (r1v0 e￘ﾙ￙ﾎ￘ﾗ)
          (r1v0 e￘ﾙ￙ﾎ￘ﾗ) from 0x007b: MOVE (r18v3 e￘ﾙ￙ﾎ￘ﾗ) = (r1v0 e￘ﾙ￙ﾎ￘ﾗ)
          (r1v0 e￘ﾙ￙ﾎ￘ﾗ) from 0x006c: MOVE (r18v5 e￘ﾙ￙ﾎ￘ﾗ) = (r1v0 e￘ﾙ￙ﾎ￘ﾗ)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* renamed from: goto, reason: not valid java name */
    public defpackage.C6302e m4216goto(defpackage.C14542e r20, defpackage.C16320e r21) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16911e.m4216goto(eؘٔؕ, eٖٚۢ):eَؙؗ");
    }

    @Override // defpackage.InterfaceC16256e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        SecureRandom secureRandom = null;
        if (z) {
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                secureRandom = c12219e.f24538e;
                interfaceC3894e = c12219e.f24537e;
            }
            this.f33137e = (C6988e) interfaceC3894e;
            if (secureRandom == null) {
                secureRandom = AbstractC9915e.vip();
            } else {
                ThreadLocal threadLocal = AbstractC9915e.ad;
            }
        } else {
            this.f33137e = (C2964e) interfaceC3894e;
        }
        this.f33136e = secureRandom;
        AbstractC7711e.vip("ECGOST3410", (AbstractC3903e) this.f33137e, z);
        AbstractC9915e.ad();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    public InputMethodManager inmobi() {
        return (InputMethodManager) this.f33136e.getValue();
    }

    /* renamed from: interface, reason: not valid java name */
    public void m4217interface(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC1620e interfaceC1620e = "clx".equals(bundle2.getString("_o")) ? (C0909e) this.f33137e : (C15816e) this.f33136e;
            if (interfaceC1620e == null) {
                return;
            }
            interfaceC1620e.remoteconfig(string, bundle2);
        }
    }

    public KeyListener isPro(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C13391e) ((C5389e) this.f33136e).f11540e).getClass();
        if (keyListener instanceof C3277e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C3277e(keyListener);
    }

    public InterfaceC1272e isVip(Object... objArr) {
        Constructor ad;
        synchronized (((AtomicBoolean) this.f33136e)) {
            if (!((AtomicBoolean) this.f33136e).get()) {
                try {
                    ad = ((C7815e) this.f33137e).ad();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f33136e).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            ad = null;
        }
        if (ad == null) {
            return null;
        }
        try {
            return (InterfaceC1272e) ad.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        ((C11068e) this.f33136e).advert.amazon.remove((C7967e) this.f33137e);
    }

    @Override // defpackage.InterfaceC1363e
    public void metrica(InterfaceC4082e interfaceC4082e) {
    }

    @Override // defpackage.InterfaceC16256e
    public boolean mopub(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        BigInteger bigInteger3 = new BigInteger(1, AbstractC12442e.subs(bArr));
        BigInteger bigInteger4 = ((AbstractC3903e) this.f33137e).f8719e.f32974e;
        BigInteger bigInteger5 = InterfaceC4563e.Signature;
        if (bigInteger.compareTo(bigInteger5) < 0 || bigInteger.compareTo(bigInteger4) >= 0 || bigInteger2.compareTo(bigInteger5) < 0 || bigInteger2.compareTo(bigInteger4) >= 0) {
            return false;
        }
        BigInteger adcel = AbstractC5907e.adcel(bigInteger4, bigInteger3);
        BigInteger mod = bigInteger2.multiply(adcel).mod(bigInteger4);
        BigInteger mod2 = bigInteger4.subtract(bigInteger).multiply(adcel).mod(bigInteger4);
        AbstractC3903e abstractC3903e = (AbstractC3903e) this.f33137e;
        AbstractC9932e Signature = AbstractC0853e.adcel(abstractC3903e.f8719e.f32972e, mod, ((C2964e) abstractC3903e).f7010e, mod2).Signature();
        if (Signature.advert()) {
            return false;
        }
        Signature.vip();
        return Signature.vip.firebase().mod(bigInteger4).equals(bigInteger);
    }

    /* renamed from: native, reason: not valid java name */
    public AbstractC13656e m4218native(AbstractC1186e abstractC1186e, C3545e c3545e, InterfaceC11824e interfaceC11824e) {
        boolean booleanValue = AbstractC1787e.f4831break.appmetrica(c3545e.f7988e).booleanValue();
        EnumC0791e enumC0791e = c3545e.f7990e;
        switch (enumC0791e == null ? -1 : AbstractC5499e.ad[enumC0791e.ordinal()]) {
            case 1:
                byte b = (byte) c3545e.f7997e;
                return booleanValue ? new C12207e(b) : new C10037e(b);
            case 2:
                return new AbstractC13656e(Character.valueOf((char) c3545e.f7997e));
            case 3:
                short s = (short) c3545e.f7997e;
                return booleanValue ? new C12207e(s) : new C12062e(s);
            case 4:
                int i = (int) c3545e.f7997e;
                return booleanValue ? new C12207e(i) : new C2144e(i);
            case 5:
                long j = c3545e.f7997e;
                return booleanValue ? new C12207e(j) : new C5065e(j);
            case 6:
                return new C2019e(c3545e.f7987e);
            case 7:
                return new C2019e(c3545e.f8001e);
            case 8:
                return new C2019e(Boolean.valueOf(c3545e.f7997e != 0));
            case 9:
                return new AbstractC13656e(interfaceC11824e.getString(c3545e.f8000e));
            case 10:
                return new C5644e(AbstractC17487e.vip(interfaceC11824e, c3545e.f7995e), c3545e.f7989e);
            case 11:
                return new C8259e(AbstractC17487e.vip(interfaceC11824e, c3545e.f7995e), AbstractC17487e.metrica(interfaceC11824e, c3545e.f7998e));
            case 12:
                return new AbstractC13656e(subscription(c3545e.f7991e, interfaceC11824e));
            case 13:
                List list = c3545e.f7996e;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m4218native(((InterfaceC5334e) this.f33137e).amazon().appmetrica(), (C3545e) it.next(), interfaceC11824e));
                }
                return new C7270e(arrayList, abstractC1186e);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c3545e.f7990e + " (expected " + abstractC1186e + ')').toString());
        }
    }

    public void premium(long j) {
        C5455e c5455e = (C5455e) this.f33137e;
        try {
            String hexString = Long.toHexString(j);
            this.f33136e = "ExoPlayerCacheFileMetadata" + hexString;
            if (AbstractC1283e.ad(c5455e.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c5455e.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC1283e.metrica(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f33136e));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f33136e) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public C6302e m4219protected(C6302e c6302e) {
        boolean z;
        C14193e c14193e = c6302e.adcel;
        C12916e c12916e = AbstractC15659e.vip;
        if (!AbstractC11815e.firebase((Bitmap.Config) AbstractC8306e.license(c6302e, c12916e)) || ((InterfaceC17956e) this.f33136e).appmetrica()) {
            z = false;
        } else {
            c14193e.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(c14193e.ad);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(c12916e, config);
            } else {
                linkedHashMap.remove(c12916e);
            }
            c14193e = new C14193e(AbstractC18467e.license(linkedHashMap));
            z = true;
        }
        return z ? new C6302e(c6302e.ad, c6302e.vip, c6302e.metrica, c6302e.license, c6302e.appmetrica, c6302e.purchase, c6302e.billing, c6302e.yandex, c6302e.startapp, c14193e) : c6302e;
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger[] purchase(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, AbstractC12442e.subs(bArr));
        AbstractC3903e abstractC3903e = (AbstractC3903e) this.f33137e;
        C16833e c16833e = abstractC3903e.f8719e;
        BigInteger bigInteger2 = c16833e.f32974e;
        BigInteger bigInteger3 = ((C6988e) abstractC3903e).f14315e;
        C4630e c4630e = new C4630e(0);
        while (true) {
            BigInteger metrica = AbstractC5907e.metrica(bigInteger2.bitLength(), (SecureRandom) this.f33136e);
            BigInteger bigInteger4 = InterfaceC4563e.loadAd;
            if (!metrica.equals(bigInteger4)) {
                AbstractC9932e Signature = c4630e.license(c16833e.f32972e, metrica).Signature();
                Signature.vip();
                BigInteger mod = Signature.vip.firebase().mod(bigInteger2);
                if (mod.equals(bigInteger4)) {
                    continue;
                } else {
                    BigInteger mod2 = metrica.multiply(bigInteger).add(bigInteger3.multiply(mod)).mod(bigInteger2);
                    if (!mod2.equals(bigInteger4)) {
                        return new BigInteger[]{mod, mod2};
                    }
                }
            }
        }
    }

    public boolean remoteconfig(AbstractC13656e abstractC13656e, AbstractC1186e abstractC1186e, C3545e c3545e) {
        int nextInt;
        InterfaceC5334e interfaceC5334e = (InterfaceC5334e) this.f33137e;
        EnumC0791e enumC0791e = c3545e.f7990e;
        int i = enumC0791e == null ? -1 : AbstractC5499e.ad[enumC0791e.ordinal()];
        if (i == 10) {
            InterfaceC4077e advert = abstractC1186e.loadAd().advert();
            InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
            if (interfaceC5052e == null) {
                return true;
            }
            C0520e c0520e = AbstractC13270e.appmetrica;
            return AbstractC13270e.vip(interfaceC5052e, AbstractC0206e.f1429abstract);
        }
        if (i != 13) {
            return AbstractC7890e.billing(abstractC13656e.ad(interfaceC5334e), abstractC1186e);
        }
        if (abstractC13656e instanceof C16938e) {
            Object obj = ((C16938e) abstractC13656e).ad;
            if (((List) obj).size() == c3545e.f7996e.size()) {
                AbstractC1186e billing = interfaceC5334e.amazon().billing(abstractC1186e);
                if (billing == null) {
                    return false;
                }
                Iterable purchase = AbstractC6874e.purchase((Collection) obj);
                if ((purchase instanceof Collection) && ((Collection) purchase).isEmpty()) {
                    return true;
                }
                Iterator it = purchase.iterator();
                do {
                    C3296e c3296e = (C3296e) it;
                    if (!c3296e.f7452e) {
                        return true;
                    }
                    nextInt = c3296e.nextInt();
                } while (remoteconfig((AbstractC13656e) ((List) obj).get(nextInt), billing, (C3545e) c3545e.f7996e.get(nextInt)));
                return false;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC13656e).toString());
    }

    public Object signatures(Class cls) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f33136e;
        V v = concurrentHashMap.get(cls);
        if (v != 0) {
            return v;
        }
        Object invoke = ((Function1) this.f33137e).invoke(cls);
        V putIfAbsent = concurrentHashMap.putIfAbsent(cls, invoke);
        return putIfAbsent == 0 ? invoke : putIfAbsent;
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture smaato(byte[] bArr) {
        byte[] bArr2;
        C12894e c12894e = (C12894e) this.f33136e;
        if (c12894e == null || (bArr2 = (byte[]) c12894e.f25751e) == null || !Arrays.equals(bArr2, bArr)) {
            ListenableFuture smaato = ((InterfaceC14343e) this.f33137e).smaato(bArr);
            this.f33136e = new C12894e(bArr, smaato);
            return smaato;
        }
        ListenableFuture listenableFuture = (ListenableFuture) ((C12894e) this.f33136e).f25752e;
        listenableFuture.getClass();
        return listenableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [eؙۖؕ] */
    public C4263e subscription(C4599e c4599e, InterfaceC11824e interfaceC11824e) {
        Map map;
        C7283e c7283e;
        InterfaceC5052e purchase = AbstractC1284e.purchase((InterfaceC5334e) this.f33137e, AbstractC17487e.vip(interfaceC11824e, c4599e.f9908e), (C11980e) this.f33136e);
        if (c4599e.f9910e.size() == 0 || C18139e.appmetrica(purchase) || !AbstractC14300e.advert(purchase, 5) || (c7283e = (C7283e) AbstractC13480e.m3599static(purchase.mo1732throw())) == null) {
            map = C9139e.f18290e;
        } else {
            List mo330e = c7283e.mo330e();
            int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(mo330e, 10));
            if (appmetrica < 16) {
                appmetrica = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
            for (Object obj : mo330e) {
                linkedHashMap.put(((C13043e) obj).getName(), obj);
            }
            List<C14481e> list = c4599e.f9910e;
            ArrayList arrayList = new ArrayList();
            for (C14481e c14481e : list) {
                C13043e c13043e = (C13043e) linkedHashMap.get(AbstractC17487e.metrica(interfaceC11824e, c14481e.f28624e));
                if (c13043e != null) {
                    C0520e metrica = AbstractC17487e.metrica(interfaceC11824e, c14481e.f28624e);
                    AbstractC1186e ad = c13043e.ad();
                    C3545e c3545e = c14481e.f28626e;
                    AbstractC13656e m4218native = m4218native(ad, c3545e, interfaceC11824e);
                    r5 = remoteconfig(m4218native, ad, c3545e) ? m4218native : null;
                    if (r5 == null) {
                        r5 = new C15873e("Unexpected argument value: actual type " + c3545e.f7990e + " != expected type " + ad);
                    }
                    r5 = new C6571e(metrica, r5);
                }
                if (r5 != null) {
                    arrayList.add(r5);
                }
            }
            map = AbstractC10064e.mopub(arrayList);
        }
        return new C4263e(purchase.mo1458e(), map, InterfaceC3054e.f7112e);
    }

    public HashMap tapsense() {
        try {
            ((String) this.f33136e).getClass();
            Cursor query = ((C5455e) this.f33137e).getReadableDatabase().query((String) this.f33136e, f33135e, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new C1544e(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public void m4220this(Set set) {
        ((String) this.f33136e).getClass();
        try {
            SQLiteDatabase writableDatabase = ((C5455e) this.f33137e).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f33136e, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m4221throw(boolean z) {
        C1604e c1604e = (C1604e) ((C13391e) ((C5389e) this.f33136e).f11540e).f26644e;
        if (c1604e.f4523e != z) {
            if (c1604e.f4524e != null) {
                C5188e ad = C5188e.ad();
                RunnableC5821e runnableC5821e = c1604e.f4524e;
                ad.getClass();
                AbstractC4265e.billing(runnableC5821e, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = ad.ad;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ad.vip.remove(runnableC5821e);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1604e.f4523e = z;
            if (z) {
                C1604e.ad(c1604e.f4525e, C5188e.ad().metrica());
            }
        }
    }

    public String toString() {
        switch (this.f33138e) {
            case 12:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                C12431e c12431e = (C12431e) this.f33137e;
                Object[] objArr = c12431e.f24870e;
                int i = c12431e.f24868e;
                for (int i2 = 0; i2 < i; i2++) {
                    C4085e c4085e = (C4085e) objArr[i2];
                    sb.append("(" + c4085e.metrica + ',' + c4085e.license + ")->(" + c4085e.ad + ',' + c4085e.vip + ')');
                    if (i2 < ((C12431e) this.f33137e).f24868e - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m4222try(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f33137e;
        Object parent = view.getParent();
        if (parent instanceof View) {
            m4222try((View) parent, fArr);
            C6739e.license(fArr2);
            C6739e.adcel(fArr2, -view.getScrollX(), -view.getScrollY());
            C7582e.Signature(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C6739e.license(fArr2);
            C6739e.adcel(fArr2, left, top);
            C7582e.Signature(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f33136e;
            view.getLocationInWindow(iArr);
            C6739e.license(fArr2);
            C6739e.adcel(fArr2, -view.getScrollX(), -view.getScrollY());
            C7582e.Signature(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            C6739e.license(fArr2);
            C6739e.adcel(fArr2, f, f2);
            C7582e.Signature(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        C14155e.license(matrix, fArr2);
        C7582e.Signature(fArr, fArr2);
    }

    @Override // defpackage.InterfaceC3582e
    public void vip(View view, float[] fArr) {
        C6739e.license(fArr);
        m4222try(view, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eؚؑ۟, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Executor, eؚۙؖ, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    /* renamed from: while, reason: not valid java name */
    public ListenableFuture m4223while(InterfaceC0987e interfaceC0987e, Executor executor) {
        executor.getClass();
        ?? atomicReference = new AtomicReference(EnumC10346e.f20422e);
        atomicReference.f15175e = executor;
        atomicReference.f15177e = this;
        C18540e c18540e = new C18540e((Object) atomicReference, interfaceC0987e, 19);
        Object obj = new Object();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f33137e).getAndSet(obj);
        ?? obj2 = new Object();
        obj2.f19447e = new C1066e((RunnableFutureC9859e) obj2, c18540e);
        listenableFuture.ad(obj2, atomicReference);
        ListenableFuture appmetrica = AbstractC2017e.appmetrica(obj2);
        RunnableC14110e runnableC14110e = new RunnableC14110e(obj2, obj, listenableFuture, appmetrica, atomicReference, 3);
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        appmetrica.ad(runnableC14110e, enumC3320e);
        obj2.ad(runnableC14110e, enumC3320e);
        return appmetrica;
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        C18405e c18405e = ((C11068e) this.f33136e).advert;
        c18405e.amazon.remove((C7967e) this.f33137e);
        if (!(th instanceof MediaCodec.CodecException)) {
            c18405e.ad(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            c18405e.ad(1, codecException.getMessage(), codecException);
        }
    }
}
