package defpackage;

import android.content.ContentProviderClient;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.adcel;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.Provider;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16089e implements InterfaceC2062e, InterfaceC14187e, InterfaceC0569e, InterfaceC17935e, InterfaceC12217e, InterfaceC2928e, InterfaceC8193e, InterfaceC15813e, InterfaceC14989e, InterfaceC18087e, InterfaceC13049e, InterfaceC13838e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C3180e f31679e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static volatile C16089e f31680e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f31681e;

    public C16089e(int i) {
        int i2 = 9;
        switch (i) {
            case 5:
                this.f31681e = new HashMap();
                return;
            case 7:
                this.f31681e = AbstractC9180e.metrica(C18307e.vip);
                return;
            case 13:
                this.f31681e = new C1292e(10);
                return;
            case 15:
                this.f31681e = AbstractC7763e.ad(new C3685e(i2));
                return;
            case 20:
                C12618e c12618e = AbstractC1710e.ad;
                this.f31681e = new C12618e();
                return;
            case 23:
                this.f31681e = new LinkedHashSet();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f31681e = new ArrayList(9);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4389e.purchase.getClass();
                C4389e c4389e = C4389e.yandex;
                this.f31681e = c4389e.license != 2 ? new C4389e(c4389e.ad, c4389e.vip, c4389e.metrica, 2) : c4389e;
                return;
            default:
                this.f31681e = r5;
                Charset[] charsetArr = {AbstractC4639e.vip, AbstractC4639e.purchase, AbstractC4639e.license, AbstractC4639e.metrica};
                return;
        }
    }

    public /* synthetic */ C16089e(Object obj) {
        this.f31681e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:14:0x0042->B:15:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16089e(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            eَؙۛ[][] r3 = new defpackage.C6309e[r1]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L73
            r8 = r23[r5]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L24
            if (r8 == r2) goto L2d
            if (r8 == r10) goto L2b
            if (r8 == r9) goto L26
            r9 = 4
            if (r8 == r9) goto L24
            r9 = 5
            if (r8 == r9) goto L24
            r12 = r7
            goto L2f
        L24:
            r12 = r9
            goto L2f
        L26:
            if (r6 != r2) goto L2d
            goto L2b
        L29:
            r12 = r6
            goto L2f
        L2b:
            r6 = r10
            goto L29
        L2d:
            r6 = r2
            goto L29
        L2f:
            r7 = r25[r5]
            int r8 = r5 + 1
            r9 = r25[r8]
            r13 = r0[r5]
            r14 = r0[r8]
            int r11 = r7.length
            int r11 = r11 / r10
            int r15 = r7.length
            int r15 = r15 % r10
            int r10 = r15 + r11
            eَؙۛ[] r11 = new defpackage.C6309e[r10]
            r15 = r4
        L42:
            if (r15 >= r10) goto L6c
            int r16 = r15 * 2
            r17 = r11
            eَؙۛ r11 = new eَؙۛ
            r18 = r15
            r15 = r7[r16]
            int r19 = r16 + 1
            r20 = r16
            r16 = r7[r19]
            r20 = r9[r20]
            r19 = r9[r19]
            r21 = r19
            r19 = r17
            r17 = r20
            r20 = r18
            r18 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r19[r20] = r11
            int r15 = r20 + 1
            r11 = r19
            goto L42
        L6c:
            r19 = r11
            r3[r5] = r19
            r5 = r8
            r7 = r12
            goto Le
        L73:
            r5 = r22
            r5.f31681e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16089e.<init>(int[], float[], float[][]):void");
    }

    /* renamed from: break, reason: not valid java name */
    public static String m4108break(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: default, reason: not valid java name */
    public static void m4109default(String str, C6713e c6713e) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(c6713e.vip))));
        sb.append(": logging error [");
        AbstractC3184e abstractC3184e = c6713e.license;
        if (abstractC3184e == null) {
            throw new IllegalStateException("cannot request log site information prior to postProcess()");
        }
        AbstractC15849e.purchase(1, abstractC3184e, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public static String license(AbstractC16049e abstractC16049e) {
        return abstractC16049e.remoteconfig() + '_' + abstractC16049e.Signature();
    }

    /* renamed from: native, reason: not valid java name */
    public static boolean m4110native(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static C16089e premium() {
        if (f31680e == null) {
            synchronized (C16089e.class) {
                try {
                    if (f31680e == null) {
                        f31680e = new C16089e(0);
                    }
                } finally {
                }
            }
        }
        return f31680e;
    }

    @Override // defpackage.InterfaceC8193e
    public void Signature() {
        C15960e c15960e = (C15960e) this.f31681e;
        if (c15960e.f31475e != null) {
            c15960e.m4081e(0, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0290 A[LOOP:2: B:156:0x01ea->B:171:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0497 A[PHI: r8
      0x0497: PHI (r8v30 eٟؔۙ) = (r8v29 eٟؔۙ), (r8v31 eٟؔۙ) binds: [B:85:0x03b2, B:29:0x0495] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0498 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r4v3, types: [eٍؚؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [byte[], java.lang.String] */
    /* renamed from: abstract, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m4111abstract(defpackage.C0029e r30, java.lang.String r31, defpackage.AbstractC10731e r32) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16089e.m4111abstract(eؑؒ, java.lang.String, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18087e
    public boolean ad(MenuC8939e menuC8939e, MenuItem menuItem) {
        ((Toolbar) this.f31681e).getClass();
        return false;
    }

    @Override // defpackage.InterfaceC2928e
    public Cursor adcel(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f31681e;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public Charset admob(int i) {
        if (mo269instanceof(i)) {
            return ((Charset[]) this.f31681e)[i];
        }
        throw new NoSuchElementException("id=" + Integer.toString(i));
    }

    @Override // defpackage.InterfaceC14989e
    public int ads(View view) {
        return adcel.isPro(view) + ((ViewGroup.MarginLayoutParams) ((C8274e) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.InterfaceC18087e
    public void advert(MenuC8939e menuC8939e) {
        Toolbar toolbar = (Toolbar) this.f31681e;
        C13631e c13631e = toolbar.f265e.f161e;
        if (c13631e == null || !c13631e.adcel()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f238e.f3322e).iterator();
            while (it.hasNext()) {
                ((C17982e) it.next()).ad.pro();
            }
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
    }

    @Override // defpackage.InterfaceC14989e
    public View applovin(int i) {
        return ((adcel) this.f31681e).signatures(i);
    }

    @Override // defpackage.InterfaceC8193e
    public void appmetrica() {
        C15960e c15960e = (C15960e) this.f31681e;
        Surface surface = c15960e.f31475e;
        if (surface != null) {
            C10312e c10312e = c15960e.f31474e;
            Handler handler = (Handler) c10312e.f20361e;
            if (handler != null) {
                handler.post(new RunnableC5316e(2, SystemClock.elapsedRealtime(), c10312e, surface));
            }
            c15960e.f31463e = true;
        }
    }

    public synchronized void billing(C2257e c2257e) {
        ((LinkedHashSet) this.f31681e).remove(c2257e);
    }

    /* renamed from: class, reason: not valid java name */
    public JSONArray m4112class(String str) {
        String m4116this = m4116this(str);
        if (TextUtils.isEmpty(m4116this)) {
            return null;
        }
        try {
            return new JSONArray(m4116this);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m4108break(str) + ": " + m4116this + ", falling back to default");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2928e, defpackage.InterfaceC8668e
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f31681e;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                AbstractC6418e.smaato((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        C2893e c2893e = c12948e.ad;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f31681e;
        if (!Objects.equals(coordinatorLayout.f374e, c12948e)) {
            coordinatorLayout.f374e = c12948e;
            boolean z = c12948e.license() > 0;
            coordinatorLayout.f378e = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c2893e.remoteconfig()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC2016e.ad;
                    if (childAt.getFitsSystemWindows() && ((C3307e) childAt.getLayoutParams()).ad != null && c2893e.remoteconfig()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c12948e;
    }

    @Override // defpackage.InterfaceC13838e
    public int firebase() {
        return 32;
    }

    @Override // defpackage.InterfaceC13049e
    public InterfaceC3454e get(int i) {
        return (C6392e) this.f31681e;
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        return !mo269instanceof(i) ? BuildConfig.FLAVOR : ((Charset[]) this.f31681e)[i].name();
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        return null;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m4113implements(int i, Object obj, InterfaceC16984e interfaceC16984e) {
        AbstractC13874e abstractC13874e = (AbstractC13874e) this.f31681e;
        AbstractC17836e abstractC17836e = (AbstractC17836e) obj;
        abstractC13874e.pro(i, 2);
        abstractC13874e.mo1198goto(abstractC17836e.metrica(interfaceC16984e));
        interfaceC16984e.yandex(abstractC17836e, this);
    }

    @Override // defpackage.InterfaceC13838e
    public void init(InterfaceC3894e interfaceC3894e) {
        this.f31681e = (C0445e) interfaceC3894e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
        ((C13578e) this.f31681e).billing(new C12763e(iOException));
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 3;
    }

    /* renamed from: interface, reason: not valid java name */
    public String m4114interface(Resources resources, String str, String str2) {
        String[] strArr;
        String m4116this = m4116this(str2);
        if (!TextUtils.isEmpty(m4116this)) {
            return m4116this;
        }
        String m4116this2 = m4116this(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(m4116this2)) {
            return null;
        }
        int identifier = resources.getIdentifier(m4116this2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m4108break(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray m4112class = m4112class(str2.concat("_loc_args"));
        if (m4112class == null) {
            strArr = null;
        } else {
            int length = m4112class.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = m4112class.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m4108break(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC12217e
    public Object isPro(String str) {
        InterfaceC8292e interfaceC8292e = (InterfaceC8292e) this.f31681e;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return interfaceC8292e.appmetrica(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return interfaceC8292e.appmetrica(str, null);
    }

    @Override // defpackage.InterfaceC13838e
    public void isVip(InterfaceC3894e interfaceC3894e, byte[] bArr, int i) {
        C0445e c0445e = (C0445e) this.f31681e;
        c0445e.getClass();
        byte[] bArr2 = new byte[32];
        System.arraycopy(((C11963e) interfaceC3894e).f23938e, 0, bArr2, 0, 32);
        byte[] bArr3 = c0445e.f2492e;
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 * 4;
            iArr[i2] = ((bArr3[i3 + 2] & 255) << 16) | (bArr3[i3] & 255) | ((bArr3[i3 + 1] & 255) << 8) | (bArr3[i3 + 3] << 24);
        }
        iArr[0] = iArr[0] & (-8);
        int i4 = iArr[7] & Alert.DURATION_SHOW_INDEFINITELY;
        iArr[7] = i4;
        iArr[7] = i4 | 1073741824;
        int[] iArr2 = new int[10];
        AbstractC13482e.Signature(0, 0, bArr2, iArr2);
        AbstractC13482e.Signature(16, 5, bArr2, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr3 = new int[10];
        AbstractC13482e.amazon(0, 0, iArr2, iArr3);
        int[] iArr4 = new int[10];
        iArr4[0] = 1;
        int[] iArr5 = new int[10];
        iArr5[0] = 1;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int i5 = 254;
        int i6 = 1;
        while (true) {
            AbstractC13482e.startapp(iArr5, iArr6, iArr7, iArr5);
            AbstractC13482e.startapp(iArr3, iArr4, iArr6, iArr3);
            AbstractC13482e.isPro(iArr7, iArr3, iArr7);
            AbstractC13482e.isPro(iArr5, iArr6, iArr5);
            AbstractC13482e.m3611class(iArr6, iArr6);
            AbstractC13482e.m3611class(iArr3, iArr3);
            AbstractC13482e.m3612interface(iArr6, iArr3, iArr8);
            AbstractC13482e.inmobi(iArr8, iArr4);
            AbstractC13482e.yandex(iArr4, iArr3, iArr4);
            AbstractC13482e.isPro(iArr4, iArr8, iArr4);
            AbstractC13482e.isPro(iArr3, iArr6, iArr3);
            AbstractC13482e.startapp(iArr7, iArr5, iArr5, iArr6);
            AbstractC13482e.m3611class(iArr5, iArr5);
            AbstractC13482e.m3611class(iArr6, iArr6);
            AbstractC13482e.isPro(iArr6, iArr2, iArr6);
            int i7 = i5 - 1;
            int i8 = (iArr[i7 >>> 5] >>> (i7 & 31)) & 1;
            int i9 = i6 ^ i8;
            AbstractC13482e.loadAd(i9, iArr3, iArr5);
            AbstractC13482e.loadAd(i9, iArr4, iArr6);
            if (i7 < 3) {
                break;
            }
            i6 = i8;
            i5 = i7;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr9 = new int[10];
            int[] iArr10 = new int[10];
            AbstractC13482e.startapp(iArr3, iArr4, iArr9, iArr10);
            AbstractC13482e.m3611class(iArr9, iArr9);
            AbstractC13482e.m3611class(iArr10, iArr10);
            AbstractC13482e.isPro(iArr9, iArr10, iArr3);
            AbstractC13482e.m3612interface(iArr9, iArr10, iArr9);
            AbstractC13482e.inmobi(iArr9, iArr4);
            AbstractC13482e.yandex(iArr4, iArr10, iArr4);
            AbstractC13482e.isPro(iArr4, iArr9, iArr4);
        }
        AbstractC13482e.tapsense(iArr4, iArr4);
        AbstractC13482e.isPro(iArr3, iArr4, iArr3);
        AbstractC13482e.ads(iArr3);
        AbstractC13482e.remoteconfig(0, i, bArr, iArr3);
        AbstractC13482e.remoteconfig(5, i + 16, bArr, iArr3);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            i11 |= bArr[i + i12];
        }
        if (i11 == 0) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }

    public boolean loadAd(String str) {
        String m4116this = m4116this(str);
        return "1".equals(m4116this) || Boolean.parseBoolean(m4116this);
    }

    @Override // defpackage.InterfaceC17935e
    public void lock() {
        ((ReentrantLock) this.f31681e).lock();
    }

    public void metrica(Object obj) {
        ArrayList arrayList = (ArrayList) this.f31681e;
        if (obj == null) {
            throw new NullPointerException("Set contributions cannot be null");
        }
        arrayList.add(obj);
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
    }

    @Override // defpackage.InterfaceC8193e
    public void pro() {
        C14805e c14805e = ((C15960e) this.f31681e).f35009e;
        if (c14805e != null) {
            c14805e.ad();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6.ad > ((defpackage.C10950e) r2).ad) goto L22;
     */
    /* renamed from: protected, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC10595e m4115protected(defpackage.AbstractC10595e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f31681e
            eؓؗ r0 = (defpackage.C1615e) r0
        L4:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            eَۡۚ r2 = (defpackage.AbstractC10595e) r2
            boolean r3 = r2 instanceof defpackage.C0701e
            if (r3 != 0) goto L3f
            eۗؐ r3 = defpackage.C18307e.vip
            boolean r3 = defpackage.AbstractC7890e.billing(r2, r3)
            if (r3 == 0) goto L18
            goto L3f
        L18:
            boolean r3 = r2 instanceof defpackage.C10950e
            if (r3 == 0) goto L26
            int r3 = r6.ad
            r4 = r2
            eُِۙ r4 = (defpackage.C10950e) r4
            int r4 = r4.ad
            if (r3 <= r4) goto L40
            goto L3f
        L26:
            boolean r3 = r2 instanceof defpackage.C15551e
            if (r3 == 0) goto L2b
            goto L40
        L2b:
            boolean r6 = r2 instanceof defpackage.C3400e
            if (r6 == 0) goto L37
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r6.<init>(r0)
            throw r6
        L37:
            eٔٚؖ r6 = new eٔٚؖ
            r0 = 10
            r6.<init>(r0)
            throw r6
        L3f:
            r2 = r6
        L40:
            boolean r1 = r0.mopub(r1, r2)
            if (r1 == 0) goto L4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16089e.m4115protected(eَۡۚ):eَۡۚ");
    }

    @Override // defpackage.InterfaceC14989e
    public int purchase(View view) {
        return adcel.firebase(view) - ((ViewGroup.MarginLayoutParams) ((C8274e) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
    }

    public AbstractC10595e signatures() {
        return (AbstractC10595e) ((C1615e) this.f31681e).getValue();
    }

    @Override // defpackage.InterfaceC14989e
    public int smaato() {
        adcel adcelVar = (adcel) this.f31681e;
        return adcelVar.loadAd - adcelVar.m162interface();
    }

    @Override // defpackage.InterfaceC14989e
    public int startapp() {
        return ((adcel) this.f31681e).m163native();
    }

    public Integer subs(String str) {
        String m4116this = m4116this(str);
        if (TextUtils.isEmpty(m4116this)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m4116this));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m4108break(str) + "(" + m4116this + ") into an int");
            return null;
        }
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        ((C13578e) this.f31681e).smaato(c11058e, C15042e.f29805e);
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        if ("b".equals(c0520e.vip())) {
            return new C16134e(this, 2);
        }
        return null;
    }

    /* renamed from: this, reason: not valid java name */
    public String m4116this(String str) {
        Bundle bundle = (Bundle) this.f31681e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: throw, reason: not valid java name */
    public Bundle m4117throw() {
        Bundle bundle = (Bundle) this.f31681e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: try, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m4118try(defpackage.AbstractC16049e r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C11332e
            if (r0 == 0) goto L13
            r0 = r6
            eُۡٞ r0 = (defpackage.C11332e) r0
            int r1 = r0.f22781e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22781e = r1
            goto L18
        L13:
            eُۡٞ r0 = new eُۡٞ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f22779e
            int r1 = r0.f22781e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؙٖۛ r5 = r0.f22780e
            defpackage.AbstractC2003e.purchase(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eًۚ r6 = defpackage.C18353e.ad
            r0.f22780e = r5
            r0.f22781e = r2
            eۣۡ r6 = defpackage.C18353e.vip
            java.lang.Object r6 = r6.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L43
            return r0
        L43:
            eّؖٚ r6 = (defpackage.C4199e) r6
            java.lang.String r5 = license(r5)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r5
            java.lang.Class<bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics> r5 = bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics.class
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r5 = r1.vip(r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r1 = "id == $0"
            eٓٛۘ r5 = r6.m1506e(r5, r1, r0)
            eَۚٗ r5 = defpackage.AbstractC18366e.metrica(r5)
            bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics r5 = (bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics) r5
            if (r5 == 0) goto L8c
            java.lang.String r5 = r5.ad()
            if (r5 == 0) goto L8c
            java.lang.Object r6 = r4.f31681e     // Catch: defpackage.C15929e -> L88
            eِٙٙ r6 = (defpackage.C11817e) r6     // Catch: defpackage.C15929e -> L88
            r6.getClass()     // Catch: defpackage.C15929e -> L88
            eؔۜ۠ r0 = defpackage.InterfaceC2558e.Companion     // Catch: defpackage.C15929e -> L88
            eؘؒٙ r0 = r0.serializer()     // Catch: defpackage.C15929e -> L88
            eؘؒٙ r0 = defpackage.AbstractC6069e.purchase(r0)     // Catch: defpackage.C15929e -> L88
            eؘؒٙ r0 = (defpackage.InterfaceC5372e) r0     // Catch: defpackage.C15929e -> L88
            java.lang.Object r5 = r6.appmetrica(r0, r5)     // Catch: defpackage.C15929e -> L88
            eْۣؔ r5 = (defpackage.InterfaceC2558e) r5     // Catch: defpackage.C15929e -> L88
            goto L8a
        L88:
            eٍؔٗ r5 = defpackage.C2471e.INSTANCE
        L8a:
            if (r5 != 0) goto L8e
        L8c:
            eٍؔٗ r5 = defpackage.C2471e.INSTANCE
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16089e.m4118try(eؙٖۛ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC17935e
    public void unlock() {
        ((ReentrantLock) this.f31681e).unlock();
    }

    @Override // defpackage.InterfaceC8193e
    public void vip(C2351e c2351e) {
    }

    /* renamed from: while, reason: not valid java name */
    public C17750e m4119while(InterfaceC2283e interfaceC2283e, InterfaceC6044e interfaceC6044e, int i) {
        C1292e c1292e = (C1292e) this.f31681e;
        C17750e c17750e = null;
        int i2 = 0;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = c1292e.ad;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    interfaceC2283e.ad(i5 - i6, i6, c1292e.ad);
                    c1292e.m571try(i4);
                    c1292e.m572while(i5);
                    if (c1292e.ad() < 3) {
                        throw new IndexOutOfBoundsException("position=" + c1292e.vip + ", limit=" + c1292e.metrica);
                    }
                    int crashlytics = c1292e.crashlytics();
                    int i7 = c1292e.vip - 3;
                    c1292e.vip = i7;
                    if (crashlytics != 4801587) {
                        if (AbstractC16704e.metrica(c1292e.startapp()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            c1292e.metrica(20);
                        }
                        i3++;
                    } else {
                        c1292e.m568protected(6);
                        int applovin = c1292e.applovin();
                        int i8 = applovin + 10;
                        if (c17750e == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(c1292e.ad, i7, bArr2, 0, 10);
                            interfaceC2283e.ad(10, applovin, bArr2);
                            c17750e = new C7931e(interfaceC6044e).amazon(i8, bArr2);
                        } else {
                            interfaceC2283e.startapp(applovin);
                        }
                        i2 += i8;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        interfaceC2283e.smaato();
        interfaceC2283e.startapp(i2);
        return c17750e;
    }

    public String yandex(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C10610e c10610e = (C10610e) this.f31681e;
            C6722e c6722e = new C6722e(stringWriter, c10610e.f20919e, c10610e.f20917e, c10610e.f20916e, c10610e.f20918e);
            c6722e.yandex(obj);
            c6722e.adcel();
            c6722e.vip.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
