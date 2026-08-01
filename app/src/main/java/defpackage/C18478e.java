package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.OverwritingInputMerger;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۤۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18478e implements InterfaceC9617e, InterfaceC2786e, InterfaceC4563e, InterfaceC16256e, InterfaceC13363e, InterfaceC15269e, InterfaceC12523e, InterfaceC11659e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static C18478e f36221e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static volatile C18478e f36226e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f36227e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f36228e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f36229e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36230e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Object f36225e = new Object();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C9436e f36223e = new C9436e(0, -9223372036854775807L, false);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C9436e f36224e = new C9436e(2, -9223372036854775807L, false);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C9436e f36222e = new C9436e(3, -9223372036854775807L, false);

    /* JADX WARN: Type inference failed for: r1v11, types: [eؚؖؕ, java.lang.Object] */
    public C18478e(int i) {
        this.f36230e = i;
        switch (i) {
            case 13:
                this.f36228e = new Object();
                return;
            case 14:
                this.f36228e = new C6325e((byte) 0, 10);
                this.f36227e = new C6325e((byte) 0, 10);
                this.f36229e = new C6325e((byte) 0, 10);
                return;
            case 15:
                this.f36228e = new Object();
                return;
            case 22:
                this.f36228e = new AbstractC9790e();
                this.f36227e = new HashMap();
                return;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f36228e = AbstractC12751e.ad();
                this.f36229e = AbstractC9180e.metrica(Boolean.FALSE);
                return;
            default:
                ?? obj = new Object();
                obj.ad = new Vector();
                this.f36228e = obj;
                C8961e c8961e = new C8961e(0);
                C8961e c8961e2 = new C8961e(1);
                Object obj2 = new Object();
                Csuper ad = AbstractC8507e.ad();
                C3647e c3647e = EnumC2948e.OGG;
                ad.mo3904implements(c3647e.f6958e, new C8961e(7));
                C3941e c3941e = EnumC2948e.FLAC;
                ad.mo3904implements(c3941e.f6958e, new C8961e(6));
                C2788e c2788e = EnumC2948e.MP3;
                ad.mo3904implements(c2788e.f6958e, new C8961e(5));
                C5118e c5118e = EnumC2948e.MP4;
                ad.mo3904implements(c5118e.f6958e, c8961e);
                C9844e c9844e = EnumC2948e.M4A;
                ad.mo3904implements(c9844e.f6958e, c8961e);
                C11219e c11219e = EnumC2948e.M4P;
                ad.mo3904implements(c11219e.f6958e, c8961e);
                C15858e c15858e = EnumC2948e.M4B;
                ad.mo3904implements(c15858e.f6958e, c8961e);
                C14896e c14896e = EnumC2948e.WAV;
                ad.mo3904implements(c14896e.f6958e, new C8961e(4));
                C6326e c6326e = EnumC2948e.WMA;
                ad.mo3904implements(c6326e.f6958e, new C8961e(3));
                C8924e c8924e = EnumC2948e.AIF;
                ad.mo3904implements(c8924e.f6958e, c8961e2);
                C12960e c12960e = EnumC2948e.AIFC;
                ad.mo3904implements(c12960e.f6958e, c8961e2);
                C8114e c8114e = EnumC2948e.AIFF;
                ad.mo3904implements(c8114e.f6958e, c8961e2);
                C7175e c7175e = EnumC2948e.DSF;
                ad.mo3904implements(c7175e.f6958e, new C8961e(2));
                ad.mo3904implements(EnumC2948e.RA.f6958e, obj2);
                ad.mo3904implements(EnumC2948e.RM.f6958e, obj2);
                this.f36227e = ad.smaato();
                C7540e c7540e = new C7540e(0);
                C7540e c7540e2 = new C7540e(1);
                Csuper ad2 = AbstractC8507e.ad();
                ad2.mo3904implements(c3647e.f6958e, new C7540e(7));
                ad2.mo3904implements(c3941e.f6958e, new C7540e(6));
                ad2.mo3904implements(c2788e.f6958e, new C7540e(5));
                ad2.mo3904implements(c5118e.f6958e, c7540e);
                ad2.mo3904implements(c9844e.f6958e, c7540e);
                ad2.mo3904implements(c11219e.f6958e, c7540e);
                ad2.mo3904implements(c15858e.f6958e, c7540e);
                ad2.mo3904implements(c14896e.f6958e, new C7540e(4));
                ad2.mo3904implements(c6326e.f6958e, new C7540e(3));
                ad2.mo3904implements(c8924e.f6958e, c7540e2);
                ad2.mo3904implements(c12960e.f6958e, c7540e2);
                ad2.mo3904implements(c8114e.f6958e, c7540e2);
                ad2.mo3904implements(c7175e.f6958e, new C7540e(2));
                this.f36229e = ad2.smaato();
                return;
        }
    }

    public /* synthetic */ C18478e(int i, Object obj) {
        this.f36230e = i;
        this.f36228e = obj;
    }

    public /* synthetic */ C18478e(int i, Object obj, Object obj2, Object obj3) {
        this.f36230e = i;
        this.f36228e = obj;
        this.f36227e = obj2;
        this.f36229e = obj3;
    }

    public /* synthetic */ C18478e(int i, boolean z) {
        this.f36230e = i;
    }

    public C18478e(Context context) {
        this.f36230e = 1;
        this.f36229e = context.getApplicationContext();
        this.f36227e = new HashSet();
        this.f36228e = new HashMap();
    }

    public C18478e(C6325e c6325e) {
        this.f36230e = 6;
        this.f36230e = 6;
        this.f36228e = c6325e;
        this.f36227e = Choreographer.getInstance();
        this.f36229e = new ChoreographerFrameCallbackC6485e(1, this);
    }

    public C18478e(C6831e c6831e) {
        this.f36230e = 28;
        this.f36228e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f36227e = c6831e;
        C11883e c11883e = c6831e.subscription;
        this.f36229e = c11883e;
        c11883e.getClass();
    }

    public C18478e(C11980e c11980e, C5438e c5438e, C13090e c13090e, Set set) {
        this.f36230e = 16;
        this.f36228e = c5438e;
        this.f36227e = c11980e;
        this.f36229e = c13090e;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m4545instanceof(str, 0, str.length(), 1, true, new C15780e(str, 1));
        }
    }

    public C18478e(C11980e c11980e, InterfaceC10383e interfaceC10383e) {
        this.f36230e = 21;
        this.f36228e = c11980e;
        this.f36227e = interfaceC10383e;
        this.f36229e = new C3168e(new C16728e(7));
    }

    public C18478e(C13825e c13825e) {
        this.f36230e = 12;
        this.f36228e = c13825e;
        this.f36229e = (Rect) ((C9000e) c13825e.vip).metrica(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public C18478e(C14434e c14434e) {
        this.f36230e = 9;
        this.f36229e = c14434e;
        this.f36228e = new C5389e(6, this);
    }

    public C18478e(C17688e c17688e) {
        this.f36230e = 7;
        this.f36228e = new ArrayList();
        this.f36227e = new Object();
        this.f36229e = c17688e;
    }

    public C18478e(Class cls) {
        this.f36230e = 26;
        HashSet hashSet = new HashSet();
        this.f36229e = hashSet;
        this.f36228e = UUID.randomUUID();
        this.f36227e = new C13394e(((UUID) this.f36228e).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((C13394e) this.f36227e).license = OverwritingInputMerger.class.getName();
    }

    public /* synthetic */ C18478e(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f36230e = i;
        this.f36229e = obj;
        this.f36228e = obj2;
        this.f36227e = obj3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18478e(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            r4.f36230e = r0
            java.lang.String r1 = "ExoPlayer:Loader:"
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = defpackage.AbstractC9413e.ad
            eٍۜؗ r1 = new eٍۜؗ
            r1.<init>(r5, r0)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            eًٜؑ r1 = new eًٜؑ
            r2 = 28
            r1.<init>(r2)
            eْۣ٘ r2 = new eْۣ٘
            r3 = 1
            r2.<init>(r5, r1, r3)
            r4.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.<init>(java.lang.String):void");
    }

    public C18478e(String str, HashMap hashMap) {
        this.f36230e = 20;
        this.f36228e = str;
        this.f36227e = hashMap;
        this.f36229e = new HashMap();
    }

    public C18478e(AppActivity appActivity, C3274e c3274e) {
        this.f36230e = 11;
        this.f36228e = appActivity;
        this.f36227e = c3274e;
    }

    public static C16558e ads(C8369e c8369e) {
        C10629e c10629e = new C10629e(4);
        Uri uri = c8369e.vip;
        C5609e c5609e = new C5609e(uri == null ? null : uri.toString(), c8369e.purchase, c10629e);
        AbstractC8507e abstractC8507e = c8369e.metrica;
        AbstractC12614e abstractC12614e = abstractC8507e.f17300e;
        if (abstractC12614e == null) {
            abstractC12614e = abstractC8507e.metrica();
            abstractC8507e.f17300e = abstractC12614e;
        }
        AbstractC7014e it = abstractC12614e.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) c5609e.f11961e)) {
                ((HashMap) c5609e.f11961e).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i = AbstractC18394e.ad;
        C5401e c5401e = new C5401e(-1, 6, (byte) 0);
        UUID uuid = c8369e.ad;
        uuid.getClass();
        boolean z = c8369e.license;
        boolean z2 = c8369e.appmetrica;
        int[] Signature = AbstractC10509e.Signature(c8369e.billing);
        for (int i2 : Signature) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            AbstractC2301e.billing(z3);
        }
        C16558e c16558e = new C16558e(uuid, c5609e, hashMap, z, (int[]) Signature.clone(), z2, c5401e);
        byte[] bArr = c8369e.yandex;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC2301e.subscription(c16558e.f32486e.isEmpty());
        c16558e.f32489e = copyOf;
        return c16558e;
    }

    /* renamed from: default, reason: not valid java name */
    public static C18478e m4523default() {
        if (f36221e == null) {
            synchronized (C18478e.class) {
                try {
                    if (f36221e == null) {
                        f36221e = new C18478e(0);
                    }
                } finally {
                }
            }
        }
        return f36221e;
    }

    /* renamed from: else, reason: not valid java name */
    public static int m4524else(C18478e c18478e, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255)) & 8388607;
            if (i7 < 8380417) {
                ((int[]) c18478e.f36228e)[i + i4] = i7;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    public static String premium(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : BuildConfig.FLAVOR);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : BuildConfig.FLAVOR);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return AbstractC4653e.isPro(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return AbstractC10257e.adcel(str, sb2);
    }

    /* renamed from: return, reason: not valid java name */
    public static int m4525return(C18478e c18478e, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && i6 < i3) {
            byte b = bArr[i6];
            int i7 = b & 15;
            i6++;
            int i8 = (b & 255) >> 4;
            if (i4 == 2) {
                if (i7 < 15) {
                    ((int[]) c18478e.f36228e)[i + i5] = 2 - (i7 - (((i7 * 205) >> 10) * 5));
                    i5++;
                }
                if (i8 < 15 && i5 < i2) {
                    ((int[]) c18478e.f36228e)[i + i5] = 2 - (i8 - (((i8 * 205) >> 10) * 5));
                    i5++;
                }
            } else if (i4 == 4) {
                if (i7 < 9) {
                    ((int[]) c18478e.f36228e)[i + i5] = 4 - i7;
                    i5++;
                }
                if (i8 < 9 && i5 < i2) {
                    ((int[]) c18478e.f36228e)[i + i5] = 4 - i8;
                    i5++;
                }
            }
        }
        return i5;
    }

    public static boolean subs(Editable editable, KeyEvent keyEvent, boolean z) {
        C2205e[] c2205eArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c2205eArr = (C2205e[]) editable.getSpans(selectionStart, selectionEnd, C2205e.class)) != null && c2205eArr.length > 0) {
                for (C2205e c2205e : c2205eArr) {
                    int spanStart = editable.getSpanStart(c2205e);
                    int spanEnd = editable.getSpanEnd(c2205e);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: throw, reason: not valid java name */
    public static C18478e m4526throw(Context context) {
        if (f36226e == null) {
            synchronized (f36225e) {
                try {
                    if (f36226e == null) {
                        f36226e = new C18478e(context);
                    }
                } finally {
                }
            }
        }
        return f36226e;
    }

    public void Signature(Function0 function0, String str, int i, C3134e c3134e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i2) {
        c13770e.m3671package(902187916);
        int i3 = i2 | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.purchase(str) ? 32 : 16) | (c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(c3134e) ? 2048 : 1024) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192) | (c13770e.yandex(this) ? 131072 : 65536);
        if (c13770e.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            boolean yandex = c13770e.yandex(this) | ((i3 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C5625e(function0, this, 3);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC1513e.license((Function0) m3681throw, interfaceC12864e, false, AbstractC10432e.ad, c3134e, null, AbstractC16653e.license(-1976720567, new C11830e(i, str), c13770e), c13770e, ((i3 >> 9) & 112) | 805309440 | ((i3 << 3) & 57344), 484);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4280e(this, function0, str, i, c3134e, interfaceC12864e, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r1.f28558e != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r1.f28558e != r11) goto L23;
     */
    /* renamed from: abstract, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4527abstract(defpackage.InterfaceC9660e r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.C7340e r15) {
        /*
            r7 = this;
            eٟٔؑ r1 = new eٟٔؑ
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f36229e = r1
            java.lang.Object r8 = r7.f36227e
            eؒۘٝ r8 = (defpackage.InterfaceC1272e) r8
            if (r8 == 0) goto L11
            return
        L11:
            java.lang.Object r8 = r7.f36228e
            eؘؙٗ r8 = (defpackage.InterfaceC6440e) r8
            eؒۘٝ[] r8 = r8.mopub(r9, r10)
            int r10 = r8.length
            eْٗۤ r10 = defpackage.AbstractC17475e.admob(r10)
            int r11 = r8.length
            r12 = 1
            r13 = 0
            if (r11 != r12) goto L29
            r8 = r8[r13]
            r7.f36227e = r8
            goto L84
        L29:
            int r11 = r8.length
            r14 = r13
        L2b:
            if (r14 >= r11) goto L7e
            r0 = r8[r14]
            boolean r2 = r0.metrica(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r2 == 0) goto L3d
            r7.f36227e = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r1.f28561e = r13
            goto L7e
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5a
        L3d:
            java.util.List r0 = r0.appmetrica()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.license(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            java.lang.Object r0 = r7.f36227e
            eؒۘٝ r0 = (defpackage.InterfaceC1272e) r0
            if (r0 != 0) goto L53
            long r5 = r1.f28558e
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r13
            goto L54
        L53:
            r0 = r12
        L54:
            defpackage.AbstractC2301e.subscription(r0)
            r1.f28561e = r13
            goto L7b
        L5a:
            java.lang.Object r9 = r7.f36227e
            eؒۘٝ r9 = (defpackage.InterfaceC1272e) r9
            if (r9 != 0) goto L68
            long r9 = r1.f28558e
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L67
            goto L68
        L67:
            r12 = r13
        L68:
            defpackage.AbstractC2301e.subscription(r12)
            r1.f28561e = r13
            throw r8
        L6e:
            java.lang.Object r0 = r7.f36227e
            eؒۘٝ r0 = (defpackage.InterfaceC1272e) r0
            if (r0 != 0) goto L53
            long r5 = r1.f28558e
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7b:
            int r14 = r14 + 1
            goto L2b
        L7e:
            java.lang.Object r11 = r7.f36227e
            eؒۘٝ r11 = (defpackage.InterfaceC1272e) r11
            if (r11 == 0) goto L8c
        L84:
            java.lang.Object r8 = r7.f36227e
            eؒۘٝ r8 = (defpackage.InterfaceC1272e) r8
            r8.purchase(r15)
            return
        L8c:
            eؒؓ۠ r11 = new eؒؓ۠
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "None of the available extractors ("
            r12.<init>(r13)
            eؚٟۖ r13 = new eؚٟۖ
            java.lang.String r14 = ", "
            r13.<init>(r14)
            eؒۢۗ r8 = defpackage.AbstractC17475e.tapsense(r8)
            eَۢۡ r14 = new eَۢۡ
            r15 = 0
            r14.<init>(r15)
            java.util.AbstractList r8 = defpackage.AbstractC10589e.purchase(r14, r8)
            java.lang.String r8 = r13.appmetrica(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9.getClass()
            eؒۢۗ r9 = r10.billing()
            r11.<init>(r8, r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4527abstract(eٍۖؔ, android.net.Uri, java.util.Map, long, long, eؚؚٟ):void");
    }

    @Override // defpackage.InterfaceC2786e
    public float ad() {
        InterfaceC2531e interfaceC2531e = ((C13825e) this.f36228e).vip;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        Object valueOf = Float.valueOf(1.0f);
        Object metrica = ((C9000e) interfaceC2531e).metrica(key);
        if (metrica != null) {
            valueOf = metrica;
        }
        Float f = (Float) valueOf;
        float floatValue = f.floatValue();
        if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d) {
            return f.floatValue();
        }
        if (AbstractC9464e.admob()) {
            Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    @Override // defpackage.InterfaceC2786e
    public Rect adcel() {
        Rect rect = (Rect) this.f36227e;
        return rect == null ? (Rect) this.f36229e : rect;
    }

    public void admob(C3274e c3274e, C13770e c13770e, int i) {
        c13770e.m3671package(647974620);
        int i2 = (c13770e.purchase(c3274e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0865e.metrica(AbstractC18007e.metrica(AbstractC12220e.mopub(C0115e.f1276e, 16), 1.0f), null, AbstractC12322e.yandex(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.f18924class, 0L, c13770e, 0, 14), AbstractC12322e.license(), null, AbstractC16653e.license(-1271886512, new C17630e(c3274e, this, 8), c13770e), c13770e, 196614, 18);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, c3274e, i, 16);
        }
    }

    @Override // defpackage.InterfaceC2786e
    public InterfaceC1908e advert(InterfaceC7865e interfaceC7865e) {
        return interfaceC7865e.billing(Collections.singletonList(CaptureRequest.SCALER_CROP_REGION));
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        RunnableC12991e runnableC12991e = new RunnableC12991e(13, this);
        ExecutorC0082e billing = AbstractC3062e.billing();
        C4001e c4001e = c7169e.metrica;
        if (c4001e != null) {
            c4001e.ad(runnableC12991e, billing);
        }
        ((RunnableScheduledFutureC13419e) this.f36229e).f26681e.set(c7169e);
        return "HandlerScheduledFuture-" + ((Callable) this.f36227e).toString();
    }

    public boolean applovin(C13915e c13915e) {
        return !(c13915e.f27587e == null) && (((C5721e) ((C6325e) this.f36228e).f13170e).contains(c13915e) || ((C5721e) ((C6325e) this.f36227e).f13170e).contains(c13915e));
    }

    @Override // defpackage.InterfaceC9617e
    public float appmetrica(float f, float f2) {
        switch (this.f36230e) {
            case 5:
                return 0.0f;
            default:
                AbstractC16904e abstractC16904e = (AbstractC16904e) this.f36228e;
                int smaato = abstractC16904e.smaato();
                C0576e c0576e = abstractC16904e.smaato;
                int i = ((C14870e) c0576e.getValue()).metrica + smaato;
                if (i == 0) {
                    return 0.0f;
                }
                int i2 = f < 0.0f ? abstractC16904e.appmetrica + 1 : abstractC16904e.appmetrica;
                int metrica = AbstractC3062e.metrica(((int) (f2 / i)) + i2, 0, abstractC16904e.advert());
                C16196e c16196e = (C16196e) this.f36229e;
                abstractC16904e.smaato();
                int i3 = ((C14870e) c0576e.getValue()).metrica;
                long j = i2;
                long j2 = c16196e.ad;
                long j3 = j - j2;
                if (j3 < 0) {
                    j3 = 0;
                }
                int i4 = (int) j3;
                long j4 = j + j2;
                if (j4 > 2147483647L) {
                    j4 = 2147483647L;
                }
                int abs = Math.abs((AbstractC3062e.metrica(AbstractC3062e.metrica(metrica, i4, (int) j4), 0, abstractC16904e.advert()) - i2) * i) - i;
                int i5 = abs >= 0 ? abs : 0;
                if (i5 == 0) {
                    return i5;
                }
                return Math.signum(f) * i5;
        }
    }

    @Override // defpackage.InterfaceC13363e
    public int billing() {
        return ((ExtendedFloatingActionButton) this.f36229e).f874e;
    }

    /* renamed from: break, reason: not valid java name */
    public void m4528break(String str, String str2) {
        ((HashMap) this.f36229e).put(str, str2);
    }

    /* renamed from: case, reason: not valid java name */
    public boolean m4529case() {
        return ((HandlerC14624e) this.f36227e) != null;
    }

    /* renamed from: catch, reason: not valid java name */
    public boolean m4530catch() {
        return !(((C5721e) ((C6325e) this.f36228e).f13170e).isEmpty() && ((C5721e) ((C6325e) this.f36229e).f13170e).isEmpty() && ((C5721e) ((C6325e) this.f36227e).f13170e).isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* renamed from: class, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C15525e m4531class() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            defpackage.C12894e.amazon()
            r2 = 0
            java.lang.Object r3 = r8.f36228e     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r8.f36227e     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = premium(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb7
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f36229e     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbb
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbb
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            eٕٗۧ r0 = new eٕٗۧ
            r0.<init>(r1, r2)
            return r0
        Lb4:
            r1 = move-exception
        Lb5:
            r0 = r2
            goto Lbb
        Lb7:
            r1 = r0
            goto Lb5
        Lb9:
            r0 = move-exception
            goto Lb7
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            if (r0 == 0) goto Lc5
            r0.disconnect()
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4531class():eٕٗۧ");
    }

    /* renamed from: const, reason: not valid java name */
    public void m4532const(InterfaceC14388e interfaceC14388e) {
        ((C14434e) this.f36229e).f28539e.ad = interfaceC14388e;
    }

    /* renamed from: continue, reason: not valid java name */
    public void m4533continue(long j) {
        ((C14434e) this.f36229e).f28539e.license = j;
    }

    public void crashlytics(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f36227e;
        String string = ((Context) this.f36229e).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC6832e.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    firebase((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C14803e(e, 13);
            }
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public InterfaceC14388e m4534extends() {
        return ((C14434e) this.f36229e).f28539e.ad;
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public void m4535e(C17688e c17688e) {
        ArrayList arrayList = (ArrayList) this.f36228e;
        arrayList.clear();
        int size = c17688e.f34670e.size();
        for (int i = 0; i < size; i++) {
            C11325e c11325e = (C11325e) c17688e.f34670e.get(i);
            int[] iArr = c11325e.f22751public;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c11325e);
            }
        }
        c17688e.f34663e.f28371e = true;
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public void m4536e(byte[] bArr, short s) {
        int i;
        C11883e c11883e = (C11883e) this.f36229e;
        int i2 = ((C6831e) this.f36227e).yandex;
        if (i2 == 2) {
            c11883e.getClass();
            i = 1;
        } else {
            if (i2 != 4) {
                throw new RuntimeException("Wrong Dilithium Eta!");
            }
            c11883e.getClass();
            i = 2;
        }
        c11883e.getClass();
        C16253e c16253e = (C16253e) c11883e.f23814e;
        int i3 = i * 136;
        byte[] bArr2 = new byte[i3];
        c16253e.reset();
        c16253e.purchase(0, bArr.length, bArr);
        c16253e.purchase(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
        c16253e.smaato(0, i3, bArr2);
        int m4525return = m4525return(this, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, i3, i2);
        while (m4525return < 256) {
            c16253e.smaato(0, 136, bArr2);
            m4525return += m4525return(this, m4525return, 256 - m4525return, bArr2, 136, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* renamed from: eًًؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC15728e m4537e(defpackage.C12860e r8, defpackage.C9265e r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f36228e
            eِۚۘ r0 = (defpackage.C11980e) r0
            java.lang.Object r1 = r0.f23950e
            eٗۙۨ r1 = (defpackage.C17241e) r1
            boolean r9 = r9.license
            eٖٟؖ r2 = r8.vip
            boolean r3 = r2 instanceof defpackage.C17896e
            r4 = 0
            if (r3 == 0) goto L15
            r3 = r2
            e٘ٝ۠ r3 = (defpackage.C17896e) r3
            goto L16
        L15:
            r3 = r4
        L16:
            if (r3 == 0) goto L30
            java.lang.Class r3 = r3.ad
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r5 = defpackage.AbstractC7890e.billing(r3, r5)
            if (r5 == 0) goto L23
            goto L30
        L23:
            java.lang.String r3 = r3.getName()
            eٌٚ۠ r3 = defpackage.EnumC8790e.vip(r3)
            eؕۢٛ r3 = r3.license()
            goto L31
        L30:
            r3 = r4
        L31:
            eُّٟ r5 = new eُّٟ
            r6 = 1
            r5.<init>(r0, r8, r6)
            r8 = 2
            if (r3 == 0) goto L66
            eؘؙؐ r10 = r1.loadAd
            eْٕٔ r10 = r10.amazon()
            eَْ r10 = r10.admob(r3)
            eُؖٗ r0 = new eُؖٗ
            eٌؔٚ r1 = r10.getAnnotations()
            eٌؔٚ[] r8 = new defpackage.InterfaceC2460e[r8]
            r2 = 0
            r8[r2] = r1
            r8[r6] = r5
            r0.<init>(r8)
            eٜؒؒ r8 = defpackage.AbstractC16279e.advert(r10, r0)
            eَْ r8 = (defpackage.AbstractC10226e) r8
            if (r9 == 0) goto L5d
            return r8
        L5d:
            eَْ r9 = r8.pro(r6)
            eٕۛٙ r8 = defpackage.AbstractC1596e.ad(r8, r9)
            return r8
        L66:
            r0 = 6
            eٍٟؗ r8 = defpackage.AbstractC10510e.purchase(r8, r9, r4, r0)
            eٜؒؒ r8 = r7.m4538e(r2, r8)
            r0 = 3
            if (r9 == 0) goto L80
            if (r10 == 0) goto L75
            r6 = r0
        L75:
            eؘؙؐ r9 = r1.loadAd
            eْٕٔ r9 = r9.amazon()
            eَْ r8 = r9.yandex(r6, r8, r5)
            return r8
        L80:
            eؘؙؐ r9 = r1.loadAd
            eْٕٔ r9 = r9.amazon()
            eَْ r9 = r9.yandex(r6, r8, r5)
            eؘؙؐ r10 = r1.loadAd
            eْٕٔ r10 = r10.amazon()
            eَْ r8 = r10.yandex(r0, r8, r5)
            eَْ r8 = r8.pro(r6)
            eٕۛٙ r8 = defpackage.AbstractC1596e.ad(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4537e(eّۤۗ, eٍٟؗ, boolean):eٕۛٙ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r8.ad != 1) goto L21;
     */
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC1186e m4538e(defpackage.InterfaceC15088e r7, defpackage.C9265e r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4538e(eٔۥۣ, eٍٟؗ):eٜؒؒ");
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public void m4539e(InterfaceC15834e interfaceC15834e, InterfaceC6901e interfaceC6901e, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f36229e = null;
        HandlerC14624e handlerC14624e = new HandlerC14624e(this, myLooper, interfaceC15834e, interfaceC6901e, i, SystemClock.elapsedRealtime());
        AbstractC2301e.subscription(((HandlerC14624e) this.f36227e) == null);
        this.f36227e = handlerC14624e;
        handlerC14624e.vip();
    }

    /* renamed from: final, reason: not valid java name */
    public boolean m4540final() {
        C8419e c8419e = (C8419e) this.f36227e;
        return c8419e != null && c8419e.purchase();
    }

    /* renamed from: finally, reason: not valid java name */
    public void m4541finally(InterfaceC14576e interfaceC14576e) {
        ((C14434e) this.f36229e).f28539e.metrica = interfaceC14576e;
    }

    public Object firebase(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.f36228e;
        if (AbstractC12246e.billing()) {
            try {
                String simpleName = cls.getSimpleName();
                String str = simpleName.length() <= 127 ? simpleName : null;
                if (str == null) {
                    str = simpleName.substring(0, 127);
                }
                Trace.beginSection(str);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC6832e interfaceC6832e = (InterfaceC6832e) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> vip = interfaceC6832e.vip();
                if (!vip.isEmpty()) {
                    for (Class cls2 : vip) {
                        if (!hashMap.containsKey(cls2)) {
                            firebase(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC6832e.ad((Context) this.f36229e);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C14803e(th2, 13);
            }
        }
        Trace.endSection();
        return obj;
    }

    /* renamed from: for, reason: not valid java name */
    public void m4542for(EnumC7792e enumC7792e) {
        ((C14434e) this.f36229e).f28539e.vip = enumC7792e;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        Context context = (Context) ((C15816e) this.f36228e).f31190e;
        InterfaceC8850e interfaceC8850e = (InterfaceC8850e) ((InterfaceC16964e) this.f36227e).get();
        C12632e c12632e = (C12632e) ((InterfaceC18006e) this.f36229e).get();
        return C15796e.ad(c12632e, new C17974e(22, new C10739e(24, c12632e)), AbstractC9743e.ad(interfaceC8850e), new C14648e(context, 2));
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger getOrder() {
        return ((AbstractC3903e) this.f36227e).f8719e.f32974e;
    }

    @Override // defpackage.InterfaceC13363e
    public int getWidth() {
        int i = ((ExtendedFloatingActionButton) this.f36229e).f880e;
        return i == -1 ? ((C17424e) this.f36228e).getWidth() : (i == 0 || i == -2) ? ((C2362e) this.f36227e).getWidth() : i;
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: goto */
    public ViewGroup.LayoutParams mo817goto() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f36229e;
        int i = extendedFloatingActionButton.f880e;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.f878e;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    /* renamed from: implements, reason: not valid java name */
    public void m4543implements() {
        int i;
        int[] iArr = (int[]) this.f36228e;
        int[] subscription = AbstractC12442e.subscription(0, iArr.length, iArr);
        int i2 = 256;
        for (int i3 = 1; i3 < 256; i3 <<= 1) {
            for (int i4 = 0; i4 < 256; i4 = i + i3) {
                i2--;
                int i5 = AbstractC6874e.ad[i2] * (-1);
                i = i4;
                while (i < i4 + i3) {
                    int i6 = subscription[i];
                    int i7 = i + i3;
                    subscription[i] = subscription[i7] + i6;
                    int i8 = i6 - subscription[i7];
                    subscription[i7] = i8;
                    subscription[i7] = AbstractC10558e.adcel(i5 * i8);
                    i++;
                }
            }
        }
        for (int i9 = 0; i9 < 256; i9++) {
            subscription[i9] = AbstractC10558e.adcel(subscription[i9] * 41978);
        }
        this.f36228e = subscription;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: import, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m4544import(defpackage.C11800e r6, defpackage.InterfaceC1686e r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C10662e
            if (r0 == 0) goto L13
            r0 = r8
            eَۦؔ r0 = (defpackage.C10662e) r0
            int r1 = r0.f21004e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21004e = r1
            goto L18
        L13:
            eَۦؔ r0 = new eَۦؔ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f21003e
            int r1 = r0.f21004e
            eْۨٝ r2 = defpackage.C13664e.f27089e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L38
            r6 = 3
            if (r1 != r6) goto L30
            defpackage.AbstractC2003e.purchase(r8)
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            goto L7d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            goto L7a
        L3c:
            defpackage.AbstractC2003e.purchase(r8)
            goto L63
        L40:
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = r7 instanceof defpackage.InterfaceC17992e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r8 == 0) goto L6b
            java.util.List r6 = r6.license()
            boolean r8 = r6.isEmpty()
            r3 = 0
            if (r8 != 0) goto L55
            goto L56
        L55:
            r6 = r3
        L56:
            if (r6 == 0) goto L66
            eْ٘ۚ r7 = (defpackage.InterfaceC17992e) r7
            r0.f21004e = r4
            java.lang.Object r8 = r7.vip(r6, r0)
            if (r8 != r1) goto L63
            goto L79
        L63:
            r3 = r8
            java.util.List r3 = (java.util.List) r3
        L66:
            if (r3 != 0) goto L69
            goto L7d
        L69:
            r2 = r3
            goto L7d
        L6b:
            boolean r6 = r7 instanceof defpackage.InterfaceC11116e
            if (r6 == 0) goto L7d
            eُٜؐ r7 = (defpackage.InterfaceC11116e) r7
            r0.f21004e = r3
            java.lang.Object r8 = r7.appmetrica(r0)
            if (r8 != r1) goto L7a
        L79:
            return r1
        L7a:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
        L7d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r2.iterator()
        L8b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r8.next()
            r1 = r0
            eؙٖۛ r1 = (defpackage.AbstractC16049e) r1
            boolean r2 = r1 instanceof defpackage.InterfaceC14776e
            if (r2 == 0) goto La8
            eّٔ٘ r1 = (defpackage.InterfaceC14776e) r1
            boolean r1 = r1.ad()
            if (r1 == 0) goto La8
            r6.add(r0)
            goto L8b
        La8:
            r7.add(r0)
            goto L8b
        Lac:
            eؙۖؕ r8 = new eؙۖؕ
            r8.<init>(r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4544import(eِ٘ٚ, eًؓ۠, eُؑ۠):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // defpackage.InterfaceC16256e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r4, defpackage.InterfaceC3894e r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L17
            boolean r1 = r5 instanceof defpackage.C12219e
            if (r1 == 0) goto L12
            eّؓۖ r5 = (defpackage.C12219e) r5
            eٟؖؖ r1 = r5.f24537e
            eؚؚؐ r1 = (defpackage.C6988e) r1
            r3.f36227e = r1
            java.security.SecureRandom r5 = r5.f24538e
            goto L1b
        L12:
            eؚؚؐ r5 = (defpackage.C6988e) r5
        L14:
            r3.f36227e = r5
            goto L1a
        L17:
            eۣؔۥ r5 = (defpackage.C2964e) r5
            goto L14
        L1a:
            r5 = r0
        L1b:
            java.lang.Object r1 = r3.f36227e
            eًؖؗ r1 = (defpackage.AbstractC3903e) r1
            java.lang.String r2 = "ECDSA"
            defpackage.AbstractC7711e.vip(r2, r1, r4)
            defpackage.AbstractC9915e.ad()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.f36228e
            eًۣ۟ r4 = (defpackage.InterfaceC8251e) r4
            boolean r4 = r4.amazon()
            if (r4 != 0) goto L3b
            if (r5 != 0) goto L3a
            java.security.SecureRandom r0 = defpackage.AbstractC9915e.vip()
            goto L3b
        L3a:
            r0 = r5
        L3b:
            r3.f36229e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.init(boolean, eٟؖؖ):void");
    }

    public boolean inmobi(int i) {
        if (i > 1047552) {
            return true;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = ((int[]) this.f36228e)[i2];
            if (i3 - ((i3 >> 31) & (i3 * 2)) >= i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public Object m4545instanceof(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC14567e interfaceC14567e) {
        int i4;
        char c;
        C0423e c0423e = new C0423e((C11446e) ((C11980e) this.f36227e).f23951e);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = ((C11446e) c0423e.f2469e).ad;
                C11446e c11446e = sparseArray == null ? null : (C11446e) sparseArray.get(codePointAt);
                if (c0423e.f2465e == 2) {
                    if (c11446e != null) {
                        c0423e.f2469e = c11446e;
                        c0423e.f2466e++;
                    } else {
                        if (codePointAt == 65038) {
                            c0423e.reset();
                        } else if (codePointAt != 65039) {
                            C11446e c11446e2 = (C11446e) c0423e.f2469e;
                            if (c11446e2.vip != null) {
                                if (c0423e.f2466e != 1) {
                                    c0423e.f2468e = c11446e2;
                                    c0423e.reset();
                                } else if (c0423e.purchase()) {
                                    c0423e.f2468e = (C11446e) c0423e.f2469e;
                                    c0423e.reset();
                                } else {
                                    c0423e.reset();
                                }
                                c = 3;
                            } else {
                                c0423e.reset();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (c11446e == null) {
                    c0423e.reset();
                    c = 1;
                } else {
                    c0423e.f2465e = 2;
                    c0423e.f2469e = c11446e;
                    c0423e.f2466e = 1;
                    c = 2;
                }
                c0423e.f2464e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !m4550protected(charSequence, i4, i6, ((C11446e) c0423e.f2468e).vip)) {
                        z2 = interfaceC14567e.yandex(charSequence, i4, i6, ((C11446e) c0423e.f2468e).vip);
                        i5++;
                    }
                }
            }
        }
        if (c0423e.f2465e == 2 && ((C11446e) c0423e.f2469e).vip != null && ((c0423e.f2466e > 1 || c0423e.purchase()) && i5 < i3 && z2 && (z || !m4550protected(charSequence, i4, i6, ((C11446e) c0423e.f2469e).vip)))) {
            interfaceC14567e.yandex(charSequence, i4, i6, ((C11446e) c0423e.f2469e).vip);
        }
        return interfaceC14567e.appmetrica();
    }

    /* renamed from: interface, reason: not valid java name */
    public InterfaceC14469e m4546interface(C1962e c1962e) {
        C16558e c16558e;
        c1962e.vip.getClass();
        C8369e c8369e = c1962e.vip.metrica;
        if (c8369e == null) {
            return InterfaceC14469e.amazon;
        }
        synchronized (this.f36228e) {
            try {
                if (!c8369e.equals((C8369e) this.f36227e)) {
                    this.f36227e = c8369e;
                    this.f36229e = ads(c8369e);
                }
                c16558e = (C16558e) this.f36229e;
                c16558e.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c16558e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x011e, code lost:
    
        if (r10 != 3) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0162  */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [eَْ] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r1v13, types: [eٖٕٞ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC10226e isPro(defpackage.C13652e r24, defpackage.C9265e r25, defpackage.AbstractC10226e r26) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.isPro(eْۧۗ, eٍٟؗ, eَْ):eَْ");
    }

    public void isVip(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4;
        ((C11883e) this.f36229e).getClass();
        byte[] bArr2 = new byte[136];
        C16253e c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c16253e.purchase(0, i, bArr);
        c16253e.smaato(0, 136, bArr2);
        long j = 0;
        int i5 = 0;
        while (true) {
            i2 = 8;
            if (i5 >= 8) {
                break;
            }
            j |= (bArr2[i5] & 255) << (i5 * 8);
            i5++;
        }
        for (int i6 = 0; i6 < 256; i6++) {
            ((int[]) this.f36228e)[i6] = 0;
        }
        int i7 = 256 - ((C6831e) this.f36227e).startapp;
        while (i7 < 256) {
            while (true) {
                if (i2 >= 136) {
                    c16253e.smaato(0, 136, bArr2);
                    i2 = 0;
                }
                i3 = i2 + 1;
                i4 = bArr2[i2] & 255;
                if (i4 <= i7) {
                    break;
                } else {
                    i2 = i3;
                }
            }
            int[] iArr = (int[]) this.f36228e;
            iArr[i7] = iArr[i4];
            iArr[i4] = (int) (1 - ((j & 1) * 2));
            j >>= 1;
            i7++;
            i2 = i3;
        }
    }

    @Override // defpackage.InterfaceC2786e
    public float license() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC11659e
    public void loadAd(InterfaceC4868e interfaceC4868e) {
        synchronized (((HashMap) this.f36227e)) {
            ((HashMap) this.f36227e).remove(interfaceC4868e);
            if (((HashMap) this.f36227e).isEmpty()) {
                AbstractC3062e.amazon().execute(new RunnableC0891e(this, 0));
            }
        }
    }

    @Override // defpackage.InterfaceC11659e
    public void metrica(Executor executor, InterfaceC4868e interfaceC4868e) {
        synchronized (((HashMap) this.f36227e)) {
            boolean isEmpty = ((HashMap) this.f36227e).isEmpty();
            ((HashMap) this.f36227e).put(interfaceC4868e, executor);
            if (isEmpty) {
                AbstractC3062e.amazon().execute(new RunnableC0891e(this, 1));
            } else {
                executor.execute(new RunnableC7410e(this, interfaceC4868e, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    @Override // defpackage.InterfaceC16256e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mopub(java.math.BigInteger r7, java.math.BigInteger r8, byte[] r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f36227e
            eًؖؗ r0 = (defpackage.AbstractC3903e) r0
            eؙٗ r0 = r0.f8719e
            java.math.BigInteger r1 = r0.f32974e
            int r2 = r1.bitLength()
            int r3 = r9.length
            int r3 = r3 * 8
            java.math.BigInteger r4 = new java.math.BigInteger
            r5 = 1
            r4.<init>(r5, r9)
            if (r2 >= r3) goto L1c
            int r3 = r3 - r2
            java.math.BigInteger r4 = r4.shiftRight(r3)
        L1c:
            java.math.BigInteger r9 = defpackage.InterfaceC4563e.Signature
            int r2 = r7.compareTo(r9)
            if (r2 < 0) goto Ld0
            int r2 = r7.compareTo(r1)
            if (r2 < 0) goto L2c
            goto Ld0
        L2c:
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto Ld0
            int r9 = r8.compareTo(r1)
            if (r9 < 0) goto L3a
            goto Ld0
        L3a:
            java.math.BigInteger r8 = defpackage.AbstractC5907e.adcel(r1, r8)
            java.math.BigInteger r9 = r4.multiply(r8)
            java.math.BigInteger r9 = r9.mod(r1)
            java.math.BigInteger r8 = r7.multiply(r8)
            java.math.BigInteger r8 = r8.mod(r1)
            eٍۨؔ r0 = r0.f32972e
            java.lang.Object r2 = r6.f36227e
            eًؖؗ r2 = (defpackage.AbstractC3903e) r2
            eۣؔۥ r2 = (defpackage.C2964e) r2
            eٍۨؔ r2 = r2.f7010e
            eٍۨؔ r8 = defpackage.AbstractC0853e.adcel(r0, r9, r2, r8)
            boolean r9 = r8.advert()
            if (r9 == 0) goto L64
            goto Ld0
        L64:
            eؑ٘ؑ r9 = r8.ad
            if (r9 == 0) goto Lba
            java.math.BigInteger r0 = r9.appmetrica
            if (r0 == 0) goto Lba
            java.math.BigInteger r2 = defpackage.InterfaceC4563e.pro
            int r0 = r0.compareTo(r2)
            if (r0 > 0) goto Lba
            int r0 = r9.purchase
            if (r0 == r5) goto L92
            r2 = 2
            if (r0 == r2) goto L89
            r2 = 3
            if (r0 == r2) goto L89
            r2 = 4
            if (r0 == r2) goto L89
            r2 = 6
            if (r0 == r2) goto L92
            r2 = 7
            if (r0 == r2) goto L92
            r0 = 0
            goto L96
        L89:
            eًُ٘ r0 = r8.adcel()
            eًُ٘ r0 = r0.applovin()
            goto L96
        L92:
            eًُ٘ r0 = r8.adcel()
        L96:
            if (r0 == 0) goto Lba
            boolean r2 = r0.subscription()
            if (r2 != 0) goto Lba
            eًُ٘ r8 = r8.vip
        La0:
            boolean r2 = r9.loadAd(r7)
            if (r2 == 0) goto Ld0
            eًُ٘ r2 = r9.adcel(r7)
            eًُ٘ r2 = r2.remoteconfig(r0)
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto Lb5
            return r5
        Lb5:
            java.math.BigInteger r7 = r7.add(r1)
            goto La0
        Lba:
            eٍۨؔ r8 = r8.Signature()
            r8.vip()
            eًُ٘ r8 = r8.vip
            java.math.BigInteger r8 = r8.firebase()
            java.math.BigInteger r8 = r8.mod(r1)
            boolean r7 = r8.equals(r7)
            return r7
        Ld0:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.mopub(java.math.BigInteger, java.math.BigInteger, byte[]):boolean");
    }

    /* renamed from: native, reason: not valid java name */
    public long m4547native() {
        C14446e c14446e = (C14446e) this.f36229e;
        if (c14446e != null) {
            return c14446e.f28558e;
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: new */
    public int mo820new() {
        return ((ExtendedFloatingActionButton) this.f36229e).f873e;
    }

    /* renamed from: package, reason: not valid java name */
    public void m4548package(int i, byte[] bArr) {
        int i2 = ((C6831e) this.f36227e).yandex;
        int i3 = 0;
        if (i2 != 2) {
            if (i2 == 4) {
                while (i3 < 128) {
                    int i4 = i3 * 2;
                    byte b = bArr[i + i3];
                    int[] iArr = (int[]) this.f36228e;
                    iArr[i4] = b & 15;
                    int i5 = i4 + 1;
                    iArr[i5] = (b & 255) >> 4;
                    iArr[i4] = i2 - iArr[i4];
                    iArr[i5] = i2 - iArr[i5];
                    i3++;
                }
                return;
            }
            return;
        }
        while (i3 < 32) {
            int i6 = (i3 * 3) + i;
            int i7 = i3 * 8;
            byte b2 = bArr[i6];
            int[] iArr2 = (int[]) this.f36228e;
            iArr2[i7] = b2 & 7;
            int i8 = i7 + 1;
            int i9 = b2 & 255;
            iArr2[i8] = (i9 >> 3) & 7;
            int i10 = i7 + 2;
            int i11 = bArr[i6 + 1] & 255;
            iArr2[i10] = (i9 >> 6) | ((i11 << 2) & 7);
            int i12 = i7 + 3;
            iArr2[i12] = (i11 >> 1) & 7;
            int i13 = i7 + 4;
            iArr2[i13] = (i11 >> 4) & 7;
            int i14 = i7 + 5;
            int i15 = bArr[i6 + 2] & 255;
            iArr2[i14] = (i11 >> 7) | ((i15 << 1) & 7);
            int i16 = i7 + 6;
            iArr2[i16] = (i15 >> 2) & 7;
            int i17 = i7 + 7;
            iArr2[i17] = (i15 >> 5) & 7;
            iArr2[i7] = i2 - iArr2[i7];
            iArr2[i8] = i2 - iArr2[i8];
            iArr2[i10] = i2 - iArr2[i10];
            iArr2[i12] = i2 - iArr2[i12];
            iArr2[i13] = i2 - iArr2[i13];
            iArr2[i14] = i2 - iArr2[i14];
            iArr2[i16] = i2 - iArr2[i16];
            iArr2[i17] = i2 - iArr2[i17];
            i3++;
        }
    }

    /* renamed from: private, reason: not valid java name */
    public void m4549private(int i, byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i2 = ((C6831e) this.f36227e).yandex;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.f36228e;
                byte b = (byte) (i2 - iArr[i4]);
                bArr2[0] = b;
                byte b2 = (byte) (i2 - iArr[i4 + 1]);
                bArr2[1] = b2;
                bArr[i + i3] = (byte) ((b2 << 4) | b);
            }
            return;
        }
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = i5 * 8;
            int[] iArr2 = (int[]) this.f36228e;
            byte b3 = (byte) (i2 - iArr2[i6]);
            bArr2[0] = b3;
            byte b4 = (byte) (i2 - iArr2[i6 + 1]);
            bArr2[1] = b4;
            byte b5 = (byte) (i2 - iArr2[i6 + 2]);
            bArr2[2] = b5;
            bArr2[3] = (byte) (i2 - iArr2[i6 + 3]);
            bArr2[4] = (byte) (i2 - iArr2[i6 + 4]);
            bArr2[5] = (byte) (i2 - iArr2[i6 + 5]);
            bArr2[6] = (byte) (i2 - iArr2[i6 + 6]);
            bArr2[7] = (byte) (i2 - iArr2[i6 + 7]);
            int i7 = (i5 * 3) + i;
            bArr[i7] = (byte) ((b4 << 3) | b3 | (b5 << 6));
            bArr[i7 + 1] = (byte) ((bArr2[2] >> 2) | (bArr2[3] << 1) | (bArr2[4] << 4) | (bArr2[5] << 7));
            bArr[i7 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
        }
    }

    public C17092e pro() {
        C17974e c17974e;
        C15768e vip;
        C15694e c15694e = (C15694e) this.f36228e;
        if (c15694e == null || (c17974e = (C17974e) this.f36227e) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c15694e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c15694e.ad() && ((Integer) this.f36229e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C15694e) this.f36228e).ad() && ((Integer) this.f36229e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C16372e c16372e = ((C15694e) this.f36228e).license;
        if (c16372e == C16372e.f32165e) {
            vip = AbstractC16176e.ad;
        } else if (c16372e == C16372e.f32167e) {
            vip = AbstractC16176e.ad(((Integer) this.f36229e).intValue());
        } else {
            if (c16372e != C16372e.f32166e) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((C15694e) this.f36228e).license);
            }
            vip = AbstractC16176e.vip(((Integer) this.f36229e).intValue());
        }
        return new C17092e((C15694e) this.f36228e, (C17974e) this.f36227e, vip, (Integer) this.f36229e);
    }

    /* renamed from: protected, reason: not valid java name */
    public boolean m4550protected(CharSequence charSequence, int i, int i2, C17115e c17115e) {
        if ((c17115e.metrica & 3) == 0) {
            InterfaceC10015e interfaceC10015e = (InterfaceC10015e) this.f36229e;
            C4751e vip = c17115e.vip();
            int ad = vip.ad(8);
            if (ad != 0) {
                ((ByteBuffer) vip.f8352e).getShort(ad + vip.f8353e);
            }
            C13090e c13090e = (C13090e) interfaceC10015e;
            c13090e.getClass();
            ThreadLocal threadLocal = C13090e.vip;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = c13090e.ad.hasGlyph(sb.toString());
            int i3 = c17115e.metrica & 4;
            c17115e.metrica = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c17115e.metrica & 3) == 2;
    }

    /* renamed from: public, reason: not valid java name */
    public void m4551public(C17688e c17688e, int i, int i2, int i3) {
        c17688e.getClass();
        int i4 = c17688e.f22761transient;
        int i5 = c17688e.f22743import;
        c17688e.f22761transient = 0;
        c17688e.f22743import = 0;
        c17688e.m3195protected(i2);
        c17688e.m3197throw(i3);
        if (i4 < 0) {
            c17688e.f22761transient = 0;
        } else {
            c17688e.f22761transient = i4;
        }
        if (i5 < 0) {
            c17688e.f22743import = 0;
        } else {
            c17688e.f22743import = i5;
        }
        C17688e c17688e2 = (C17688e) this.f36229e;
        c17688e2.f34652e = i;
        c17688e2.m4381catch();
    }

    @Override // defpackage.InterfaceC16256e
    public BigInteger[] purchase(byte[] bArr) {
        C16833e c16833e = ((AbstractC3903e) this.f36227e).f8719e;
        BigInteger bigInteger = c16833e.f32974e;
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (bitLength < length) {
            bigInteger2 = bigInteger2.shiftRight(length - bitLength);
        }
        BigInteger bigInteger3 = ((C6988e) ((AbstractC3903e) this.f36227e)).f14315e;
        InterfaceC8251e interfaceC8251e = (InterfaceC8251e) this.f36228e;
        if (interfaceC8251e.amazon()) {
            interfaceC8251e.mo2394this(bigInteger, bigInteger3, bArr);
        } else {
            interfaceC8251e.mo2393interface(bigInteger, (SecureRandom) this.f36229e);
        }
        C4630e c4630e = new C4630e(0);
        while (true) {
            BigInteger billing = interfaceC8251e.billing();
            AbstractC9932e Signature = c4630e.license(c16833e.f32972e, billing).Signature();
            Signature.vip();
            BigInteger mod = Signature.vip.firebase().mod(bigInteger);
            BigInteger bigInteger4 = InterfaceC4563e.loadAd;
            if (!mod.equals(bigInteger4)) {
                BigInteger mod2 = AbstractC5907e.startapp(bigInteger, billing).multiply(bigInteger2.add(bigInteger3.multiply(mod))).mod(bigInteger);
                if (!mod2.equals(bigInteger4)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    public C6345e remoteconfig() {
        C17974e c17974e;
        C15768e ad;
        C0834e c0834e = (C0834e) this.f36228e;
        if (c0834e == null || (c17974e = (C17974e) this.f36227e) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c0834e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c0834e.ad() && ((Integer) this.f36229e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C0834e) this.f36228e).ad() && ((Integer) this.f36229e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C6594e c6594e = ((C0834e) this.f36228e).metrica;
        if (c6594e == C6594e.f13611e) {
            ad = AbstractC16176e.ad;
        } else if (c6594e == C6594e.f13612e || c6594e == C6594e.f13606e) {
            ad = AbstractC16176e.ad(((Integer) this.f36229e).intValue());
        } else {
            if (c6594e != C6594e.f13609e) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C0834e) this.f36228e).metrica);
            }
            ad = AbstractC16176e.vip(((Integer) this.f36229e).intValue());
        }
        return new C6345e((C0834e) this.f36228e, (C17974e) this.f36227e, ad, (Integer) this.f36229e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۧۚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [eْٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [eًٍَ, java.lang.Object] */
    public C13654e signatures() {
        UUID uuid = (UUID) this.f36228e;
        C13394e c13394e = (C13394e) this.f36227e;
        HashSet hashSet = (HashSet) this.f36229e;
        ?? obj = new Object();
        obj.ad = uuid;
        obj.vip = c13394e;
        obj.metrica = hashSet;
        C7829e c7829e = c13394e.adcel;
        boolean z = (Build.VERSION.SDK_INT >= 24 && c7829e.yandex.ad.size() > 0) || c7829e.license || c7829e.vip || c7829e.metrica;
        C13394e c13394e2 = (C13394e) this.f36227e;
        if (c13394e2.admob) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c13394e2.billing > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f36228e = UUID.randomUUID();
        C13394e c13394e3 = (C13394e) this.f36227e;
        ?? obj2 = new Object();
        obj2.vip = EnumC7300e.f14903e;
        C13198e c13198e = C13198e.metrica;
        obj2.appmetrica = c13198e;
        obj2.purchase = c13198e;
        obj2.adcel = C7829e.startapp;
        obj2.advert = 1;
        obj2.smaato = 30000L;
        obj2.Signature = -1L;
        obj2.subscription = 1;
        obj2.ad = c13394e3.ad;
        obj2.metrica = c13394e3.metrica;
        obj2.vip = c13394e3.vip;
        obj2.license = c13394e3.license;
        obj2.appmetrica = new C13198e(c13394e3.appmetrica);
        obj2.purchase = new C13198e(c13394e3.purchase);
        obj2.billing = c13394e3.billing;
        obj2.yandex = c13394e3.yandex;
        obj2.startapp = c13394e3.startapp;
        C7829e c7829e2 = c13394e3.adcel;
        ?? obj3 = new Object();
        obj3.ad = 1;
        obj3.purchase = -1L;
        obj3.billing = -1L;
        obj3.yandex = new C14830e();
        obj3.vip = c7829e2.vip;
        obj3.metrica = c7829e2.metrica;
        obj3.ad = c7829e2.ad;
        obj3.license = c7829e2.license;
        obj3.appmetrica = c7829e2.appmetrica;
        obj3.yandex = c7829e2.yandex;
        obj2.adcel = obj3;
        obj2.mopub = c13394e3.mopub;
        obj2.advert = c13394e3.advert;
        obj2.smaato = c13394e3.smaato;
        obj2.amazon = c13394e3.amazon;
        obj2.loadAd = c13394e3.loadAd;
        obj2.Signature = c13394e3.Signature;
        obj2.admob = c13394e3.admob;
        obj2.subscription = c13394e3.subscription;
        this.f36227e = obj2;
        obj2.ad = ((UUID) this.f36228e).toString();
        return obj;
    }

    @Override // defpackage.InterfaceC2786e
    public InterfaceC1908e smaato(float f, InterfaceC7865e interfaceC7865e) {
        Rect rect = (Rect) this.f36229e;
        if (Math.abs(f) < Math.ulp(Math.abs(f)) * 2.0d) {
            if (AbstractC9464e.admob()) {
                Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
            f = 1.0f;
        }
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        Rect rect2 = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        this.f36227e = rect2;
        return interfaceC7865e.adcel(Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, rect2), AbstractC13788e.vip);
    }

    @Override // defpackage.InterfaceC11659e
    public ListenableFuture startapp() {
        return AbstractC5750e.purchase(new C17687e(16, this));
    }

    /* renamed from: static, reason: not valid java name */
    public C0887e m4552static(File file, boolean z) {
        String lowerCase = AbstractC16425e.license(file.getName()).toLowerCase(Locale.ROOT);
        InterfaceC10323e interfaceC10323e = (InterfaceC10323e) ((AbstractC8507e) this.f36227e).get(lowerCase);
        if (interfaceC10323e != null) {
            return interfaceC10323e.ad().metrica(file, lowerCase, z);
        }
        throw new C1110e(lowerCase, "No Reader associated with this extension:%s");
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void m4553strictfp(C18478e c18478e, C18478e c18478e2) {
        for (int i = 0; i < 256; i++) {
            ((int[]) this.f36228e)[i] = AbstractC10558e.adcel(((int[]) c18478e.f36228e)[i] * ((int[]) c18478e2.f36228e)[i]);
        }
    }

    public void subscription(int i, C13915e c13915e) {
        C6325e c6325e = (C6325e) this.f36228e;
        C6325e c6325e2 = (C6325e) this.f36227e;
        C6325e c6325e3 = (C6325e) this.f36229e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            c6325e.ads(c13915e);
            c6325e3.ads(c13915e);
            return;
        }
        if (m2467class == 1) {
            c6325e2.ads(c13915e);
            c6325e3.ads(c13915e);
            return;
        }
        if (m2467class == 2) {
            if (c13915e.f27587e != null) {
                c6325e3.ads(c13915e);
                return;
            } else {
                c6325e.ads(c13915e);
                return;
            }
        }
        if (m2467class != 3) {
            throw new C14803e(10);
        }
        if (c13915e.f27587e != null) {
            c6325e3.ads(c13915e);
        } else {
            c6325e2.ads(c13915e);
        }
    }

    /* renamed from: super, reason: not valid java name */
    public boolean m4554super(int i, C0724e c0724e, C11325e c11325e) {
        C10039e c10039e = (C10039e) this.f36227e;
        int[] iArr = c11325e.f22751public;
        int[] iArr2 = c11325e.pro;
        c10039e.ad = iArr[0];
        c10039e.vip = iArr[1];
        c10039e.metrica = c11325e.admob();
        c10039e.license = c11325e.mopub();
        c10039e.startapp = false;
        c10039e.adcel = i;
        boolean z = c10039e.ad == 3;
        boolean z2 = c10039e.vip == 3;
        boolean z3 = z && c11325e.f22755super > 0.0f;
        boolean z4 = z2 && c11325e.f22755super > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c10039e.ad = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c10039e.vip = 1;
        }
        c0724e.vip(c11325e, c10039e);
        c11325e.m3195protected(c10039e.appmetrica);
        c11325e.m3197throw(c10039e.purchase);
        c11325e.firebase = c10039e.yandex;
        c11325e.m3196this(c10039e.billing);
        c10039e.adcel = 0;
        return c10039e.startapp;
    }

    /* renamed from: switch, reason: not valid java name */
    public void m4555switch(InterfaceC0589e interfaceC0589e) {
        ExecutorC17731e executorC17731e = (ExecutorC17731e) this.f36228e;
        HandlerC14624e handlerC14624e = (HandlerC14624e) this.f36227e;
        if (handlerC14624e != null) {
            handlerC14624e.ad(true);
        }
        if (interfaceC0589e != null) {
            executorC17731e.execute(new RunnableC12991e(18, interfaceC0589e));
        }
        ((C0189e) executorC17731e.f34767e).accept(executorC17731e.f34768e);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m4556synchronized() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = (int[]) this.f36228e;
            int i2 = iArr[i];
            iArr[i] = i2 - (((4194304 + i2) >> 23) * 8380417);
        }
    }

    public void tapsense() {
        HandlerC14624e handlerC14624e = (HandlerC14624e) this.f36227e;
        handlerC14624e.getClass();
        handlerC14624e.ad(false);
    }

    /* renamed from: this, reason: not valid java name */
    public InterfaceC14576e m4557this() {
        return ((C14434e) this.f36229e).f28539e.metrica;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6.mo696protected(r0) == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r6 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: throws, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m4558throws(defpackage.C7838e r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C9612e
            if (r0 == 0) goto L13
            r0 = r7
            eٍٝٞ r0 = (defpackage.C9612e) r0
            int r1 = r0.f19059e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19059e = r1
            goto L18
        L13:
            eٍٝٞ r0 = new eٍٝٞ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f19058e
            int r1 = r0.f19059e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r7)
            goto L4e
        L36:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f19059e = r3
            eؕٚۖ r7 = new eؕٚۖ
            r1 = 0
            r3 = 7
            r7.<init>(r5, r6, r1, r3)
            java.lang.Object r6 = defpackage.AbstractC9743e.appmetrica(r7, r0)
            if (r6 != r4) goto L49
            goto L4b
        L49:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L4b:
            if (r6 != r4) goto L4e
            goto L5c
        L4e:
            java.lang.Object r6 = r5.f36227e
            eٌُؑ r6 = (defpackage.C8419e) r6
            if (r6 == 0) goto L60
            r0.f19059e = r2
            java.lang.Object r6 = r6.mo696protected(r0)
            if (r6 != r4) goto L5d
        L5c:
            return r4
        L5d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L60:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.m4558throws(eًٍۘ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f36230e) {
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                StringBuilder sb = new StringBuilder("[");
                int i = 0;
                while (true) {
                    int[] iArr = (int[]) this.f36228e;
                    if (i >= iArr.length) {
                        sb.append("]");
                        return sb.toString();
                    }
                    sb.append(iArr[i]);
                    if (i != ((int[]) this.f36228e).length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m4559transient() {
        int i;
        int[] iArr = (int[]) this.f36228e;
        int[] subscription = AbstractC12442e.subscription(0, iArr.length, iArr);
        int i2 = 0;
        for (int i3 = 128; i3 > 0; i3 >>>= 1) {
            for (int i4 = 0; i4 < 256; i4 = i + i3) {
                i2++;
                int i5 = AbstractC6874e.ad[i2];
                i = i4;
                while (i < i4 + i3) {
                    int adcel = AbstractC10558e.adcel(i5 * subscription[r9]);
                    subscription[i + i3] = subscription[i] - adcel;
                    subscription[i] = subscription[i] + adcel;
                    i++;
                }
            }
        }
        this.f36228e = subscription;
    }

    /* renamed from: try, reason: not valid java name */
    public long m4560try() {
        return ((C14434e) this.f36229e).f28539e.license;
    }

    @Override // defpackage.InterfaceC13363e
    public int vip() {
        int i = ((ExtendedFloatingActionButton) this.f36229e).f878e;
        return i == -1 ? ((C17424e) this.f36228e).vip() : (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((C2362e) this.f36227e).f5914e).getMeasuredHeight() : i;
    }

    /* renamed from: volatile, reason: not valid java name */
    public void m4561volatile() {
        TimeUnit timeUnit = TimeUnit.DAYS;
        ((C13394e) this.f36227e).billing = timeUnit.toMillis(3650L);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((C13394e) this.f36227e).billing) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* renamed from: while, reason: not valid java name */
    public EnumC7792e m4562while() {
        return ((C14434e) this.f36229e).f28539e.vip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0182, code lost:
    
        if (r8 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
    
        if (r8 != false) goto L83;
     */
    @Override // defpackage.InterfaceC9617e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float yandex(float r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18478e.yandex(float):float");
    }
}
