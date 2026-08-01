package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.hardware.camera2.CameraCaptureSession;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٝۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13391e implements InterfaceC10283e, InterfaceC4406e, InterfaceC16794e, InterfaceC2868e, InterfaceC10540e, InterfaceC17431e, InterfaceC17128e, InterfaceC16836e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2657e f26641e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C13391e f26642e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C4792e f26643e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f26644e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f26645e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26646e;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eؔ٘ۢ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eُؗ] */
    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        f26642e = new C13391e(new C15552e(valueOf2, valueOf2), new C15552e(valueOf, valueOf), 1);
        f26641e = new Object();
        f26643e = new Object();
    }

    public C13391e(int i) {
        this.f26646e = i;
        switch (i) {
            case 9:
                this.f26644e = C14111e.class.getDeclaredMethod("ad", LayoutInflater.class, ViewGroup.class, Boolean.TYPE);
                return;
            case 11:
                this.f26645e = new CameraCaptureSession();
                this.f26644e = AbstractC14430e.appmetrica(C13664e.f27089e);
                return;
            case 21:
                this.f26645e = new HashMap();
                this.f26644e = C18520e.vip;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f26645e = new C15460e();
                this.f26644e = new C4052e(2);
                return;
            default:
                this.f26645e = new AbstractC9790e();
                this.f26644e = new Object();
                signatures(f26643e);
                return;
        }
    }

    public /* synthetic */ C13391e(int i, boolean z) {
        this.f26646e = i;
    }

    public C13391e(Context context, int i) {
        this.f26646e = i;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f26645e = context;
                this.f26644e = null;
                return;
            default:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC9476e.loadAd(R.attr.materialCalendarStyle, context, C1421e.class.getCanonicalName()).data, AbstractC11408e.pro);
                C5170e.yandex(context, obtainStyledAttributes.getResourceId(4, 0));
                C5170e.yandex(context, obtainStyledAttributes.getResourceId(2, 0));
                C5170e.yandex(context, obtainStyledAttributes.getResourceId(3, 0));
                C5170e.yandex(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList license = AbstractC2774e.license(context, obtainStyledAttributes, 7);
                this.f26645e = C5170e.yandex(context, obtainStyledAttributes.getResourceId(9, 0));
                C5170e.yandex(context, obtainStyledAttributes.getResourceId(8, 0));
                this.f26644e = C5170e.yandex(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(license.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
        }
    }

    public C13391e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f26646e = 0;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i = AbstractC17033e.vip;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    AbstractC2803e.smaato("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                AbstractC2803e.advert("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f26645e = new C2584e(context, bundle, str);
        } else if (i2 >= 28) {
            this.f26645e = new C2584e(context, bundle, str);
        } else {
            this.f26645e = new C2584e(context, bundle, str);
        }
        Looper myLooper = Looper.myLooper();
        subscription(new AbstractC9882e(0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
        ((C2584e) this.f26645e).ad.setMediaButtonReceiver(pendingIntent);
        this.f26644e = new C5891e(context, ((C2584e) this.f26645e).metrica);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, eٖۦۥ] */
    public C13391e(EditText editText) {
        this.f26646e = 18;
        this.f26645e = editText;
        C1604e c1604e = new C1604e(editText);
        this.f26644e = c1604e;
        editText.addTextChangedListener(c1604e);
        if (C16654e.vip == null) {
            synchronized (C16654e.ad) {
                try {
                    if (C16654e.vip == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C16654e.metrica = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C16654e.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C16654e.vip = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C16654e.vip);
    }

    public C13391e(AbstractC0003e abstractC0003e) {
        this.f26646e = 20;
        this.f26645e = abstractC0003e;
        this.f26644e = new HashMap();
    }

    public C13391e(C0912e c0912e) {
        this.f26646e = 4;
        this.f26645e = c0912e;
    }

    public C13391e(C4594e c4594e, C0560e c0560e) {
        this.f26646e = 14;
        this.f26644e = c4594e;
        this.f26645e = c0560e;
    }

    public C13391e(C8633e c8633e) {
        C2433e c2433e;
        this.f26646e = 16;
        this.f26645e = (c8633e == null || (c2433e = (C2433e) c8633e.ad(C2433e.Companion.serializer())) == null) ? null : c2433e.ad;
        this.f26644e = new HashMap();
    }

    public C13391e(File file) {
        this.f26646e = 7;
        this.f26645e = file;
        this.f26644e = new File(file.getPath() + ".bak");
    }

    public /* synthetic */ C13391e(Object obj, Object obj2, int i) {
        this.f26646e = i;
        this.f26645e = obj;
        this.f26644e = obj2;
    }

    public C13391e(String str, C17150e c17150e, C17647e c17647e) {
        this.f26646e = 5;
        this.f26644e = str;
        this.f26645e = c17150e;
    }

    public C13391e(String str, String str2) {
        this.f26646e = 25;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f26645e = str;
        this.f26644e = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public C13391e(Function2 function2) {
        this.f26646e = 13;
        this.f26645e = function2;
        this.f26644e = new ConcurrentHashMap();
    }

    public static C18520e amazon(C18520e c18520e, List list) {
        c18520e.getClass();
        Map map = c18520e.ad;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new C18520e(hashMap);
    }

    public static void purchase(C13391e c13391e, C18520e c18520e) {
        c13391e.getClass();
        for (Map.Entry entry : new HashMap((HashMap) c13391e.f26645e).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!amazon(c18520e, list).equals(amazon((C18520e) c13391e.f26644e, list))) {
                throw null;
            }
        }
        c13391e.f26644e = c18520e;
    }

    public void Signature(String str, InterfaceC5372e interfaceC5372e, Function0 function0) {
        HashMap hashMap = (HashMap) this.f26644e;
        if (hashMap.containsKey(str)) {
            throw new IllegalStateException("Another supplier is already registered with the key: ".concat(str).toString());
        }
        hashMap.put(str, new C4856e(interfaceC5372e, function0));
    }

    @Override // defpackage.InterfaceC16836e
    public boolean ad(C18070e c18070e) {
        return true;
    }

    @Override // defpackage.InterfaceC16836e
    public boolean adcel() {
        return true;
    }

    public C8633e admob() {
        Map map = (Map) this.f26645e;
        HashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new HashMap();
        for (Map.Entry entry : ((HashMap) this.f26644e).entrySet()) {
            String str = (String) entry.getKey();
            C4856e c4856e = (C4856e) entry.getValue();
            Object invoke = c4856e.vip.invoke();
            C8633e appmetrica = invoke != null ? AbstractC6190e.appmetrica(c4856e.ad, invoke) : null;
            if (appmetrica != null) {
                linkedHashMap.put(str, appmetrica);
            }
        }
        return AbstractC6190e.appmetrica(C2433e.Companion.serializer(), new C2433e(linkedHashMap));
    }

    public void advert() {
        this.f26645e = null;
        this.f26644e = null;
    }

    @Override // defpackage.InterfaceC16836e
    public InterfaceC16638e apply() {
        return ((C10014e) this.f26645e).purchase(this.f26644e);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eَٞۢ, eؙٓۧ] */
    @Override // defpackage.InterfaceC2868e
    public InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        C0961e c0961e = (C0961e) this.f26645e;
        C10421e c10421e = interfaceC6396e instanceof C10421e ? (C10421e) interfaceC6396e : null;
        if (c10421e != null && c10421e.ad == c0961e && c10421e.vip != null) {
            return c10421e;
        }
        AbstractC9932e pro = ((AbstractC9932e) this.f26644e).pro((AbstractC7861e) c0961e.vip.f13613e);
        ?? obj = new Object();
        obj.ad = c0961e;
        obj.vip = pro;
        return obj;
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] billing(int i, byte[] bArr) {
        C4052e c4052e = (C4052e) this.f26644e;
        c4052e.getClass();
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        C15460e c15460e = (C15460e) this.f26645e;
        c15460e.tapsense(0, 0, bArr, bArr2);
        c15460e.tapsense(8, 8, bArr, bArr2);
        c15460e.tapsense(16, 16, bArr, bArr2);
        c15460e.tapsense(24, 24, bArr, bArr2);
        byte[] bArr3 = new byte[4];
        c4052e.update(bArr2, 0, i2);
        c4052e.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, i - 4, bArr4, 0, 4);
        if (AbstractC12442e.loadAd(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    @Override // defpackage.InterfaceC16836e
    public void cancel() {
    }

    @Override // defpackage.InterfaceC17128e
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (BalloonAnchorOverlayView) this.f26645e;
    }

    @Override // defpackage.InterfaceC10540e
    public EnumC10668e getState() {
        int ordinal = ((C4891e) ((AbstractC0003e) this.f26645e)).license.ordinal();
        if (ordinal == 0) {
            return EnumC10668e.f21012e;
        }
        if (ordinal == 1) {
            return EnumC10668e.f21010e;
        }
        if (ordinal == 2) {
            return EnumC10668e.f21009e;
        }
        if (ordinal == 3) {
            return EnumC10668e.f21011e;
        }
        if (ordinal == 4) {
            return EnumC10668e.f21008e;
        }
        throw new C14803e(10);
    }

    @Override // defpackage.InterfaceC17128e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (interfaceC3894e instanceof C12219e) {
            interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
        }
        C0610e c0610e = (C0610e) interfaceC3894e;
        ((C15460e) this.f26645e).init(z, c0610e.f2821e);
        C4052e c4052e = (C4052e) this.f26644e;
        InterfaceC3894e interfaceC3894e2 = c0610e.f2821e;
        byte[] bArr = c0610e.f2822e;
        c4052e.init(new C11494e(interfaceC3894e2, bArr, 0, bArr.length));
    }

    public String inmobi(String str) {
        String str2 = (String) this.f26644e;
        return str2 == null ? str : str2.concat(str);
    }

    @Override // defpackage.InterfaceC16794e
    public C0560e isVip(Object obj) {
        Boolean bool = (Boolean) obj;
        C4594e c4594e = (C4594e) this.f26644e;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue = bool.booleanValue();
            C8331e c8331e = c4594e.vip;
            if (booleanValue) {
                ((C8988e) c8331e.f17053e).license(null);
                return ((C0560e) this.f26645e).smaato((ExecutorC4614e) c4594e.appmetrica.f25751e, new C6325e(8, this));
            }
            c8331e.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        C14461e c14461e = c4594e.billing;
        Iterator it = C14461e.pro(((File) c14461e.f28586e).listFiles(C4594e.subscription)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C14461e c14461e2 = ((C14848e) c4594e.smaato.f28587e).vip;
        C14848e.ad(C14461e.pro(((File) c14461e2.f28585e).listFiles()));
        C14848e.ad(C14461e.pro(((File) c14461e2.f28591e).listFiles()));
        C14848e.ad(C14461e.pro(((File) c14461e2.f28590e).listFiles()));
        c4594e.admob.license(null);
        return AbstractC1749e.appmetrica(null);
    }

    @Override // defpackage.InterfaceC17128e
    public byte[] license(int i, byte[] bArr) {
        C4052e c4052e = (C4052e) this.f26644e;
        c4052e.update(bArr, 0, i);
        byte[] bArr2 = new byte[i + 4];
        C15460e c15460e = (C15460e) this.f26645e;
        c15460e.tapsense(0, 0, bArr, bArr2);
        c15460e.tapsense(8, 8, bArr, bArr2);
        c15460e.tapsense(16, 16, bArr, bArr2);
        c15460e.tapsense(24, 24, bArr, bArr2);
        c4052e.doFinal(bArr2, i);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadAd(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C13172e
            if (r0 == 0) goto L13
            r0 = r9
            eَؚْ r0 = (defpackage.C13172e) r0
            int r1 = r0.f26153e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26153e = r1
            goto L18
        L13:
            eَؚْ r0 = new eَؚْ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f26154e
            int r1 = r0.f26153e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            eؘٗٙ r0 = r0.f26157e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.util.concurrent.CancellationException -> L2f
            return r0
        L2f:
            r9 = move-exception
            goto La9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            int r1 = r0.f26152e
            int r3 = r0.f26155e
            eؗٝٝ r4 = r0.f26158e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.util.concurrent.CancellationException -> L2f
            goto L88
        L44:
            int r1 = r0.f26152e
            int r4 = r0.f26155e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.util.concurrent.CancellationException -> L2f
            goto L73
        L4c:
            defpackage.AbstractC2003e.purchase(r9)
            eَٔٔ r9 = new eَٔٔ     // Catch: java.util.concurrent.CancellationException -> L2f
            r9.<init>()     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r1 = r8.f26645e     // Catch: java.util.concurrent.CancellationException -> L2f
            eَٔٔ r1 = (defpackage.C10263e) r1     // Catch: java.util.concurrent.CancellationException -> L2f
            eُۥٔ r6 = r1.appmetrica     // Catch: java.util.concurrent.CancellationException -> L2f
            r9.appmetrica = r6     // Catch: java.util.concurrent.CancellationException -> L2f
            r9.metrica(r1)     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r1 = r8.f26644e     // Catch: java.util.concurrent.CancellationException -> L2f
            eٍُۘ r1 = (defpackage.C9398e) r1     // Catch: java.util.concurrent.CancellationException -> L2f
            r6 = 0
            r0.f26155e = r6     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26152e = r6     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26153e = r4     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r9 = r1.ad(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r9 != r5) goto L71
            goto La7
        L71:
            r1 = r6
            r4 = r1
        L73:
            eؗٝٝ r9 = (defpackage.C5042e) r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26158e = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26155e = r4     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26152e = r1     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26153e = r3     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r3 = defpackage.AbstractC12511e.billing(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r3 != r5) goto L84
            goto La7
        L84:
            r7 = r4
            r4 = r9
            r9 = r3
            r3 = r7
        L88:
            eؗٝٝ r9 = (defpackage.C5042e) r9     // Catch: java.util.concurrent.CancellationException -> L2f
            eؘٗٙ r9 = r9.f10750e     // Catch: java.util.concurrent.CancellationException -> L2f
            r6 = 0
            if (r9 == 0) goto L90
            goto L91
        L90:
            r9 = r6
        L91:
            eؘٗٙ r4 = r4.f10750e     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r4 == 0) goto L96
            goto L97
        L96:
            r4 = r6
        L97:
            r0.f26158e = r6     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26157e = r9     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26155e = r3     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26152e = r1     // Catch: java.util.concurrent.CancellationException -> L2f
            r0.f26153e = r2     // Catch: java.util.concurrent.CancellationException -> L2f
            java.lang.Object r0 = r8.mopub(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L2f
            if (r0 != r5) goto La8
        La7:
            return r5
        La8:
            return r9
        La9:
            java.lang.Throwable r9 = defpackage.AbstractC9262e.purchase(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13391e.loadAd(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC17431e
    public Object metrica(Uri uri, C0534e c0534e) {
        AbstractC15363e abstractC15363e = (AbstractC15363e) ((InterfaceC17431e) this.f26645e).metrica(uri, c0534e);
        List list = (List) this.f26644e;
        return (list == null || list.isEmpty()) ? abstractC15363e : (AbstractC15363e) abstractC15363e.ad(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mopub(defpackage.AbstractC16824e r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C6385e
            if (r0 == 0) goto L13
            r0 = r6
            eؙُٓ r0 = (defpackage.C6385e) r0
            int r1 = r0.f13239e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13239e = r1
            goto L18
        L13:
            eؙُٓ r0 = new eؙُٓ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13238e
            int r1 = r0.f13239e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L66
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eٌِٞ r6 = r5.advert()
            eَٟۙ r6 = defpackage.AbstractC6629e.startapp(r6)
            e٘ۚۤ r6 = (defpackage.InterfaceC18000e) r6
            r1 = r6
            eؙۧؐ r1 = (defpackage.C6799e) r1
            r1.m2245e()
            eًۛؗ r1 = defpackage.AbstractC8978e.ad
            eؗٝٝ r1 = r5.vip()
            eؘۙٗ r1 = r1.getAttributes()
            eًۛؗ r3 = defpackage.AbstractC8978e.vip
            boolean r1 = r1.vip(r3)
            if (r1 != 0) goto L59
            eْٕؕ r5 = r5.metrica()     // Catch: java.lang.Throwable -> L59
            defpackage.AbstractC2223e.ad(r5)     // Catch: java.lang.Throwable -> L59
        L59:
            r0.f13239e = r2
            eؙٙؓ r6 = (defpackage.C6467e) r6
            java.lang.Object r5 = r6.mo696protected(r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L66
            return r6
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13391e.mopub(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void pro(C4820e c4820e) {
        C2584e c2584e = (C2584e) this.f26645e;
        c2584e.billing = c4820e;
        synchronized (c2584e.license) {
            for (int beginBroadcast = c2584e.purchase.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((InterfaceC4687e) c2584e.purchase.getBroadcastItem(beginBroadcast)).mo1669extends(c4820e);
                } catch (RemoteException | SecurityException e) {
                    AbstractC2803e.billing("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            c2584e.purchase.finishBroadcast();
        }
        MediaSession mediaSession = c2584e.ad;
        if (c4820e.f10267e == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(c4820e.f10275e, c4820e.f10270e, c4820e.f10273e, c4820e.f10271e);
            builder.setBufferedPosition(c4820e.f10268e);
            builder.setActions(c4820e.f10266e);
            builder.setErrorMessage(c4820e.f10276e);
            for (C4206e c4206e : c4820e.f10274e) {
                PlaybackState.CustomAction customAction = c4206e.f9266e;
                if (customAction == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(c4206e.f9270e, c4206e.f9268e, c4206e.f9267e);
                    builder2.setExtras(c4206e.f9269e);
                    customAction = builder2.build();
                }
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(c4820e.f10269e);
            builder.setExtras(c4820e.f10272e);
            c4820e.f10267e = builder.build();
        }
        mediaSession.setPlaybackState(c4820e.f10267e);
    }

    public void remoteconfig(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f26645e = Integer.valueOf(i);
    }

    public void signatures(AbstractC16519e abstractC16519e) {
        C6566e c6566e = (C6566e) this.f26644e;
        ((C1326e) this.f26645e).adcel(abstractC16519e);
        if (abstractC16519e instanceof C2657e) {
            c6566e.startapp((C2657e) abstractC16519e);
        } else if (abstractC16519e instanceof C8037e) {
            c6566e.adcel(((C8037e) abstractC16519e).billing);
        }
    }

    @Override // defpackage.InterfaceC10540e
    public void smaato(InterfaceC0665e interfaceC0665e) {
        HashMap hashMap = (HashMap) this.f26644e;
        if (hashMap.containsKey(interfaceC0665e)) {
            throw new IllegalStateException("Already subscribed");
        }
        C18044e c18044e = new C18044e(interfaceC0665e, new C5625e(this, interfaceC0665e, 14), 0);
        hashMap.put(interfaceC0665e, c18044e);
        ((AbstractC0003e) this.f26645e).ad(c18044e);
    }

    @Override // defpackage.InterfaceC10540e
    public void startapp(InterfaceC0665e interfaceC0665e) {
        InterfaceC12066e interfaceC12066e = (InterfaceC12066e) ((HashMap) this.f26644e).remove(interfaceC0665e);
        if (interfaceC12066e != null) {
            ((AbstractC0003e) this.f26645e).vip(interfaceC12066e);
        }
    }

    public void subscription(AbstractC9882e abstractC9882e, Handler handler) {
        C2584e c2584e = (C2584e) this.f26645e;
        synchronized (c2584e.license) {
            c2584e.advert = abstractC9882e;
            c2584e.ad.setCallback((C18263e) abstractC9882e.appmetrica, handler);
            abstractC9882e.m2748default(c2584e, handler);
        }
    }

    public C16358e tapsense() {
        File file = (File) this.f26644e;
        File file2 = (File) this.f26645e;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                AbstractC2803e.smaato("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new C16358e(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new C16358e(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public String toString() {
        switch (this.f26646e) {
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "HttpStatement[" + ((C10263e) this.f26645e).ad + ']';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC4406e
    public Object vip(InterfaceC7227e interfaceC7227e, ArrayList arrayList) {
        Object c12763e;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f26644e;
        Class subs = ((InterfaceC18155e) interfaceC7227e).subs();
        Object obj = concurrentHashMap.get(subs);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(subs, (obj = new C3803e()))) != null) {
            obj = putIfAbsent;
        }
        C3803e c3803e = (C3803e) obj;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C6388e((InterfaceC13984e) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c3803e.ad;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                c12763e = (InterfaceC5372e) ((Function2) this.f26645e).invoke(interfaceC7227e, arrayList);
            } catch (Throwable th) {
                c12763e = new C12763e(th);
            }
            C13523e c13523e = new C13523e(c12763e);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, c13523e);
            obj2 = putIfAbsent2 == null ? c13523e : putIfAbsent2;
        }
        return ((C13523e) obj2).f26812e;
    }

    public C2428e yandex() {
        Integer num = (Integer) this.f26645e;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((C15780e) this.f26644e) != null) {
            return new C2428e(num.intValue(), (C15780e) this.f26644e);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
