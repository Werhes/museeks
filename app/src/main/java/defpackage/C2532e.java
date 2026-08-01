package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2532e implements InterfaceC1363e, InterfaceC18372e, InterfaceC17564e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final byte[] f6382e = new byte[0];

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static HashSet f6383e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f6384e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f6385e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f6386e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f6387e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f6388e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f6389e;

    public C2532e(int i) {
        switch (i) {
            case 4:
                this.f6388e = new AtomicBoolean(false);
                this.f6386e = new CountDownLatch(1);
                this.f6389e = "PublicSuffixDatabase.list";
                return;
            case 15:
                AbstractC17648e abstractC17648e = (AbstractC17648e) ((C5363e) AbstractC18413e.ad.f23948e).getValue();
                if (!(abstractC17648e instanceof C10360e)) {
                    new C0208e(abstractC17648e);
                }
                new ConcurrentHashMap();
                this.f6388e = new ConcurrentHashMap();
                this.f6386e = new ConcurrentHashMap();
                this.f6385e = new ConcurrentHashMap();
                new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f6387e = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f6384e = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f6389e = new ConcurrentHashMap();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f6388e = C2411e.f6162goto.advert(C8814e.billing);
                this.f6386e = C6689e.vip;
                this.f6385e = C5298e.vip;
                this.f6387e = C1410e.f4222e;
                this.f6384e = Bundle.EMPTY;
                this.f6389e = null;
                return;
            default:
                this.f6388e = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f6386e = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f6385e = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f6387e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f6384e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f6389e = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
        }
    }

    public /* synthetic */ C2532e(Context context) {
        this.f6386e = "files";
        this.f6385e = "common";
        this.f6387e = AbstractC0481e.vip;
        this.f6384e = BuildConfig.FLAVOR;
        this.f6389e = AbstractC17475e.Signature();
        AbstractC4511e.pro(context != null, "Context cannot be null", new Object[0]);
        this.f6388e = context.getPackageName();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eؚؑ۟, java.lang.Object] */
    public C2532e(InterfaceC0987e interfaceC0987e) {
        long j = RecyclerView.UNDEFINED_DURATION;
        this.f6386e = new AtomicLong((j & 4294967295L) | (j << 32));
        this.f6385e = new AtomicReference(null);
        this.f6387e = new AtomicReference(null);
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        this.f6384e = new ExecutorC12022e(enumC3320e);
        ?? obj = new Object();
        this.f6389e = obj;
        RunnableC12554e runnableC12554e = new RunnableC12554e();
        runnableC12554e.f25148e = interfaceC0987e;
        runnableC12554e.f25147e = enumC3320e;
        this.f6388e = runnableC12554e;
        obj.ad(runnableC12554e, enumC3320e);
    }

    public C2532e(C2411e c2411e, C6689e c6689e, C5298e c5298e, AbstractC17475e abstractC17475e, Bundle bundle, C4960e c4960e) {
        this.f6388e = c2411e;
        this.f6386e = c6689e;
        this.f6385e = c5298e;
        this.f6387e = abstractC17475e;
        this.f6384e = bundle == null ? Bundle.EMPTY : bundle;
        this.f6389e = c4960e;
    }

    public /* synthetic */ C2532e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f6388e = obj;
        this.f6386e = obj2;
        this.f6385e = obj3;
        this.f6387e = obj4;
        this.f6384e = obj5;
        this.f6389e = obj6;
    }

    public C2532e(Set set, String str, String str2) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f6388e = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f6385e = str;
        this.f6387e = str2;
        this.f6384e = C10111e.vip;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        this.f6386e = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static C2359e applovin(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C2359e(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static void appmetrica(C4660e c4660e, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = c4660e.vip.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    /* renamed from: case, reason: not valid java name */
    public static void m862case(C2459e c2459e, String str) {
        AbstractC14697e loadAd = c2459e.ad.loadAd(str);
        if (loadAd == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(loadAd instanceof C2459e)) {
            m873protected("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (loadAd == c2459e) {
            m873protected("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C2459e c2459e2 = (C2459e) loadAd;
        if (c2459e.Signature == null) {
            c2459e.Signature = c2459e2.Signature;
        }
        if (c2459e.admob == null) {
            c2459e.admob = c2459e2.admob;
        }
        if (c2459e.subscription == null) {
            c2459e.subscription = c2459e2.subscription;
        }
        if (c2459e.remoteconfig == null) {
            c2459e.remoteconfig = c2459e2.remoteconfig;
        }
        if (c2459e.pro == null) {
            c2459e.pro = c2459e2.pro;
        }
        if (c2459e.signatures == null) {
            c2459e.signatures = c2459e2.signatures;
        }
        if (c2459e.tapsense == null) {
            c2459e.tapsense = c2459e2.tapsense;
        }
        if (c2459e.startapp.isEmpty()) {
            c2459e.startapp = c2459e2.startapp;
        }
        if (c2459e.loadAd == null) {
            c2459e.loadAd = c2459e2.loadAd;
        }
        if (c2459e.amazon == null) {
            c2459e.amazon = c2459e2.amazon;
        }
        String str2 = c2459e2.isVip;
        if (str2 != null) {
            m862case(c2459e, str2);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public static int m863class(int i, float f) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: default, reason: not valid java name */
    public static void m864default(AbstractC7242e abstractC7242e, String str) {
        AbstractC14697e loadAd = abstractC7242e.ad.loadAd(str);
        if (loadAd == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(loadAd instanceof AbstractC7242e)) {
            m873protected("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (loadAd == abstractC7242e) {
            m873protected("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC7242e abstractC7242e2 = (AbstractC7242e) loadAd;
        if (abstractC7242e.startapp == null) {
            abstractC7242e.startapp = abstractC7242e2.startapp;
        }
        if (abstractC7242e.adcel == null) {
            abstractC7242e.adcel = abstractC7242e2.adcel;
        }
        if (abstractC7242e.mopub == 0) {
            abstractC7242e.mopub = abstractC7242e2.mopub;
        }
        if (abstractC7242e.yandex.isEmpty()) {
            abstractC7242e.yandex = abstractC7242e2.yandex;
        }
        try {
            if (abstractC7242e instanceof C4502e) {
                C4502e c4502e = (C4502e) abstractC7242e;
                C4502e c4502e2 = (C4502e) loadAd;
                if (c4502e.smaato == null) {
                    c4502e.smaato = c4502e2.smaato;
                }
                if (c4502e.amazon == null) {
                    c4502e.amazon = c4502e2.amazon;
                }
                if (c4502e.loadAd == null) {
                    c4502e.loadAd = c4502e2.loadAd;
                }
                if (c4502e.Signature == null) {
                    c4502e.Signature = c4502e2.Signature;
                }
            } else {
                m871implements((C2775e) abstractC7242e, (C2775e) loadAd);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC7242e2.advert;
        if (str2 != null) {
            m864default(abstractC7242e, str2);
        }
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public static Path m865e(C18207e c18207e) {
        Path path = new Path();
        float[] fArr = c18207e.loadAd;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c18207e.loadAd;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c18207e instanceof C6958e) {
            path.close();
        }
        if (c18207e.yandex == null) {
            c18207e.yandex = applovin(path);
        }
        return path;
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public static void m866e(C1506e c1506e, boolean z, AbstractC11870e abstractC11870e) {
        int i;
        C17619e c17619e = c1506e.ad;
        float floatValue = (z ? c17619e.f34499e : c17619e.f34495e).floatValue();
        if (abstractC11870e instanceof C18073e) {
            i = ((C18073e) abstractC11870e).f35446e;
        } else if (!(abstractC11870e instanceof C2833e)) {
            return;
        } else {
            i = c1506e.ad.f34515e.f35446e;
        }
        int m863class = m863class(i, floatValue);
        if (z) {
            c1506e.license.setColor(m863class);
        } else {
            c1506e.appmetrica.setColor(m863class);
        }
    }

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public static void m867e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C17264e.vip;
        }
        mutate.setColorFilter(C17264e.metrica(i, mode));
    }

    /* renamed from: final, reason: not valid java name */
    public static /* synthetic */ List m868final(C2532e c2532e, AbstractC7919e abstractC7919e, C17613e c17613e, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return c2532e.m880catch(abstractC7919e, c17613e, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    /* renamed from: finally, reason: not valid java name */
    public static boolean m869finally(C17619e c17619e, long j) {
        return (j & c17619e.f34528e) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r7.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface firebase(int r5, java.lang.Integer r6, java.lang.String r7) {
        /*
            r0 = 0
            r1 = 1
            r2 = 2
            if (r5 != r2) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r0
        L8:
            int r6 = r6.intValue()
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 3
            if (r6 <= r3) goto L17
            if (r5 == 0) goto L15
            r5 = r4
            goto L1c
        L15:
            r5 = r1
            goto L1c
        L17:
            if (r5 == 0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r0
        L1c:
            r7.getClass()
            int r6 = r7.hashCode()
            r3 = -1
            switch(r6) {
                case -1536685117: goto L55;
                case -1431958525: goto L4a;
                case -1081737434: goto L3f;
                case 109326717: goto L34;
                case 1126973893: goto L29;
                default: goto L27;
            }
        L27:
            r0 = r3
            goto L5e
        L29:
            java.lang.String r6 = "cursive"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L32
            goto L27
        L32:
            r0 = 4
            goto L5e
        L34:
            java.lang.String r6 = "serif"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L3d
            goto L27
        L3d:
            r0 = r4
            goto L5e
        L3f:
            java.lang.String r6 = "fantasy"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L48
            goto L27
        L48:
            r0 = r2
            goto L5e
        L4a:
            java.lang.String r6 = "monospace"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L53
            goto L27
        L53:
            r0 = r1
            goto L5e
        L55:
            java.lang.String r6 = "sans-serif"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L5e
            goto L27
        L5e:
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L78;
                case 2: goto L71;
                case 3: goto L6a;
                case 4: goto L63;
                default: goto L61;
            }
        L61:
            r5 = 0
            return r5
        L63:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L6a:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L71:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L78:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L7f:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.firebase(int, java.lang.Integer, java.lang.String):android.graphics.Typeface");
    }

    /* renamed from: goto, reason: not valid java name */
    public static ColorStateList m870goto(Context context, int i) {
        int metrica = AbstractC17382e.metrica(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC17382e.vip, AbstractC17382e.license, AbstractC17382e.metrica, AbstractC17382e.purchase}, new int[]{AbstractC17382e.vip(context, R.attr.colorButtonNormal), AbstractC3898e.billing(metrica, i), AbstractC3898e.billing(metrica, i), i});
    }

    /* renamed from: implements, reason: not valid java name */
    public static void m871implements(C2775e c2775e, C2775e c2775e2) {
        if (c2775e.smaato == null) {
            c2775e.smaato = c2775e2.smaato;
        }
        if (c2775e.amazon == null) {
            c2775e.amazon = c2775e2.amazon;
        }
        if (c2775e.loadAd == null) {
            c2775e.loadAd = c2775e2.loadAd;
        }
        if (c2775e.Signature == null) {
            c2775e.Signature = c2775e2.Signature;
        }
        if (c2775e.admob == null) {
            c2775e.admob = c2775e2.admob;
        }
    }

    /* renamed from: import, reason: not valid java name */
    public static C17613e m872import(AbstractC6649e abstractC6649e, InterfaceC11824e interfaceC11824e, C17221e c17221e, int i, boolean z) {
        C4442e c4442e;
        if (abstractC6649e instanceof C11505e) {
            C18521e c18521e = C13814e.ad;
            C11771e ad = C13814e.ad((C11505e) abstractC6649e, interfaceC11824e, c17221e);
            if (ad != null) {
                return AbstractC9408e.ad(ad);
            }
        } else if (abstractC6649e instanceof C9920e) {
            C18521e c18521e2 = C13814e.ad;
            C11771e metrica = C13814e.metrica((C9920e) abstractC6649e, interfaceC11824e, c17221e);
            if (metrica != null) {
                return AbstractC9408e.ad(metrica);
            }
        } else if ((abstractC6649e instanceof C17485e) && (c4442e = (C4442e) AbstractC0863e.appmetrica((AbstractC0641e) abstractC6649e, AbstractC5745e.license)) != null) {
            int m2467class = AbstractC8703e.m2467class(i);
            if (m2467class == 1) {
                return AbstractC6143e.startapp((C17485e) abstractC6649e, interfaceC11824e, c17221e, true, true, z);
            }
            if (m2467class != 2) {
                if (m2467class != 3 || (c4442e.f9640e & 8) != 8) {
                    return null;
                }
                C17758e c17758e = c4442e.f9646e;
                return new C17613e(interfaceC11824e.getString(c17758e.f34833e).concat(interfaceC11824e.getString(c17758e.f34835e)));
            }
            if (c4442e.startapp()) {
                C17758e c17758e2 = c4442e.f9638e;
                return new C17613e(interfaceC11824e.getString(c17758e2.f34833e).concat(interfaceC11824e.getString(c17758e2.f34835e)));
            }
        }
        return null;
    }

    public static C4660e license(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(AbstractC1786e.admob(readInt2, "Invalid value size: "));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = AbstractC9413e.vip;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new C4660e(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix premium(defpackage.C2359e r9, defpackage.C2359e r10, defpackage.C9213e r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            eّ۟ؓ r1 = r11.ad
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.license
            float r3 = r10.license
            float r2 = r2 / r3
            float r3 = r9.appmetrica
            float r4 = r10.appmetrica
            float r3 = r3 / r4
            float r4 = r10.vip
            float r4 = -r4
            float r5 = r10.metrica
            float r5 = -r5
            eٍؓۘ r6 = defpackage.C9213e.metrica
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.vip
            float r9 = r9.metrica
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.vip
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.license
            float r2 = r2 / r11
            float r3 = r9.appmetrica
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.license
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.license
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.appmetrica
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.appmetrica
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.vip
            float r9 = r9.metrica
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.premium(eؔؕؑ, eؔؕؑ, eٍؓۘ):android.graphics.Matrix");
    }

    /* renamed from: protected, reason: not valid java name */
    public static void m873protected(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: super, reason: not valid java name */
    public static C18208e m874super(InterfaceC16843e interfaceC16843e, AbstractC17475e abstractC17475e, C18208e c18208e, C6158e c6158e) {
        AbstractC6690e mo2105e = interfaceC16843e.mo2105e();
        int mo2067default = interfaceC16843e.mo2067default();
        Object advert = mo2105e.Signature() ? null : mo2105e.advert(mo2067default);
        int vip = (interfaceC16843e.applovin() || mo2105e.Signature()) ? -1 : mo2105e.purchase(mo2067default, c6158e, false).vip(AbstractC9413e.m2546case(interfaceC16843e.mo2071e()) - c6158e.appmetrica);
        for (int i = 0; i < abstractC17475e.size(); i++) {
            C18208e c18208e2 = (C18208e) abstractC17475e.get(i);
            if (m877throws(c18208e2, advert, interfaceC16843e.applovin(), interfaceC16843e.mo2090e(), interfaceC16843e.mo2128import(), vip)) {
                return c18208e2;
            }
        }
        if (abstractC17475e.isEmpty() && c18208e != null && m877throws(c18208e, advert, interfaceC16843e.applovin(), interfaceC16843e.mo2090e(), interfaceC16843e.mo2128import(), vip)) {
            return c18208e;
        }
        return null;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static LayerDrawable m875synchronized(C17694e c17694e, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable purchase = c17694e.purchase(context, R.drawable.abc_star_black_48dp);
        Drawable purchase2 = c17694e.purchase(context, R.drawable.abc_star_half_black_48dp);
        if ((purchase instanceof BitmapDrawable) && purchase.getIntrinsicWidth() == dimensionPixelSize && purchase.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) purchase;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            purchase.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            purchase.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((purchase2 instanceof BitmapDrawable) && purchase2.getIntrinsicWidth() == dimensionPixelSize && purchase2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) purchase2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            purchase2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            purchase2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean tapsense(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, eِّؔ] */
    /* renamed from: this, reason: not valid java name */
    public static C2532e m876this(byte[] bArr, byte[] bArr2, byte[] bArr3, C3168e c3168e, C0680e c0680e, InterfaceC17063e interfaceC17063e, byte[] bArr4) {
        byte[] bArr5;
        byte[] m1244e = c3168e.m1244e();
        String str = c0680e.ad;
        char c = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bArr5 = AbstractC0097e.purchase;
                break;
            case 1:
                bArr5 = AbstractC0097e.billing;
                break;
            case 2:
                bArr5 = AbstractC0097e.yandex;
                break;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
        byte[] ad = AbstractC7640e.ad(AbstractC0097e.amazon, m1244e, bArr5, interfaceC17063e.isVip());
        byte[] bArr6 = AbstractC0097e.advert;
        byte[] bArr7 = AbstractC0097e.loadAd;
        Charset charset = AbstractC6336e.ad;
        byte[] bytes = "psk_id_hash".getBytes(charset);
        byte[] bArr8 = f6382e;
        byte[] ad2 = AbstractC7640e.ad(bArr, c0680e.vip(AbstractC7640e.ad(bArr7, ad, bytes, bArr8), bArr6), c0680e.vip(AbstractC7640e.ad(bArr7, ad, "info_hash".getBytes(charset), bArr4), bArr6));
        byte[] vip = c0680e.vip(AbstractC7640e.ad(bArr7, ad, "secret".getBytes(charset), bArr8), bArr3);
        int subscription = interfaceC17063e.subscription();
        byte[] ad3 = c0680e.ad(vip, subscription, AbstractC7640e.ad(AbstractC0097e.vip(2, subscription), bArr7, ad, "key".getBytes(charset), ad2));
        byte[] ad4 = c0680e.ad(vip, 12, AbstractC7640e.ad(AbstractC0097e.vip(2, 12), bArr7, ad, "base_nonce".getBytes(charset), ad2));
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = bigInteger.shiftLeft(96).subtract(bigInteger);
        ?? obj = new Object();
        obj.f6384e = bArr2;
        obj.f6385e = ad3;
        obj.f6387e = ad4;
        obj.f6389e = BigInteger.ZERO;
        obj.f6386e = subtract;
        obj.f6388e = interfaceC17063e;
        return obj;
    }

    /* renamed from: throws, reason: not valid java name */
    public static boolean m877throws(C18208e c18208e, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c18208e.ad;
        int i4 = c18208e.vip;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c18208e.metrica == i2) {
            return true;
        }
        return !z && i4 == -1 && c18208e.appmetrica == i3;
    }

    public static void yandex(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC10371e interfaceC10371e) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC10371e.appmetrica(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (cos * d2) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double acos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d26 = acos2 % 6.283185307179586d;
        double d27 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ceil;
        double d29 = d28 / 2.0d;
        double sin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double cos2 = Math.cos(d31);
            double sin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (cos2 - (sin2 * sin3));
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d32 = d31 + d28;
            double cos3 = Math.cos(d32);
            double sin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i5 + 4] = (float) cos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) sin4;
            i2 = i4 + 1;
            d27 = d30;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            interfaceC10371e.metrica(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    @Override // defpackage.InterfaceC17564e
    public List Signature(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i, int i2, C10067e c10067e) {
        return m882continue(abstractC7919e, abstractC6649e, i, i2);
    }

    /* renamed from: abstract, reason: not valid java name */
    public C0560e m878abstract(C0560e c0560e) {
        return c0560e.billing(new ExecutorC14279e(2), new C12582e(25, this));
    }

    @Override // defpackage.InterfaceC1363e
    public void ad(InterfaceC4082e interfaceC4082e) {
        AbstractC5336e.purchase(C11519e.f23146e, null, 0, new C11435e((Activity) this.f6387e, (String) this.f6384e, (String) this.f6389e, interfaceC4082e, null), 3);
    }

    @Override // defpackage.InterfaceC18372e
    public Object adcel(AbstractC7919e abstractC7919e, C17485e c17485e, AbstractC1186e abstractC1186e) {
        return m923for(abstractC7919e, c17485e, 3, abstractC1186e, C5983e.f12606e);
    }

    public void admob(Csuper csuper, C18208e c18208e, AbstractC6690e abstractC6690e) {
        if (c18208e == null) {
            return;
        }
        if (abstractC6690e.vip(c18208e.ad) != -1) {
            csuper.mo3904implements(c18208e, abstractC6690e);
            return;
        }
        AbstractC6690e abstractC6690e2 = (AbstractC6690e) ((C0409e) this.f6385e).get(c18208e);
        if (abstractC6690e2 != null) {
            csuper.mo3904implements(c18208e, abstractC6690e2);
        }
    }

    public float ads(AbstractC2781e abstractC2781e) {
        C16371e c16371e = new C16371e(this);
        m937try(abstractC2781e, c16371e);
        return c16371e.vip;
    }

    @Override // defpackage.InterfaceC17564e
    public List advert(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i) {
        return m882continue(abstractC7919e, abstractC6649e, i, abstractC6649e instanceof C9920e ? ((C9920e) abstractC6649e).f19592e.size() : abstractC6649e instanceof C17485e ? ((C17485e) abstractC6649e).f34262e.size() : 0);
    }

    @Override // defpackage.InterfaceC1363e
    public void amazon(InterfaceC4082e interfaceC4082e) {
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList billing(C8372e c8372e, InterfaceC11824e interfaceC11824e) {
        List list = c8372e.f17132e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f6384e).subscription((C4599e) it.next(), interfaceC11824e));
        }
        return arrayList;
    }

    /* renamed from: break, reason: not valid java name */
    public void m879break(AbstractC2781e abstractC2781e, StringBuilder sb) {
        Iterator it = abstractC2781e.startapp.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AbstractC16408e abstractC16408e = (AbstractC16408e) it.next();
            if (abstractC16408e instanceof AbstractC2781e) {
                m879break((AbstractC2781e) abstractC16408e, sb);
            } else if (abstractC16408e instanceof C3530e) {
                sb.append(m910e(((C3530e) abstractC16408e).metrica, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: catch, reason: not valid java name */
    public List m880catch(AbstractC7919e abstractC7919e, C17613e c17613e, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        C6798e purchase = AbstractC12547e.purchase(abstractC7919e, z, z2, bool, z3, (C7850e) this.f6388e, (C16308e) this.f6389e);
        if (purchase == null) {
            if (abstractC7919e instanceof C15447e) {
                InterfaceC3054e interfaceC3054e = (InterfaceC3054e) ((C15447e) abstractC7919e).f16036e;
                C16835e c16835e = interfaceC3054e instanceof C16835e ? (C16835e) interfaceC3054e : null;
                if (c16835e != null) {
                    purchase = c16835e.f32984e;
                }
            }
            purchase = null;
        }
        return (purchase == null || (list = (List) ((C12942e) ((C1159e) this.f6386e).invoke(purchase)).ad.get(c17613e)) == null) ? C13664e.f27089e : list;
    }

    /* renamed from: const, reason: not valid java name */
    public C5476e m881const() {
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        Object obj = AbstractC18303e.ad;
        InterfaceC0504e interfaceC0504e = obj != null ? (InterfaceC0504e) obj : null;
        Context vip = interfaceC0504e != null ? interfaceC0504e.vip() : null;
        AssetManager assets = vip != null ? vip.getAssets() : null;
        if (assets != null) {
            return AbstractC8636e.appmetrica(assets.open((String) this.f6389e));
        }
        if (Build.FINGERPRINT == null) {
            throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
        }
        throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
    }

    /* renamed from: continue, reason: not valid java name */
    public List m882continue(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i, int i2) {
        C17613e m872import = m872import(abstractC6649e, (InterfaceC11824e) abstractC7919e.f16035e, (C17221e) abstractC7919e.f16034e, i, false);
        if (m872import == null) {
            return C13664e.f27089e;
        }
        return m868final(this, abstractC7919e, new C17613e(m872import.ad + '@' + i2), null, false, 60);
    }

    public void crashlytics(AbstractC6547e abstractC6547e) {
        AbstractC11870e abstractC11870e = ((C1506e) this.f6385e).ad.f34506e;
        if (abstractC11870e instanceof C7912e) {
            m926native(true, abstractC6547e.yandex, (C7912e) abstractC11870e);
        }
        AbstractC11870e abstractC11870e2 = ((C1506e) this.f6385e).ad.f34523e;
        if (abstractC11870e2 instanceof C7912e) {
            m926native(false, abstractC6547e.yandex, (C7912e) abstractC11870e2);
        }
    }

    /* renamed from: else, reason: not valid java name */
    public void m883else(long j) {
        InterfaceC14610e interfaceC14610e;
        SparseArray sparseArray = (SparseArray) this.f6386e;
        HashMap hashMap = (HashMap) this.f6388e;
        InterfaceC14610e interfaceC14610e2 = (InterfaceC14610e) this.f6384e;
        interfaceC14610e2.smaato(j);
        InterfaceC14610e interfaceC14610e3 = (InterfaceC14610e) this.f6389e;
        if (interfaceC14610e3 != null) {
            interfaceC14610e3.smaato(j);
        }
        if (interfaceC14610e2.mopub() || (interfaceC14610e = (InterfaceC14610e) this.f6389e) == null || !interfaceC14610e.mopub()) {
            interfaceC14610e2.amazon(hashMap, sparseArray);
        } else {
            ((InterfaceC14610e) this.f6389e).amazon(hashMap, sparseArray);
            interfaceC14610e2.purchase(hashMap);
        }
        InterfaceC14610e interfaceC14610e4 = (InterfaceC14610e) this.f6389e;
        if (interfaceC14610e4 != null) {
            interfaceC14610e4.appmetrica();
            this.f6389e = null;
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean m884extends() {
        Boolean bool = ((C1506e) this.f6385e).ad.f34533e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public C0560e m885e(String str, String str2, Bundle bundle) {
        int i;
        try {
            m897e(str, str2, bundle);
            C5916e c5916e = (C5916e) this.f6385e;
            ExecutorC0082e executorC0082e = ExecutorC0082e.f1250e;
            C10629e c10629e = c5916e.metrica;
            if (c10629e.isVip() < 12000000) {
                return c10629e.isPro() != 0 ? c5916e.ad(bundle).yandex(executorC0082e, new C0642e(c5916e, bundle, 9)) : AbstractC1749e.license(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C9556e m2611default = C9556e.m2611default(c5916e.vip);
            synchronized (m2611default) {
                i = m2611default.f18970e;
                m2611default.f18970e = i + 1;
            }
            return m2611default.m2615implements(new C2680e(i, 1, bundle, 1)).billing(executorC0082e, C17647e.f34586e);
        } catch (InterruptedException | ExecutionException e) {
            return AbstractC1749e.license(e);
        }
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public C2359e m886e(C17102e c17102e, C17102e c17102e2, C17102e c17102e3, C17102e c17102e4) {
        float license = c17102e != null ? c17102e.license(this) : 0.0f;
        float appmetrica = c17102e2 != null ? c17102e2.appmetrica(this) : 0.0f;
        C1506e c1506e = (C1506e) this.f6385e;
        C2359e c2359e = c1506e.billing;
        if (c2359e == null) {
            c2359e = c1506e.purchase;
        }
        return new C2359e(license, appmetrica, c17102e3 != null ? c17102e3.license(this) : c2359e.license, c17102e4 != null ? c17102e4.appmetrica(this) : c2359e.appmetrica);
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public void m887e(C1506e c1506e, C17619e c17619e) {
        if (m869finally(c17619e, 4096L)) {
            c1506e.ad.f34515e = c17619e.f34515e;
        }
        if (m869finally(c17619e, 2048L)) {
            c1506e.ad.f34500e = c17619e.f34500e;
        }
        boolean m869finally = m869finally(c17619e, 1L);
        C18073e c18073e = C18073e.f35444e;
        if (m869finally) {
            c1506e.ad.f34506e = c17619e.f34506e;
            AbstractC11870e abstractC11870e = c17619e.f34506e;
            c1506e.vip = (abstractC11870e == null || abstractC11870e == c18073e) ? false : true;
        }
        if (m869finally(c17619e, 4L)) {
            c1506e.ad.f34499e = c17619e.f34499e;
        }
        if (m869finally(c17619e, 6149L)) {
            m866e(c1506e, true, c1506e.ad.f34506e);
        }
        if (m869finally(c17619e, 2L)) {
            c1506e.ad.f34505e = c17619e.f34505e;
        }
        if (m869finally(c17619e, 8L)) {
            c1506e.ad.f34523e = c17619e.f34523e;
            AbstractC11870e abstractC11870e2 = c17619e.f34523e;
            c1506e.metrica = (abstractC11870e2 == null || abstractC11870e2 == c18073e) ? false : true;
        }
        if (m869finally(c17619e, 16L)) {
            c1506e.ad.f34495e = c17619e.f34495e;
        }
        if (m869finally(c17619e, 6168L)) {
            m866e(c1506e, false, c1506e.ad.f34523e);
        }
        if (m869finally(c17619e, 34359738368L)) {
            c1506e.ad.f34529e = c17619e.f34529e;
        }
        if (m869finally(c17619e, 32L)) {
            C17619e c17619e2 = c1506e.ad;
            C17102e c17102e = c17619e.f34532e;
            c17619e2.f34532e = c17102e;
            c1506e.appmetrica.setStrokeWidth(c17102e.ad(this));
        }
        if (m869finally(c17619e, 64L)) {
            C17619e c17619e3 = c1506e.ad;
            Paint paint = c1506e.appmetrica;
            c17619e3.f34518e = c17619e.f34518e;
            int m2467class = AbstractC8703e.m2467class(c17619e.f34518e);
            if (m2467class == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (m2467class == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (m2467class == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m869finally(c17619e, 128L)) {
            C17619e c17619e4 = c1506e.ad;
            Paint paint2 = c1506e.appmetrica;
            c17619e4.f34504e = c17619e.f34504e;
            int m2467class2 = AbstractC8703e.m2467class(c17619e.f34504e);
            if (m2467class2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (m2467class2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (m2467class2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m869finally(c17619e, 256L)) {
            c1506e.ad.f34531e = c17619e.f34531e;
            c1506e.appmetrica.setStrokeMiter(c17619e.f34531e.floatValue());
        }
        if (m869finally(c17619e, 512L)) {
            c1506e.ad.f34512e = c17619e.f34512e;
        }
        if (m869finally(c17619e, 1024L)) {
            c1506e.ad.f34525e = c17619e.f34525e;
        }
        Typeface typeface = null;
        if (m869finally(c17619e, 1536L)) {
            C17619e c17619e5 = c1506e.ad;
            Paint paint3 = c1506e.appmetrica;
            C17102e[] c17102eArr = c17619e5.f34512e;
            if (c17102eArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c17102eArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float ad = c17619e5.f34512e[i2 % length].ad(this);
                    fArr[i2] = ad;
                    f += ad;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float ad2 = c17619e5.f34525e.ad(this);
                    if (ad2 < 0.0f) {
                        ad2 = (ad2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, ad2));
                }
            }
        }
        if (m869finally(c17619e, 16384L)) {
            float textSize = ((C1506e) this.f6385e).license.getTextSize();
            c1506e.ad.f34497e = c17619e.f34497e;
            c1506e.license.setTextSize(c17619e.f34497e.vip(this, textSize));
            c1506e.appmetrica.setTextSize(c17619e.f34497e.vip(this, textSize));
        }
        if (m869finally(c17619e, 8192L)) {
            c1506e.ad.f34498e = c17619e.f34498e;
        }
        if (m869finally(c17619e, 32768L)) {
            if (c17619e.f34502e.intValue() == -1 && c1506e.ad.f34502e.intValue() > 100) {
                C17619e c17619e6 = c1506e.ad;
                c17619e6.f34502e = Integer.valueOf(c17619e6.f34502e.intValue() - 100);
            } else if (c17619e.f34502e.intValue() != 1 || c1506e.ad.f34502e.intValue() >= 900) {
                c1506e.ad.f34502e = c17619e.f34502e;
            } else {
                C17619e c17619e7 = c1506e.ad;
                c17619e7.f34502e = Integer.valueOf(c17619e7.f34502e.intValue() + 100);
            }
        }
        if (m869finally(c17619e, 65536L)) {
            c1506e.ad.f34522e = c17619e.f34522e;
        }
        if (m869finally(c17619e, 106496L)) {
            C17619e c17619e8 = c1506e.ad;
            ArrayList arrayList = c17619e8.f34498e;
            if (arrayList != null && ((C0912e) this.f6386e) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typeface = firebase(c17619e8.f34522e, c17619e8.f34502e, (String) it.next());
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = firebase(c17619e8.f34522e, c17619e8.f34502e, "serif");
            }
            c1506e.license.setTypeface(typeface);
            c1506e.appmetrica.setTypeface(typeface);
        }
        if (m869finally(c17619e, 131072L)) {
            C17619e c17619e9 = c1506e.ad;
            Paint paint4 = c1506e.appmetrica;
            Paint paint5 = c1506e.license;
            c17619e9.f34519e = c17619e.f34519e;
            paint5.setStrikeThruText(c17619e.f34519e == 4);
            paint5.setUnderlineText(c17619e.f34519e == 2);
            paint4.setStrikeThruText(c17619e.f34519e == 4);
            paint4.setUnderlineText(c17619e.f34519e == 2);
        }
        if (m869finally(c17619e, 68719476736L)) {
            c1506e.ad.f34509e = c17619e.f34509e;
        }
        if (m869finally(c17619e, 262144L)) {
            c1506e.ad.f34527e = c17619e.f34527e;
        }
        if (m869finally(c17619e, 524288L)) {
            c1506e.ad.f34508e = c17619e.f34508e;
        }
        if (m869finally(c17619e, 2097152L)) {
            c1506e.ad.f34507e = c17619e.f34507e;
        }
        if (m869finally(c17619e, 4194304L)) {
            c1506e.ad.f34503e = c17619e.f34503e;
        }
        if (m869finally(c17619e, 8388608L)) {
            c1506e.ad.f34521e = c17619e.f34521e;
        }
        if (m869finally(c17619e, 16777216L)) {
            c1506e.ad.f34533e = c17619e.f34533e;
        }
        if (m869finally(c17619e, 33554432L)) {
            c1506e.ad.f34501e = c17619e.f34501e;
        }
        if (m869finally(c17619e, 1048576L)) {
            c1506e.ad.f34510e = c17619e.f34510e;
        }
        if (m869finally(c17619e, 268435456L)) {
            c1506e.ad.f34526e = c17619e.f34526e;
        }
        if (m869finally(c17619e, 536870912L)) {
            c1506e.ad.f34530e = c17619e.f34530e;
        }
        if (m869finally(c17619e, 1073741824L)) {
            c1506e.ad.f34516e = c17619e.f34516e;
        }
        if (m869finally(c17619e, 67108864L)) {
            c1506e.ad.f34517e = c17619e.f34517e;
        }
        if (m869finally(c17619e, 134217728L)) {
            c1506e.ad.f34524e = c17619e.f34524e;
        }
        if (m869finally(c17619e, 8589934592L)) {
            c1506e.ad.f34520e = c17619e.f34520e;
        }
        if (m869finally(c17619e, 17179869184L)) {
            c1506e.ad.f34511e = c17619e.f34511e;
        }
        if (m869finally(c17619e, 137438953472L)) {
            c1506e.ad.f34496e = c17619e.f34496e;
        }
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public void m888e(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C11980e c11980e = ((C1506e) this.f6385e).ad.f34510e;
        if (c11980e != null) {
            f += ((C17102e) c11980e.f23948e).license(this);
            f2 += ((C17102e) ((C1506e) this.f6385e).ad.f34510e.f23950e).appmetrica(this);
            f5 -= ((C17102e) ((C1506e) this.f6385e).ad.f34510e.f23949e).license(this);
            f6 -= ((C17102e) ((C1506e) this.f6385e).ad.f34510e.f23951e).appmetrica(this);
        }
        ((Canvas) this.f6388e).clipRect(f, f2, f5, f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((defpackage.C1506e) r12.f6385e).ad.f34508e.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        m888e(r1, r2, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        r4.reset();
        r4.preScale(r7, r6);
        r0.concat(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m889e(defpackage.C6332e r13, defpackage.C6761e r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.m889e(eؙُۢ, eؘؙۤ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path m890e(defpackage.C5477e r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.m890e(eؘؘۨ):android.graphics.Path");
    }

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public void m891e(String str) {
        SparseArray sparseArray = (SparseArray) this.f6386e;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f6387e;
        HashMap hashMap = (HashMap) this.f6388e;
        C15514e c15514e = (C15514e) hashMap.get(str);
        if (c15514e != null && c15514e.metrica.isEmpty() && c15514e.license.isEmpty()) {
            hashMap.remove(str);
            int i = c15514e.ad;
            boolean z = sparseBooleanArray.get(i);
            ((InterfaceC14610e) this.f6384e).billing(c15514e, z);
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.f6385e).put(i, true);
            }
        }
    }

    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public void m892e(AbstractC6690e abstractC6690e) {
        Csuper ad = AbstractC8507e.ad();
        if (((AbstractC17475e) this.f6386e).isEmpty()) {
            admob(ad, (C18208e) this.f6384e, abstractC6690e);
            if (!Objects.equals((C18208e) this.f6389e, (C18208e) this.f6384e)) {
                admob(ad, (C18208e) this.f6389e, abstractC6690e);
            }
            if (!Objects.equals((C18208e) this.f6387e, (C18208e) this.f6384e) && !Objects.equals((C18208e) this.f6387e, (C18208e) this.f6389e)) {
                admob(ad, (C18208e) this.f6387e, abstractC6690e);
            }
        } else {
            for (int i = 0; i < ((AbstractC17475e) this.f6386e).size(); i++) {
                admob(ad, (C18208e) ((AbstractC17475e) this.f6386e).get(i), abstractC6690e);
            }
            if (!((AbstractC17475e) this.f6386e).contains((C18208e) this.f6387e)) {
                admob(ad, (C18208e) this.f6387e, abstractC6690e);
            }
        }
        this.f6385e = ad.mopub(true);
    }

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public void m893e(C2359e c2359e) {
        Canvas canvas = (Canvas) this.f6388e;
        if (((C1506e) this.f6385e).ad.f34516e != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C10124e c10124e = (C10124e) ((C0912e) this.f6386e).loadAd(((C1506e) this.f6385e).ad.f34516e);
            m899e(c10124e, c2359e);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m899e(c10124e, c2359e);
            canvas.restore();
            canvas.restore();
        }
        m903e();
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public void m894e(C5550e c5550e, C2359e c2359e, C2359e c2359e2, C9213e c9213e) {
        Canvas canvas = (Canvas) this.f6388e;
        if (c2359e.license == 0.0f || c2359e.appmetrica == 0.0f) {
            return;
        }
        if (c9213e == null && (c9213e = c5550e.amazon) == null) {
            c9213e = C9213e.license;
        }
        m908e((C1506e) this.f6385e, c5550e);
        if (m884extends()) {
            C1506e c1506e = (C1506e) this.f6385e;
            c1506e.purchase = c2359e;
            if (!c1506e.ad.f34508e.booleanValue()) {
                C2359e c2359e3 = ((C1506e) this.f6385e).purchase;
                m888e(c2359e3.vip, c2359e3.metrica, c2359e3.license, c2359e3.appmetrica);
            }
            subs(c5550e, ((C1506e) this.f6385e).purchase);
            if (c2359e2 != null) {
                canvas.concat(premium(((C1506e) this.f6385e).purchase, c2359e2, c9213e));
                ((C1506e) this.f6385e).billing = c5550e.loadAd;
            } else {
                C2359e c2359e4 = ((C1506e) this.f6385e).purchase;
                canvas.translate(c2359e4.vip, c2359e4.metrica);
            }
            boolean m915e = m915e();
            m919e();
            m912e(c5550e, true);
            if (m915e) {
                m893e(c5550e.yandex);
            }
            m914e(c5550e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public void m895e(AbstractC16408e abstractC16408e) {
        C17102e c17102e;
        String str;
        int indexOf;
        Set ad;
        C17102e c17102e2;
        Boolean bool;
        if (abstractC16408e instanceof InterfaceC0949e) {
            return;
        }
        m911e();
        if ((abstractC16408e instanceof AbstractC14697e) && (bool = ((AbstractC14697e) abstractC16408e).license) != null) {
            ((C1506e) this.f6385e).yandex = bool.booleanValue();
        }
        if (abstractC16408e instanceof C5550e) {
            C5550e c5550e = (C5550e) abstractC16408e;
            m894e(c5550e, m886e(c5550e.Signature, c5550e.admob, c5550e.subscription, c5550e.remoteconfig), c5550e.loadAd, c5550e.amazon);
        } else {
            Bitmap bitmap = null;
            if (abstractC16408e instanceof C14523e) {
                C14523e c14523e = (C14523e) abstractC16408e;
                Canvas canvas = (Canvas) this.f6388e;
                C17102e c17102e3 = c14523e.subscription;
                if ((c17102e3 == null || !c17102e3.billing()) && ((c17102e2 = c14523e.remoteconfig) == null || !c17102e2.billing())) {
                    m908e((C1506e) this.f6385e, c14523e);
                    if (m884extends()) {
                        AbstractC16408e loadAd = c14523e.ad.loadAd(c14523e.loadAd);
                        if (loadAd == null) {
                            m873protected("Use reference '%s' not found", c14523e.loadAd);
                        } else {
                            Matrix matrix = c14523e.amazon;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C17102e c17102e4 = c14523e.Signature;
                            float license = c17102e4 != null ? c17102e4.license(this) : 0.0f;
                            C17102e c17102e5 = c14523e.admob;
                            canvas.translate(license, c17102e5 != null ? c17102e5.appmetrica(this) : 0.0f);
                            subs(c14523e, c14523e.yandex);
                            boolean m915e = m915e();
                            ((Stack) this.f6384e).push(c14523e);
                            ((Stack) this.f6389e).push(((Canvas) this.f6388e).getMatrix());
                            if (loadAd instanceof C5550e) {
                                C5550e c5550e2 = (C5550e) loadAd;
                                C2359e m886e = m886e(null, null, c14523e.subscription, c14523e.remoteconfig);
                                m911e();
                                m894e(c5550e2, m886e, c5550e2.loadAd, c5550e2.amazon);
                                m903e();
                            } else if (loadAd instanceof C0703e) {
                                C17102e c17102e6 = c14523e.subscription;
                                if (c17102e6 == null) {
                                    c17102e6 = new C17102e(9, 100.0f);
                                }
                                C17102e c17102e7 = c14523e.remoteconfig;
                                if (c17102e7 == null) {
                                    c17102e7 = new C17102e(9, 100.0f);
                                }
                                C2359e m886e2 = m886e(null, null, c17102e6, c17102e7);
                                m911e();
                                C0703e c0703e = (C0703e) loadAd;
                                if (m886e2.license != 0.0f && m886e2.appmetrica != 0.0f) {
                                    C9213e c9213e = c0703e.amazon;
                                    if (c9213e == null) {
                                        c9213e = C9213e.license;
                                    }
                                    m908e((C1506e) this.f6385e, c0703e);
                                    C1506e c1506e = (C1506e) this.f6385e;
                                    c1506e.purchase = m886e2;
                                    if (!c1506e.ad.f34508e.booleanValue()) {
                                        C2359e c2359e = ((C1506e) this.f6385e).purchase;
                                        m888e(c2359e.vip, c2359e.metrica, c2359e.license, c2359e.appmetrica);
                                    }
                                    C2359e c2359e2 = c0703e.loadAd;
                                    if (c2359e2 != null) {
                                        canvas.concat(premium(((C1506e) this.f6385e).purchase, c2359e2, c9213e));
                                        ((C1506e) this.f6385e).billing = c0703e.loadAd;
                                    } else {
                                        C2359e c2359e3 = ((C1506e) this.f6385e).purchase;
                                        canvas.translate(c2359e3.vip, c2359e3.metrica);
                                    }
                                    boolean m915e2 = m915e();
                                    m912e(c0703e, true);
                                    if (m915e2) {
                                        m893e(c0703e.yandex);
                                    }
                                    m914e(c0703e);
                                }
                                m903e();
                            } else {
                                m895e(loadAd);
                            }
                            ((Stack) this.f6384e).pop();
                            ((Stack) this.f6389e).pop();
                            if (m915e) {
                                m893e(c14523e.yandex);
                            }
                            m914e(c14523e);
                        }
                    }
                }
            } else if (abstractC16408e instanceof C16264e) {
                C16264e c16264e = (C16264e) abstractC16408e;
                m908e((C1506e) this.f6385e, c16264e);
                if (m884extends()) {
                    Matrix matrix2 = c16264e.amazon;
                    if (matrix2 != null) {
                        ((Canvas) this.f6388e).concat(matrix2);
                    }
                    subs(c16264e, c16264e.yandex);
                    boolean m915e3 = m915e();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = c16264e.startapp.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC16408e abstractC16408e2 = (AbstractC16408e) it.next();
                        if (abstractC16408e2 instanceof InterfaceC6472e) {
                            InterfaceC6472e interfaceC6472e = (InterfaceC6472e) abstractC16408e2;
                            if (interfaceC6472e.vip() == null && ((ad = interfaceC6472e.ad()) == null || (!ad.isEmpty() && ad.contains(language)))) {
                                Set purchase = interfaceC6472e.purchase();
                                if (purchase != null) {
                                    if (f6383e == null) {
                                        synchronized (C2532e.class) {
                                            HashSet hashSet = new HashSet();
                                            f6383e = hashSet;
                                            hashSet.add("Structure");
                                            f6383e.add("BasicStructure");
                                            f6383e.add("ConditionalProcessing");
                                            f6383e.add("Image");
                                            f6383e.add("Style");
                                            f6383e.add("ViewportAttribute");
                                            f6383e.add("Shape");
                                            f6383e.add("BasicText");
                                            f6383e.add("PaintAttribute");
                                            f6383e.add("BasicPaintAttribute");
                                            f6383e.add("OpacityAttribute");
                                            f6383e.add("BasicGraphicsAttribute");
                                            f6383e.add("Marker");
                                            f6383e.add("Gradient");
                                            f6383e.add("Pattern");
                                            f6383e.add("Clip");
                                            f6383e.add("BasicClip");
                                            f6383e.add("Mask");
                                            f6383e.add("View");
                                        }
                                    }
                                    if (!purchase.isEmpty() && f6383e.containsAll(purchase)) {
                                    }
                                }
                                Set advert = interfaceC6472e.advert();
                                if (advert == null) {
                                    Set smaato = interfaceC6472e.smaato();
                                    if (smaato == null) {
                                        m895e(abstractC16408e2);
                                        break;
                                    }
                                    smaato.isEmpty();
                                } else {
                                    advert.isEmpty();
                                }
                            }
                        }
                    }
                    if (m915e3) {
                        m893e(c16264e.yandex);
                    }
                    m914e(c16264e);
                }
            } else if (abstractC16408e instanceof C8832e) {
                C8832e c8832e = (C8832e) abstractC16408e;
                m908e((C1506e) this.f6385e, c8832e);
                if (m884extends()) {
                    Matrix matrix3 = c8832e.amazon;
                    if (matrix3 != null) {
                        ((Canvas) this.f6388e).concat(matrix3);
                    }
                    subs(c8832e, c8832e.yandex);
                    boolean m915e4 = m915e();
                    m912e(c8832e, true);
                    if (m915e4) {
                        m893e(c8832e.yandex);
                    }
                    m914e(c8832e);
                }
            } else if (abstractC16408e instanceof C18146e) {
                C18146e c18146e = (C18146e) abstractC16408e;
                Canvas canvas2 = (Canvas) this.f6388e;
                C17102e c17102e8 = c18146e.subscription;
                if (c17102e8 != null && !c17102e8.billing() && (c17102e = c18146e.remoteconfig) != null && !c17102e.billing() && (str = c18146e.loadAd) != null) {
                    C9213e c9213e2 = c18146e.amazon;
                    if (c9213e2 == null) {
                        c9213e2 = C9213e.license;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                        try {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } catch (Exception e) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmap != null) {
                        C2359e c2359e4 = new C2359e(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                        m908e((C1506e) this.f6385e, c18146e);
                        if (m884extends() && m898e()) {
                            Matrix matrix4 = c18146e.pro;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C17102e c17102e9 = c18146e.Signature;
                            float license2 = c17102e9 != null ? c17102e9.license(this) : 0.0f;
                            C17102e c17102e10 = c18146e.admob;
                            float appmetrica = c17102e10 != null ? c17102e10.appmetrica(this) : 0.0f;
                            float license3 = c18146e.subscription.license(this);
                            float license4 = c18146e.remoteconfig.license(this);
                            C1506e c1506e2 = (C1506e) this.f6385e;
                            c1506e2.purchase = new C2359e(license2, appmetrica, license3, license4);
                            if (!c1506e2.ad.f34508e.booleanValue()) {
                                C2359e c2359e5 = ((C1506e) this.f6385e).purchase;
                                m888e(c2359e5.vip, c2359e5.metrica, c2359e5.license, c2359e5.appmetrica);
                            }
                            c18146e.yandex = ((C1506e) this.f6385e).purchase;
                            m914e(c18146e);
                            subs(c18146e, c18146e.yandex);
                            boolean m915e5 = m915e();
                            m919e();
                            canvas2.save();
                            canvas2.concat(premium(((C1506e) this.f6385e).purchase, c2359e4, c9213e2));
                            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(((C1506e) this.f6385e).ad.f34496e != 3 ? 2 : 0));
                            canvas2.restore();
                            if (m915e5) {
                                m893e(c18146e.yandex);
                            }
                        }
                    }
                }
            } else if (abstractC16408e instanceof C8754e) {
                C8754e c8754e = (C8754e) abstractC16408e;
                if (c8754e.loadAd != null) {
                    m908e((C1506e) this.f6385e, c8754e);
                    if (m884extends() && m898e()) {
                        C1506e c1506e3 = (C1506e) this.f6385e;
                        if (c1506e3.metrica || c1506e3.vip) {
                            Matrix matrix5 = c8754e.amazon;
                            if (matrix5 != null) {
                                ((Canvas) this.f6388e).concat(matrix5);
                            }
                            Path path = new C0926e(c8754e.loadAd).ad;
                            if (c8754e.yandex == null) {
                                c8754e.yandex = applovin(path);
                            }
                            m914e(c8754e);
                            crashlytics(c8754e);
                            subs(c8754e, c8754e.yandex);
                            boolean m915e6 = m915e();
                            C1506e c1506e4 = (C1506e) this.f6385e;
                            if (c1506e4.vip) {
                                int i = c1506e4.ad.f34505e;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m935throw(c8754e, path);
                            }
                            if (((C1506e) this.f6385e).metrica) {
                                m939while(path);
                            }
                            m906e(c8754e);
                            if (m915e6) {
                                m893e(c8754e.yandex);
                            }
                        }
                    }
                }
            } else if (abstractC16408e instanceof C5477e) {
                C5477e c5477e = (C5477e) abstractC16408e;
                C17102e c17102e11 = c5477e.admob;
                if (c17102e11 != null && c5477e.subscription != null && !c17102e11.billing() && !c5477e.subscription.billing()) {
                    m908e((C1506e) this.f6385e, c5477e);
                    if (m884extends() && m898e()) {
                        Matrix matrix6 = c5477e.amazon;
                        if (matrix6 != null) {
                            ((Canvas) this.f6388e).concat(matrix6);
                        }
                        Path m890e = m890e(c5477e);
                        m914e(c5477e);
                        crashlytics(c5477e);
                        subs(c5477e, c5477e.yandex);
                        boolean m915e7 = m915e();
                        if (((C1506e) this.f6385e).vip) {
                            m935throw(c5477e, m890e);
                        }
                        if (((C1506e) this.f6385e).metrica) {
                            m939while(m890e);
                        }
                        if (m915e7) {
                            m893e(c5477e.yandex);
                        }
                    }
                }
            } else if (abstractC16408e instanceof C15738e) {
                C15738e c15738e = (C15738e) abstractC16408e;
                C17102e c17102e12 = c15738e.admob;
                if (c17102e12 != null && !c17102e12.billing()) {
                    m908e((C1506e) this.f6385e, c15738e);
                    if (m884extends() && m898e()) {
                        Matrix matrix7 = c15738e.amazon;
                        if (matrix7 != null) {
                            ((Canvas) this.f6388e).concat(matrix7);
                        }
                        Path m922e = m922e(c15738e);
                        m914e(c15738e);
                        crashlytics(c15738e);
                        subs(c15738e, c15738e.yandex);
                        boolean m915e8 = m915e();
                        if (((C1506e) this.f6385e).vip) {
                            m935throw(c15738e, m922e);
                        }
                        if (((C1506e) this.f6385e).metrica) {
                            m939while(m922e);
                        }
                        if (m915e8) {
                            m893e(c15738e.yandex);
                        }
                    }
                }
            } else if (abstractC16408e instanceof C3943e) {
                C3943e c3943e = (C3943e) abstractC16408e;
                C17102e c17102e13 = c3943e.admob;
                if (c17102e13 != null && c3943e.subscription != null && !c17102e13.billing() && !c3943e.subscription.billing()) {
                    m908e((C1506e) this.f6385e, c3943e);
                    if (m884extends() && m898e()) {
                        Matrix matrix8 = c3943e.amazon;
                        if (matrix8 != null) {
                            ((Canvas) this.f6388e).concat(matrix8);
                        }
                        Path m900e = m900e(c3943e);
                        m914e(c3943e);
                        crashlytics(c3943e);
                        subs(c3943e, c3943e.yandex);
                        boolean m915e9 = m915e();
                        if (((C1506e) this.f6385e).vip) {
                            m935throw(c3943e, m900e);
                        }
                        if (((C1506e) this.f6385e).metrica) {
                            m939while(m900e);
                        }
                        if (m915e9) {
                            m893e(c3943e.yandex);
                        }
                    }
                }
            } else if (abstractC16408e instanceof C17252e) {
                C17252e c17252e = (C17252e) abstractC16408e;
                m908e((C1506e) this.f6385e, c17252e);
                if (m884extends() && m898e() && ((C1506e) this.f6385e).metrica) {
                    Matrix matrix9 = c17252e.amazon;
                    if (matrix9 != null) {
                        ((Canvas) this.f6388e).concat(matrix9);
                    }
                    C17102e c17102e14 = c17252e.loadAd;
                    float license5 = c17102e14 == null ? 0.0f : c17102e14.license(this);
                    C17102e c17102e15 = c17252e.Signature;
                    float appmetrica2 = c17102e15 == null ? 0.0f : c17102e15.appmetrica(this);
                    C17102e c17102e16 = c17252e.admob;
                    float license6 = c17102e16 == null ? 0.0f : c17102e16.license(this);
                    C17102e c17102e17 = c17252e.subscription;
                    r4 = c17102e17 != null ? c17102e17.appmetrica(this) : 0.0f;
                    if (c17252e.yandex == null) {
                        c17252e.yandex = new C2359e(Math.min(license5, license6), Math.min(appmetrica2, r4), Math.abs(license6 - license5), Math.abs(r4 - appmetrica2));
                    }
                    Path path2 = new Path();
                    path2.moveTo(license5, appmetrica2);
                    path2.lineTo(license6, r4);
                    m914e(c17252e);
                    crashlytics(c17252e);
                    subs(c17252e, c17252e.yandex);
                    boolean m915e10 = m915e();
                    m939while(path2);
                    m906e(c17252e);
                    if (m915e10) {
                        m893e(c17252e.yandex);
                    }
                }
            } else if (abstractC16408e instanceof C6958e) {
                C6958e c6958e = (C6958e) abstractC16408e;
                m908e((C1506e) this.f6385e, c6958e);
                if (m884extends() && m898e()) {
                    C1506e c1506e5 = (C1506e) this.f6385e;
                    if (c1506e5.metrica || c1506e5.vip) {
                        Matrix matrix10 = c6958e.amazon;
                        if (matrix10 != null) {
                            ((Canvas) this.f6388e).concat(matrix10);
                        }
                        if (c6958e.loadAd.length >= 2) {
                            Path m865e = m865e(c6958e);
                            m914e(c6958e);
                            crashlytics(c6958e);
                            subs(c6958e, c6958e.yandex);
                            boolean m915e11 = m915e();
                            if (((C1506e) this.f6385e).vip) {
                                m935throw(c6958e, m865e);
                            }
                            if (((C1506e) this.f6385e).metrica) {
                                m939while(m865e);
                            }
                            m906e(c6958e);
                            if (m915e11) {
                                m893e(c6958e.yandex);
                            }
                        }
                    }
                }
            } else if (abstractC16408e instanceof C18207e) {
                C18207e c18207e = (C18207e) abstractC16408e;
                m908e((C1506e) this.f6385e, c18207e);
                if (m884extends() && m898e()) {
                    C1506e c1506e6 = (C1506e) this.f6385e;
                    if (c1506e6.metrica || c1506e6.vip) {
                        Matrix matrix11 = c18207e.amazon;
                        if (matrix11 != null) {
                            ((Canvas) this.f6388e).concat(matrix11);
                        }
                        if (c18207e.loadAd.length >= 2) {
                            Path m865e2 = m865e(c18207e);
                            m914e(c18207e);
                            int i2 = ((C1506e) this.f6385e).ad.f34505e;
                            m865e2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            crashlytics(c18207e);
                            subs(c18207e, c18207e.yandex);
                            boolean m915e12 = m915e();
                            if (((C1506e) this.f6385e).vip) {
                                m935throw(c18207e, m865e2);
                            }
                            if (((C1506e) this.f6385e).metrica) {
                                m939while(m865e2);
                            }
                            m906e(c18207e);
                            if (m915e12) {
                                m893e(c18207e.yandex);
                            }
                        }
                    }
                }
            } else if (abstractC16408e instanceof C14034e) {
                C14034e c14034e = (C14034e) abstractC16408e;
                m908e((C1506e) this.f6385e, c14034e);
                if (m884extends()) {
                    Matrix matrix12 = c14034e.subscription;
                    if (matrix12 != null) {
                        ((Canvas) this.f6388e).concat(matrix12);
                    }
                    ArrayList arrayList = c14034e.amazon;
                    float license7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C17102e) c14034e.amazon.get(0)).license(this);
                    ArrayList arrayList2 = c14034e.loadAd;
                    float appmetrica3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C17102e) c14034e.loadAd.get(0)).appmetrica(this);
                    ArrayList arrayList3 = c14034e.Signature;
                    float license8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C17102e) c14034e.Signature.get(0)).license(this);
                    ArrayList arrayList4 = c14034e.admob;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        r4 = ((C17102e) c14034e.admob.get(0)).appmetrica(this);
                    }
                    int m936transient = m936transient();
                    if (m936transient != 1) {
                        float ads = ads(c14034e);
                        if (m936transient == 2) {
                            ads /= 2.0f;
                        }
                        license7 -= ads;
                    }
                    if (c14034e.yandex == null) {
                        C12518e c12518e = new C12518e(this, license7, appmetrica3);
                        m937try(c14034e, c12518e);
                        RectF rectF = (RectF) c12518e.purchase;
                        c14034e.yandex = new C2359e(rectF.left, rectF.top, rectF.width(), ((RectF) c12518e.purchase).height());
                    }
                    m914e(c14034e);
                    crashlytics(c14034e);
                    subs(c14034e, c14034e.yandex);
                    boolean m915e13 = m915e();
                    m937try(c14034e, new C1268e(this, license7 + license8, appmetrica3 + r4));
                    if (m915e13) {
                        m893e(c14034e.yandex);
                    }
                }
            }
        }
        m903e();
    }

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public void m896e(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f6386e = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m897e(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.m897e(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public boolean m898e() {
        Boolean bool = ((C1506e) this.f6385e).ad.f34501e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public void m899e(C10124e c10124e, C2359e c2359e) {
        float f;
        float f2;
        Canvas canvas = (Canvas) this.f6388e;
        Boolean bool = c10124e.amazon;
        if (bool == null || !bool.booleanValue()) {
            C17102e c17102e = c10124e.Signature;
            float vip = c17102e != null ? c17102e.vip(this, 1.0f) : 1.2f;
            C17102e c17102e2 = c10124e.admob;
            float vip2 = c17102e2 != null ? c17102e2.vip(this, 1.0f) : 1.2f;
            f = vip * c2359e.license;
            f2 = vip2 * c2359e.appmetrica;
        } else {
            C17102e c17102e3 = c10124e.Signature;
            f = c17102e3 != null ? c17102e3.license(this) : c2359e.license;
            C17102e c17102e4 = c10124e.admob;
            f2 = c17102e4 != null ? c17102e4.appmetrica(this) : c2359e.appmetrica;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        m911e();
        C1506e m927new = m927new(c10124e);
        this.f6385e = m927new;
        m927new.ad.f34500e = Float.valueOf(1.0f);
        boolean m915e = m915e();
        canvas.save();
        Boolean bool2 = c10124e.loadAd;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c2359e.vip, c2359e.metrica);
            canvas.scale(c2359e.license, c2359e.appmetrica);
        }
        m912e(c10124e, false);
        canvas.restore();
        if (m915e) {
            m893e(c2359e);
        }
        m903e();
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public Path m900e(C3943e c3943e) {
        C17102e c17102e = c3943e.loadAd;
        float license = c17102e != null ? c17102e.license(this) : 0.0f;
        C17102e c17102e2 = c3943e.Signature;
        float appmetrica = c17102e2 != null ? c17102e2.appmetrica(this) : 0.0f;
        float license2 = c3943e.admob.license(this);
        float appmetrica2 = c3943e.subscription.appmetrica(this);
        float f = license - license2;
        float f2 = appmetrica - appmetrica2;
        float f3 = license + license2;
        float f4 = appmetrica + appmetrica2;
        if (c3943e.yandex == null) {
            c3943e.yandex = new C2359e(f, f2, license2 * 2.0f, 2.0f * appmetrica2);
        }
        float f5 = license2 * 0.5522848f;
        float f6 = appmetrica2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(license, f2);
        float f7 = license + f5;
        float f8 = appmetrica - f6;
        path.cubicTo(f7, f2, f3, f8, f3, appmetrica);
        float f9 = appmetrica + f6;
        path.cubicTo(f3, f9, f7, f4, license, f4);
        float f10 = license - f5;
        path.cubicTo(f10, f4, f, f9, f, appmetrica);
        path.cubicTo(f, f8, f10, f2, license, f2);
        path.close();
        return path;
    }

    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public void m901e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = AbstractC0481e.ad;
        this.f6384e = str;
    }

    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public Uri m902e() {
        String ads;
        String str = (String) this.f6386e;
        String str2 = (String) this.f6385e;
        Account account = AbstractC8278e.ad;
        Account account2 = (Account) this.f6387e;
        AbstractC4511e.pro(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        AbstractC4511e.pro(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        AbstractC4511e.pro(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (AbstractC8278e.ad.equals(account2)) {
            ads = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            ads = AbstractC8647e.ads(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f6384e;
        StringBuilder sb = new StringBuilder(ads.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        AbstractC13501e.Signature(sb, "/", str, "/", str2);
        String ads2 = AbstractC4653e.ads(sb, "/", ads, "/", str5);
        C1410e billing = ((C13304e) this.f6389e).billing();
        Pattern pattern = AbstractC2620e.ad;
        return new Uri.Builder().scheme("android").authority((String) this.f6388e).path(ads2).encodedFragment(billing.isEmpty() ? null : "transform=".concat(String.valueOf(new C7364e("+").appmetrica(billing)))).build();
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public void m903e() {
        ((Canvas) this.f6388e).restore();
        this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public void m904e(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f6388e = Integer.valueOf(i);
    }

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public Path m905e(AbstractC6547e abstractC6547e, boolean z) {
        Path path;
        Path isPro;
        ((Stack) this.f6387e).push((C1506e) this.f6385e);
        C1506e c1506e = new C1506e((C1506e) this.f6385e);
        this.f6385e = c1506e;
        m908e(c1506e, abstractC6547e);
        if (!m884extends() || !m898e()) {
            this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
            return null;
        }
        if (abstractC6547e instanceof C14523e) {
            if (!z) {
                m873protected("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C14523e c14523e = (C14523e) abstractC6547e;
            AbstractC14697e loadAd = abstractC6547e.ad.loadAd(c14523e.loadAd);
            if (loadAd == null) {
                m873protected("Use reference '%s' not found", c14523e.loadAd);
                this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
                return null;
            }
            if (!(loadAd instanceof AbstractC6547e)) {
                this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
                return null;
            }
            path = m905e((AbstractC6547e) loadAd, false);
            if (path != null) {
                if (c14523e.yandex == null) {
                    c14523e.yandex = applovin(path);
                }
                Matrix matrix = c14523e.amazon;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (((C1506e) this.f6385e).ad.f34526e != null && (isPro = isPro(abstractC6547e, abstractC6547e.yandex)) != null) {
                    path.op(isPro, Path.Op.INTERSECT);
                }
                this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
                return path;
            }
            return null;
        }
        if (abstractC6547e instanceof AbstractC1601e) {
            AbstractC1601e abstractC1601e = (AbstractC1601e) abstractC6547e;
            if (abstractC6547e instanceof C8754e) {
                C0926e c0926e = new C0926e(((C8754e) abstractC6547e).loadAd);
                C2359e c2359e = abstractC6547e.yandex;
                Path path2 = c0926e.ad;
                if (c2359e == null) {
                    abstractC6547e.yandex = applovin(path2);
                }
                path = path2;
            } else {
                path = abstractC6547e instanceof C5477e ? m890e((C5477e) abstractC6547e) : abstractC6547e instanceof C15738e ? m922e((C15738e) abstractC6547e) : abstractC6547e instanceof C3943e ? m900e((C3943e) abstractC6547e) : abstractC6547e instanceof C18207e ? m865e((C18207e) abstractC6547e) : null;
            }
            if (path != null) {
                if (abstractC1601e.yandex == null) {
                    abstractC1601e.yandex = applovin(path);
                }
                Matrix matrix2 = abstractC1601e.amazon;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(m924instanceof());
            }
            return null;
        }
        if (!(abstractC6547e instanceof C14034e)) {
            m873protected("Invalid %s element found in clipPath definition", abstractC6547e.amazon());
            return null;
        }
        C14034e c14034e = (C14034e) abstractC6547e;
        ArrayList arrayList = c14034e.amazon;
        float f = 0.0f;
        float license = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C17102e) c14034e.amazon.get(0)).license(this);
        ArrayList arrayList2 = c14034e.loadAd;
        float appmetrica = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C17102e) c14034e.loadAd.get(0)).appmetrica(this);
        ArrayList arrayList3 = c14034e.Signature;
        float license2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C17102e) c14034e.Signature.get(0)).license(this);
        ArrayList arrayList4 = c14034e.admob;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((C17102e) c14034e.admob.get(0)).appmetrica(this);
        }
        if (((C1506e) this.f6385e).ad.f34527e != 1) {
            float ads = ads(c14034e);
            if (((C1506e) this.f6385e).ad.f34527e == 2) {
                ads /= 2.0f;
            }
            license -= ads;
        }
        if (c14034e.yandex == null) {
            C12518e c12518e = new C12518e(this, license, appmetrica);
            m937try(c14034e, c12518e);
            Object obj = c12518e.purchase;
            RectF rectF = (RectF) obj;
            c14034e.yandex = new C2359e(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
        }
        Path path3 = new Path();
        m937try(c14034e, new C12518e(this, license + license2, appmetrica + f, path3));
        Matrix matrix3 = c14034e.subscription;
        if (matrix3 != null) {
            path3.transform(matrix3);
        }
        path3.setFillType(m924instanceof());
        path = path3;
        if (((C1506e) this.f6385e).ad.f34526e != null) {
            path.op(isPro, Path.Op.INTERSECT);
        }
        this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009b  */
    /* renamed from: eِؗؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m906e(defpackage.AbstractC1601e r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.m906e(eؓؕۧ):void");
    }

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public void m907e() {
        ((InterfaceC14610e) this.f6384e).advert((HashMap) this.f6388e);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f6385e;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.f6386e).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f6387e).clear();
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public void m908e(C1506e c1506e, AbstractC14697e abstractC14697e) {
        boolean z = abstractC14697e.vip == null;
        C17619e c17619e = c1506e.ad;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c17619e.f34533e = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c17619e.f34508e = bool;
        c17619e.f34510e = null;
        c17619e.f34526e = null;
        c17619e.f34500e = valueOf;
        c17619e.f34517e = C18073e.f35445e;
        c17619e.f34524e = valueOf;
        c17619e.f34516e = null;
        c17619e.f34513e = null;
        c17619e.f34514e = valueOf;
        c17619e.f34520e = null;
        c17619e.f34511e = valueOf;
        c17619e.f34529e = 1;
        C17619e c17619e2 = abstractC14697e.appmetrica;
        if (c17619e2 != null) {
            m887e(c1506e, c17619e2);
        }
        ArrayList arrayList = ((C1720e) ((C0912e) this.f6386e).f3331e).vip;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((C1720e) ((C0912e) this.f6386e).f3331e).vip.iterator();
            while (it.hasNext()) {
                C0831e c0831e = (C0831e) it.next();
                if (crashlytics.m194this(c0831e.ad, abstractC14697e)) {
                    m887e(c1506e, c0831e.vip);
                }
            }
        }
        C17619e c17619e3 = abstractC14697e.purchase;
        if (c17619e3 != null) {
            m887e(c1506e, c17619e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [eؚؑ۟, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    /* renamed from: eًْٕ, reason: contains not printable characters */
    public AbstractC0586e m909e() {
        AtomicLong atomicLong;
        long j;
        final int i;
        C5441e c5441e;
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        C0485e c0485e = (C0485e) this.f6389e;
        if (c0485e.isDone()) {
            return c0485e;
        }
        do {
            atomicLong = (AtomicLong) this.f6386e;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & 4294967295L) | (i << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f6387e;
        ?? obj = new Object();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(obj);
        if (listenableFuture == null) {
            C7302e ad = AbstractC9855e.ad(new C13572e(this, i, 25));
            ?? obj2 = new Object();
            obj2.f19447e = new C1066e((RunnableFutureC9859e) obj2, ad);
            enumC3320e.execute(obj2);
            c5441e = obj2;
        } else {
            c5441e = AbstractC2017e.ad(listenableFuture, Throwable.class, AbstractC9855e.vip(new InterfaceC18244e() { // from class: eؘٛۦ
                @Override // defpackage.InterfaceC18244e
                public final /* synthetic */ ListenableFuture apply(Object obj3) {
                    return C2532e.this.m913e(i);
                }
            }), (ExecutorC12022e) this.f6384e);
        }
        obj.loadAd(c5441e);
        C9903e c9903e = new C9903e(this, i);
        obj.ad(new RunnableC11666e(23, this, (Object) obj, c9903e), enumC3320e);
        return c9903e;
    }

    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public String m910e(String str, boolean z, boolean z2) {
        if (((C1506e) this.f6385e).yandex) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", BuildConfig.FLAVOR).replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", BuildConfig.FLAVOR);
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", BuildConfig.FLAVOR);
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public void m911e() {
        ((Canvas) this.f6388e).save();
        ((Stack) this.f6387e).push((C1506e) this.f6385e);
        this.f6385e = new C1506e((C1506e) this.f6385e);
    }

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public void m912e(AbstractC18098e abstractC18098e, boolean z) {
        if (z) {
            ((Stack) this.f6384e).push(abstractC18098e);
            ((Stack) this.f6389e).push(((Canvas) this.f6388e).getMatrix());
        }
        Iterator it = abstractC18098e.startapp.iterator();
        while (it.hasNext()) {
            m895e((AbstractC16408e) it.next());
        }
        if (z) {
            ((Stack) this.f6384e).pop();
            ((Stack) this.f6389e).pop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    /* renamed from: eٔؖۘ, reason: contains not printable characters */
    public AbstractC0586e m913e(int i) {
        EnumC3320e enumC3320e;
        AtomicLong atomicLong = (AtomicLong) this.f6386e;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            C9845e c9845e = C9845e.f19435e;
            return c9845e != null ? c9845e : new C9845e();
        }
        C3357e c3357e = new C3357e(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f6385e;
            C3357e c3357e2 = (C3357e) atomicReference.get();
            if (c3357e2 != null && c3357e2.f7564e > i) {
                C9845e c9845e2 = C9845e.f19435e;
                return c9845e2 != null ? c9845e2 : new C9845e();
            }
            while (!atomicReference.compareAndSet(c3357e2, c3357e)) {
                if (atomicReference.get() != c3357e2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i) {
                c3357e.cancel(true);
                while (!atomicReference.compareAndSet(c3357e, null) && atomicReference.get() == c3357e) {
                }
                return c3357e;
            }
            RunnableC12554e runnableC12554e = (RunnableC12554e) this.f6388e;
            InterfaceC0987e interfaceC0987e = (InterfaceC0987e) runnableC12554e.f25148e;
            if (interfaceC0987e == null || (enumC3320e = (EnumC3320e) runnableC12554e.f25147e) == 0) {
                c3357e.loadAd((C0485e) this.f6389e);
                return c3357e;
            }
            C7302e ad = AbstractC9855e.ad(interfaceC0987e);
            ?? obj = new Object();
            obj.f19447e = new C1066e((RunnableFutureC9859e) obj, ad);
            enumC3320e.execute(obj);
            c3357e.loadAd(obj);
            return c3357e;
        }
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public void m914e(AbstractC6547e abstractC6547e) {
        if (abstractC6547e.vip == null || abstractC6547e.yandex == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f6389e).peek()).invert(matrix)) {
            C2359e c2359e = abstractC6547e.yandex;
            float f = c2359e.vip;
            float f2 = c2359e.metrica;
            float metrica = c2359e.metrica();
            C2359e c2359e2 = abstractC6547e.yandex;
            float f3 = c2359e2.metrica;
            float metrica2 = c2359e2.metrica();
            float license = abstractC6547e.yandex.license();
            C2359e c2359e3 = abstractC6547e.yandex;
            float[] fArr = {f, f2, metrica, f3, metrica2, license, c2359e3.vip, c2359e3.license()};
            matrix.preConcat(((Canvas) this.f6388e).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            AbstractC6547e abstractC6547e2 = (AbstractC6547e) ((Stack) this.f6384e).peek();
            C2359e c2359e4 = abstractC6547e2.yandex;
            if (c2359e4 == null) {
                float f8 = rectF.left;
                float f9 = rectF.top;
                abstractC6547e2.yandex = new C2359e(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.left;
            float f11 = rectF.top;
            float f12 = rectF.right - f10;
            float f13 = rectF.bottom - f11;
            if (f10 < c2359e4.vip) {
                c2359e4.vip = f10;
            }
            if (f11 < c2359e4.metrica) {
                c2359e4.metrica = f11;
            }
            if (f10 + f12 > c2359e4.metrica()) {
                c2359e4.license = (f10 + f12) - c2359e4.vip;
            }
            if (f11 + f13 > c2359e4.license()) {
                c2359e4.appmetrica = (f11 + f13) - c2359e4.metrica;
            }
        }
    }

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public boolean m915e() {
        AbstractC14697e loadAd;
        if (((C1506e) this.f6385e).ad.f34500e.floatValue() >= 1.0f && ((C1506e) this.f6385e).ad.f34516e == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f6388e;
        int floatValue = (int) (((C1506e) this.f6385e).ad.f34500e.floatValue() * 256.0f);
        if (floatValue < 0) {
            floatValue = 0;
        } else if (floatValue > 255) {
            floatValue = 255;
        }
        canvas.saveLayerAlpha(null, floatValue, 31);
        ((Stack) this.f6387e).push((C1506e) this.f6385e);
        C1506e c1506e = new C1506e((C1506e) this.f6385e);
        this.f6385e = c1506e;
        String str = c1506e.ad.f34516e;
        if (str != null && ((loadAd = ((C0912e) this.f6386e).loadAd(str)) == null || !(loadAd instanceof C10124e))) {
            m873protected("Mask reference '%s' not found", ((C1506e) this.f6385e).ad.f34516e);
            ((C1506e) this.f6385e).ad.f34516e = null;
        }
        return true;
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public void m916e(AbstractC12699e abstractC12699e) {
        if (C3953e.billing.contains(abstractC12699e)) {
            this.f6387e = abstractC12699e;
            return;
        }
        throw new GeneralSecurityException("Invalid DEM parameters " + abstractC12699e + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
    }

    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public void m917e(String str) {
        AbstractC4511e.pro(AbstractC0481e.ad.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        AbstractC4511e.pro(!AbstractC0481e.metrica.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f6385e = str;
    }

    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public void m918e(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f6387e = Integer.valueOf(i);
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public void m919e() {
        int i;
        C17619e c17619e = ((C1506e) this.f6385e).ad;
        AbstractC11870e abstractC11870e = c17619e.f34520e;
        if (abstractC11870e instanceof C18073e) {
            i = ((C18073e) abstractC11870e).f35446e;
        } else if (!(abstractC11870e instanceof C2833e)) {
            return;
        } else {
            i = c17619e.f34515e.f35446e;
        }
        Float f = c17619e.f34511e;
        if (f != null) {
            i = m863class(i, f.floatValue());
        }
        ((Canvas) this.f6388e).drawColor(i);
    }

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public void m920e() {
        try {
            C13197e c13197e = new C13197e(m881const());
            try {
                C0193e isPro = c13197e.isPro(c13197e.readInt());
                C0193e isPro2 = c13197e.isPro(c13197e.readInt());
                Unit unit = Unit.INSTANCE;
                c13197e.close();
                synchronized (this) {
                    this.f6385e = isPro;
                    this.f6387e = isPro2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f6386e).countDown();
        }
    }

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public void m921e(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f6385e = Integer.valueOf(i);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public Path m922e(C15738e c15738e) {
        C17102e c17102e = c15738e.loadAd;
        float license = c17102e != null ? c17102e.license(this) : 0.0f;
        C17102e c17102e2 = c15738e.Signature;
        float appmetrica = c17102e2 != null ? c17102e2.appmetrica(this) : 0.0f;
        float ad = c15738e.admob.ad(this);
        float f = license - ad;
        float f2 = appmetrica - ad;
        float f3 = license + ad;
        float f4 = appmetrica + ad;
        if (c15738e.yandex == null) {
            float f5 = 2.0f * ad;
            c15738e.yandex = new C2359e(f, f2, f5, f5);
        }
        float f6 = ad * 0.5522848f;
        Path path = new Path();
        path.moveTo(license, f2);
        float f7 = license + f6;
        float f8 = appmetrica - f6;
        path.cubicTo(f7, f2, f3, f8, f3, appmetrica);
        float f9 = appmetrica + f6;
        path.cubicTo(f3, f9, f7, f4, license, f4);
        float f10 = license - f6;
        path.cubicTo(f10, f4, f, f9, f, appmetrica);
        path.cubicTo(f, f8, f10, f2, license, f2);
        path.close();
        return path;
    }

    /* renamed from: for, reason: not valid java name */
    public Object m923for(AbstractC7919e abstractC7919e, C17485e c17485e, int i, AbstractC1186e abstractC1186e, Function2 function2) {
        Object invoke;
        C6798e purchase = AbstractC12547e.purchase(abstractC7919e, true, true, AbstractC1787e.premium.appmetrica(c17485e.f34273e), C13814e.license(c17485e), (C7850e) this.f6388e, (C16308e) this.f6389e);
        if (purchase == null) {
            if (abstractC7919e instanceof C15447e) {
                InterfaceC3054e interfaceC3054e = (InterfaceC3054e) ((C15447e) abstractC7919e).f16036e;
                C16835e c16835e = interfaceC3054e instanceof C16835e ? (C16835e) interfaceC3054e : null;
                if (c16835e != null) {
                    purchase = c16835e.f32984e;
                }
            }
            purchase = null;
        }
        if (purchase != null) {
            C16308e c16308e = (C16308e) purchase.vip.license;
            C16308e c16308e2 = C3749e.appmetrica;
            C17613e m872import = m872import(c17485e, (InterfaceC11824e) abstractC7919e.f16035e, (C17221e) abstractC7919e.f16034e, i, c16308e.ad(c16308e2.vip, c16308e2.metrica, c16308e2.license));
            if (m872import != null && (invoke = function2.invoke(((C1159e) this.f6386e).invoke(purchase), m872import)) != null) {
                if (AbstractC8825e.ad(abstractC1186e)) {
                    invoke = (AbstractC13656e) invoke;
                    if (invoke instanceof C10037e) {
                        return new C12207e(((Number) ((C10037e) invoke).ad).byteValue());
                    }
                    if (invoke instanceof C12062e) {
                        return new C12207e(((Number) ((C12062e) invoke).ad).shortValue());
                    }
                    if (invoke instanceof C2144e) {
                        return new C12207e(((Number) ((C2144e) invoke).ad).intValue());
                    }
                    if (invoke instanceof C5065e) {
                        return new C12207e(((Number) ((C5065e) invoke).ad).longValue());
                    }
                }
                return invoke;
            }
        }
        return null;
    }

    public C3953e inmobi() {
        C16149e c16149e = (C16149e) this.f6388e;
        if (c16149e == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (((C1906e) this.f6386e) == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (((AbstractC12699e) this.f6387e) == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (((C10607e) this.f6384e) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        C16149e c16149e2 = C16149e.appmetrica;
        if (c16149e != c16149e2 && ((C13194e) this.f6385e) == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (c16149e != c16149e2 || ((C13194e) this.f6385e) == null) {
            return new C3953e((C16149e) this.f6388e, (C1906e) this.f6386e, (C13194e) this.f6385e, (AbstractC12699e) this.f6387e, (C10607e) this.f6384e, (C15768e) this.f6389e);
        }
        throw new GeneralSecurityException("For Curve25519 point format must not be set");
    }

    /* renamed from: instanceof, reason: not valid java name */
    public Path.FillType m924instanceof() {
        int i = ((C1506e) this.f6385e).ad.f34530e;
        return (i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: interface, reason: not valid java name */
    public synchronized byte[] m925interface() {
        byte[] billing;
        byte[] bArr = (byte[]) this.f6387e;
        BigInteger bigInteger = (BigInteger) this.f6389e;
        ((InterfaceC17063e) this.f6388e).getClass();
        billing = AbstractC7640e.billing(bArr, AbstractC7354e.purchase(12, bigInteger));
        if (((BigInteger) this.f6389e).compareTo((BigInteger) this.f6386e) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f6389e = ((BigInteger) this.f6389e).add(BigInteger.ONE);
        return billing;
    }

    public Path isPro(AbstractC6547e abstractC6547e, C2359e c2359e) {
        Path m905e;
        AbstractC14697e loadAd = abstractC6547e.ad.loadAd(((C1506e) this.f6385e).ad.f34526e);
        if (loadAd == null) {
            m873protected("ClipPath reference '%s' not found", ((C1506e) this.f6385e).ad.f34526e);
            return null;
        }
        C5587e c5587e = (C5587e) loadAd;
        ((Stack) this.f6387e).push((C1506e) this.f6385e);
        this.f6385e = m927new(c5587e);
        Boolean bool = c5587e.loadAd;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c2359e.vip, c2359e.metrica);
            matrix.preScale(c2359e.license, c2359e.appmetrica);
        }
        Matrix matrix2 = c5587e.amazon;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (AbstractC16408e abstractC16408e : c5587e.startapp) {
            if ((abstractC16408e instanceof AbstractC6547e) && (m905e = m905e((AbstractC6547e) abstractC16408e, true)) != null) {
                path.op(m905e, Path.Op.UNION);
            }
        }
        if (((C1506e) this.f6385e).ad.f34526e != null) {
            if (c5587e.yandex == null) {
                c5587e.yandex = applovin(path);
            }
            Path isPro = isPro(c5587e, c5587e.yandex);
            if (isPro != null) {
                path.op(isPro, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f6385e = (C1506e) ((Stack) this.f6387e).pop();
        return path;
    }

    public C11897e isVip() {
        if (((Integer) this.f6388e) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f6386e) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f6385e) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f6387e;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C6325e) this.f6384e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((C15400e) this.f6389e) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        C6325e c6325e = (C6325e) this.f6384e;
        if (c6325e == C6325e.f13166e) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c6325e == C6325e.f13163e) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c6325e == C6325e.f13169e) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c6325e == C6325e.f13168e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c6325e != C6325e.f13165e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C11897e(((Integer) this.f6388e).intValue(), ((Integer) this.f6386e).intValue(), ((Integer) this.f6385e).intValue(), ((Integer) this.f6387e).intValue(), (C15400e) this.f6389e, (C6325e) this.f6384e);
    }

    @Override // defpackage.InterfaceC1363e
    public void metrica(InterfaceC4082e interfaceC4082e) {
        C11519e c11519e = C11519e.f23146e;
        Activity activity = (Activity) this.f6388e;
        String str = (String) this.f6386e;
        String str2 = (String) this.f6385e;
        c11519e.getClass();
        C11519e.ad(activity, str, str2, null);
    }

    @Override // defpackage.InterfaceC17564e
    public List mopub(AbstractC7919e abstractC7919e, C17485e c17485e) {
        return m930public(abstractC7919e, c17485e, 2);
    }

    /* renamed from: native, reason: not valid java name */
    public void m926native(boolean z, C2359e c2359e, C7912e c7912e) {
        float vip;
        float f;
        float vip2;
        float f2;
        float f3;
        float vip3;
        float f4;
        float vip4;
        float f5;
        AbstractC14697e loadAd = ((C0912e) this.f6386e).loadAd(c7912e.f16004e);
        if (loadAd == null) {
            m873protected("%s reference '%s' not found", z ? "Fill" : "Stroke", c7912e.f16004e);
            AbstractC11870e abstractC11870e = c7912e.f16003e;
            if (abstractC11870e != null) {
                m866e((C1506e) this.f6385e, z, abstractC11870e);
                return;
            } else if (z) {
                ((C1506e) this.f6385e).vip = false;
                return;
            } else {
                ((C1506e) this.f6385e).metrica = false;
                return;
            }
        }
        boolean z2 = loadAd instanceof C4502e;
        C18073e c18073e = C18073e.f35445e;
        if (z2) {
            C4502e c4502e = (C4502e) loadAd;
            String str = c4502e.advert;
            if (str != null) {
                m864default(c4502e, str);
            }
            Boolean bool = c4502e.startapp;
            boolean z3 = bool != null && bool.booleanValue();
            C1506e c1506e = (C1506e) this.f6385e;
            Paint paint = z ? c1506e.license : c1506e.appmetrica;
            if (z3) {
                C1506e c1506e2 = (C1506e) this.f6385e;
                f2 = 256.0f;
                C2359e c2359e2 = c1506e2.billing;
                if (c2359e2 == null) {
                    c2359e2 = c1506e2.purchase;
                }
                C17102e c17102e = c4502e.smaato;
                float license = c17102e != null ? c17102e.license(this) : 0.0f;
                C17102e c17102e2 = c4502e.amazon;
                vip3 = c17102e2 != null ? c17102e2.appmetrica(this) : 0.0f;
                f3 = 0.0f;
                C17102e c17102e3 = c4502e.loadAd;
                float license2 = c17102e3 != null ? c17102e3.license(this) : c2359e2.license;
                C17102e c17102e4 = c4502e.Signature;
                f5 = license2;
                vip4 = c17102e4 != null ? c17102e4.appmetrica(this) : 0.0f;
                f4 = license;
            } else {
                f2 = 256.0f;
                f3 = 0.0f;
                C17102e c17102e5 = c4502e.smaato;
                float vip5 = c17102e5 != null ? c17102e5.vip(this, 1.0f) : 0.0f;
                C17102e c17102e6 = c4502e.amazon;
                vip3 = c17102e6 != null ? c17102e6.vip(this, 1.0f) : 0.0f;
                C17102e c17102e7 = c4502e.loadAd;
                float vip6 = c17102e7 != null ? c17102e7.vip(this, 1.0f) : 1.0f;
                C17102e c17102e8 = c4502e.Signature;
                f4 = vip5;
                vip4 = c17102e8 != null ? c17102e8.vip(this, 1.0f) : 0.0f;
                f5 = vip6;
            }
            float f6 = vip3;
            m911e();
            this.f6385e = m927new(c4502e);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c2359e.vip, c2359e.metrica);
                matrix.preScale(c2359e.license, c2359e.appmetrica);
            }
            Matrix matrix2 = c4502e.adcel;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c4502e.yandex.size();
            if (size == 0) {
                m903e();
                if (z) {
                    ((C1506e) this.f6385e).vip = false;
                    return;
                } else {
                    ((C1506e) this.f6385e).metrica = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c4502e.yandex.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                C8145e c8145e = (C8145e) ((AbstractC16408e) it.next());
                Float f8 = c8145e.yandex;
                float floatValue = f8 != null ? f8.floatValue() : f3;
                if (i == 0 || floatValue >= f7) {
                    fArr[i] = floatValue;
                    f7 = floatValue;
                } else {
                    fArr[i] = f7;
                }
                m911e();
                m908e((C1506e) this.f6385e, c8145e);
                C17619e c17619e = ((C1506e) this.f6385e).ad;
                C18073e c18073e2 = (C18073e) c17619e.f34517e;
                if (c18073e2 == null) {
                    c18073e2 = c18073e;
                }
                iArr[i] = m863class(c18073e2.f35446e, c17619e.f34524e.floatValue());
                i++;
                m903e();
            }
            if ((f4 == f5 && f6 == vip4) || size == 1) {
                m903e();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i2 = c4502e.mopub;
            if (i2 != 0) {
                if (i2 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i2 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            m903e();
            LinearGradient linearGradient = new LinearGradient(f4, f6, f5, vip4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (((C1506e) this.f6385e).ad.f34499e.floatValue() * f2);
            paint.setAlpha(floatValue2 < 0 ? 0 : floatValue2 > 255 ? 255 : floatValue2);
            return;
        }
        if (!(loadAd instanceof C2775e)) {
            if (loadAd instanceof C8105e) {
                C8105e c8105e = (C8105e) loadAd;
                if (z) {
                    if (m869finally(c8105e.appmetrica, 2147483648L)) {
                        C1506e c1506e3 = (C1506e) this.f6385e;
                        C17619e c17619e2 = c1506e3.ad;
                        AbstractC11870e abstractC11870e2 = c8105e.appmetrica.f34513e;
                        c17619e2.f34506e = abstractC11870e2;
                        c1506e3.vip = abstractC11870e2 != null;
                    }
                    if (m869finally(c8105e.appmetrica, 4294967296L)) {
                        ((C1506e) this.f6385e).ad.f34499e = c8105e.appmetrica.f34514e;
                    }
                    if (m869finally(c8105e.appmetrica, 6442450944L)) {
                        C1506e c1506e4 = (C1506e) this.f6385e;
                        m866e(c1506e4, z, c1506e4.ad.f34506e);
                        return;
                    }
                    return;
                }
                if (m869finally(c8105e.appmetrica, 2147483648L)) {
                    C1506e c1506e5 = (C1506e) this.f6385e;
                    C17619e c17619e3 = c1506e5.ad;
                    AbstractC11870e abstractC11870e3 = c8105e.appmetrica.f34513e;
                    c17619e3.f34523e = abstractC11870e3;
                    c1506e5.metrica = abstractC11870e3 != null;
                }
                if (m869finally(c8105e.appmetrica, 4294967296L)) {
                    ((C1506e) this.f6385e).ad.f34495e = c8105e.appmetrica.f34514e;
                }
                if (m869finally(c8105e.appmetrica, 6442450944L)) {
                    C1506e c1506e6 = (C1506e) this.f6385e;
                    m866e(c1506e6, z, c1506e6.ad.f34523e);
                    return;
                }
                return;
            }
            return;
        }
        C2775e c2775e = (C2775e) loadAd;
        String str2 = c2775e.advert;
        if (str2 != null) {
            m864default(c2775e, str2);
        }
        Boolean bool2 = c2775e.startapp;
        boolean z4 = bool2 != null && bool2.booleanValue();
        C1506e c1506e7 = (C1506e) this.f6385e;
        Paint paint2 = z ? c1506e7.license : c1506e7.appmetrica;
        if (z4) {
            C17102e c17102e9 = new C17102e(9, 50.0f);
            C17102e c17102e10 = c2775e.smaato;
            float license3 = c17102e10 != null ? c17102e10.license(this) : c17102e9.license(this);
            C17102e c17102e11 = c2775e.amazon;
            vip = c17102e11 != null ? c17102e11.appmetrica(this) : c17102e9.appmetrica(this);
            C17102e c17102e12 = c2775e.loadAd;
            vip2 = c17102e12 != null ? c17102e12.ad(this) : c17102e9.ad(this);
            f = license3;
        } else {
            C17102e c17102e13 = c2775e.smaato;
            float vip7 = c17102e13 != null ? c17102e13.vip(this, 1.0f) : 0.5f;
            C17102e c17102e14 = c2775e.amazon;
            vip = c17102e14 != null ? c17102e14.vip(this, 1.0f) : 0.5f;
            C17102e c17102e15 = c2775e.loadAd;
            f = vip7;
            vip2 = c17102e15 != null ? c17102e15.vip(this, 1.0f) : 0.5f;
        }
        float f9 = vip;
        m911e();
        this.f6385e = m927new(c2775e);
        Matrix matrix3 = new Matrix();
        if (!z4) {
            matrix3.preTranslate(c2359e.vip, c2359e.metrica);
            matrix3.preScale(c2359e.license, c2359e.appmetrica);
        }
        Matrix matrix4 = c2775e.adcel;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c2775e.yandex.size();
        if (size2 == 0) {
            m903e();
            if (z) {
                ((C1506e) this.f6385e).vip = false;
                return;
            } else {
                ((C1506e) this.f6385e).metrica = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c2775e.yandex.iterator();
        int i3 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            C8145e c8145e2 = (C8145e) ((AbstractC16408e) it2.next());
            Float f11 = c8145e2.yandex;
            float floatValue3 = f11 != null ? f11.floatValue() : 0.0f;
            if (i3 == 0 || floatValue3 >= f10) {
                fArr2[i3] = floatValue3;
                f10 = floatValue3;
            } else {
                fArr2[i3] = f10;
            }
            m911e();
            m908e((C1506e) this.f6385e, c8145e2);
            C17619e c17619e4 = ((C1506e) this.f6385e).ad;
            C18073e c18073e3 = (C18073e) c17619e4.f34517e;
            if (c18073e3 == null) {
                c18073e3 = c18073e;
            }
            iArr2[i3] = m863class(c18073e3.f35446e, c17619e4.f34524e.floatValue());
            i3++;
            m903e();
        }
        if (vip2 == 0.0f || size2 == 1) {
            m903e();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i4 = c2775e.mopub;
        if (i4 != 0) {
            if (i4 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i4 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        m903e();
        RadialGradient radialGradient = new RadialGradient(f, f9, vip2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (((C1506e) this.f6385e).ad.f34499e.floatValue() * 256.0f);
        if (floatValue4 < 0) {
            floatValue4 = 0;
        } else if (floatValue4 > 255) {
            floatValue4 = 255;
        }
        paint2.setAlpha(floatValue4);
    }

    /* renamed from: new, reason: not valid java name */
    public C1506e m927new(AbstractC14697e abstractC14697e) {
        C1506e c1506e = new C1506e();
        m887e(c1506e, C17619e.ad());
        m933strictfp(abstractC14697e, c1506e);
        return c1506e;
    }

    /* renamed from: package, reason: not valid java name */
    public C15514e m928package(String str) {
        return (C15514e) ((HashMap) this.f6388e).get(str);
    }

    /* renamed from: private, reason: not valid java name */
    public void m929private() {
        Messenger messenger;
        C3740e c3740e = ((C1632e) this.f6389e).ad;
        C10312e c10312e = c3740e.purchase;
        if (c10312e != null && (messenger = c3740e.billing) != null) {
            try {
                c10312e.subs(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        c3740e.vip.disconnect();
        ((BroadcastReceiver.PendingResult) this.f6384e).finish();
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList pro(C15447e c15447e) {
        InterfaceC3054e interfaceC3054e = (InterfaceC3054e) c15447e.f16036e;
        C16835e c16835e = interfaceC3054e instanceof C16835e ? (C16835e) interfaceC3054e : null;
        C6798e c6798e = c16835e != null ? c16835e.f32984e : null;
        if (c6798e == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + c15447e.f30531e.ad()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Annotation[] declaredAnnotations = c6798e.ad.getDeclaredAnnotations();
        for (Annotation annotation : declaredAnnotations) {
            Class subs = ((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs();
            C14461e m938volatile = m938volatile(AbstractC2677e.ad(subs), new C0515e(annotation), arrayList);
            if (m938volatile != null) {
                AbstractC10509e.amazon(m938volatile, annotation, subs);
            }
        }
        return arrayList;
    }

    /* renamed from: public, reason: not valid java name */
    public List m930public(AbstractC7919e abstractC7919e, C17485e c17485e, int i) {
        C17613e startapp;
        C17613e startapp2;
        C17221e c17221e = (C17221e) abstractC7919e.f16034e;
        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) abstractC7919e.f16035e;
        Boolean appmetrica = AbstractC1787e.premium.appmetrica(c17485e.f34273e);
        boolean license = C13814e.license(c17485e);
        if (i == 1) {
            startapp2 = AbstractC6143e.startapp(c17485e, interfaceC11824e, c17221e, (r12 & 8) == 0, (r12 & 16) == 0, true);
            if (startapp2 != null) {
                return m868final(this, abstractC7919e, startapp2, appmetrica, license, 8);
            }
        } else {
            startapp = AbstractC6143e.startapp(c17485e, interfaceC11824e, c17221e, (r12 & 8) == 0, (r12 & 16) == 0, true);
            if (startapp != null) {
                if (AbstractC5304e.inmobi(startapp.ad, "$delegate", false) == (i == 3)) {
                    return m880catch(abstractC7919e, startapp, true, true, appmetrica, license);
                }
            }
        }
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList purchase(C13212e c13212e, InterfaceC11824e interfaceC11824e) {
        List list = c13212e.f26226e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f6384e).subscription((C4599e) it.next(), interfaceC11824e));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if ((r11 & 64) == 64) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r11.f30530e != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((r11 & 64) == 64) goto L16;
     */
    @Override // defpackage.InterfaceC17564e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List remoteconfig(defpackage.AbstractC7919e r7, defpackage.AbstractC6649e r8, int r9, int r10, defpackage.C10067e r11) {
        /*
            r6 = this;
            boolean r11 = r8 instanceof defpackage.C9920e
            r0 = 0
            if (r11 == 0) goto Lf
            r1 = r8
            eٍؚۧ r1 = (defpackage.C9920e) r1
            java.util.List r1 = r1.f19592e
            int r1 = r1.size()
            goto L1e
        Lf:
            boolean r1 = r8 instanceof defpackage.C17485e
            if (r1 == 0) goto L1d
            r1 = r8
            e٘ؒ r1 = (defpackage.C17485e) r1
            java.util.List r1 = r1.f34262e
            int r1 = r1.size()
            goto L1e
        L1d:
            r1 = r0
        L1e:
            r2 = 64
            r3 = 32
            r4 = 1
            if (r11 == 0) goto L34
            r11 = r8
            eٍؚۧ r11 = (defpackage.C9920e) r11
            int r11 = r11.f19585e
            r5 = r11 & 32
            if (r5 != r3) goto L2f
            goto L32
        L2f:
            r11 = r11 & r2
            if (r11 != r2) goto L5a
        L32:
            r0 = r4
            goto L5a
        L34:
            boolean r11 = r8 instanceof defpackage.C17485e
            if (r11 == 0) goto L46
            r11 = r8
            e٘ؒ r11 = (defpackage.C17485e) r11
            int r11 = r11.f34254e
            r5 = r11 & 32
            if (r5 != r3) goto L42
            goto L45
        L42:
            r11 = r11 & r2
            if (r11 != r2) goto L5a
        L45:
            goto L32
        L46:
            boolean r11 = r8 instanceof defpackage.C11505e
            if (r11 == 0) goto L61
            r11 = r7
            eؙٕٓ r11 = (defpackage.C15447e) r11
            eٍْؕ r2 = r11.f30529e
            eٍْؕ r3 = defpackage.EnumC3253e.ENUM_CLASS
            if (r2 != r3) goto L55
            r0 = 2
            goto L5a
        L55:
            boolean r11 = r11.f30530e
            if (r11 == 0) goto L5a
            goto L32
        L5a:
            int r1 = r1 + r0
            int r1 = r1 + r10
            java.util.List r7 = r6.m882continue(r7, r8, r9, r1)
            return r7
        L61:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported message: "
            r9.<init>(r10)
            java.lang.Class r8 = r8.getClass()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.remoteconfig(eًٓؓ, eؙِۛ, int, int, eَؖۥ):java.util.List");
    }

    /* renamed from: return, reason: not valid java name */
    public ColorStateList m931return(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC10077e.amazon(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC10077e.amazon(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m870goto(context, AbstractC17382e.metrica(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m870goto(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m870goto(context, AbstractC17382e.metrica(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC10077e.amazon(context, R.color.abc_tint_spinner);
            }
            if (tapsense((int[]) this.f6386e, i)) {
                return AbstractC17382e.license(context, R.attr.colorControlNormal);
            }
            if (tapsense((int[]) this.f6384e, i)) {
                return AbstractC10077e.amazon(context, R.color.abc_tint_default);
            }
            if (tapsense((int[]) this.f6389e, i)) {
                return AbstractC10077e.amazon(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC10077e.amazon(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList license = AbstractC17382e.license(context, R.attr.colorSwitchThumbNormal);
        if (license == null || !license.isStateful()) {
            iArr[0] = AbstractC17382e.vip;
            iArr2[0] = AbstractC17382e.vip(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC17382e.appmetrica;
            iArr2[1] = AbstractC17382e.metrica(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC17382e.purchase;
            iArr2[2] = AbstractC17382e.metrica(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC17382e.vip;
            iArr[0] = iArr3;
            iArr2[0] = license.getColorForState(iArr3, 0);
            iArr[1] = AbstractC17382e.appmetrica;
            iArr2[1] = AbstractC17382e.metrica(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC17382e.purchase;
            iArr2[2] = license.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.InterfaceC17564e
    public List signatures(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i) {
        if (i == 2) {
            return m930public(abstractC7919e, (C17485e) abstractC6649e, 1);
        }
        C17613e m872import = m872import(abstractC6649e, (InterfaceC11824e) abstractC7919e.f16035e, (C17221e) abstractC7919e.f16034e, i, false);
        return m872import == null ? C13664e.f27089e : m868final(this, abstractC7919e, m872import, null, false, 60);
    }

    @Override // defpackage.InterfaceC17564e
    public List smaato(AbstractC7919e abstractC7919e, C17485e c17485e) {
        return m930public(abstractC7919e, c17485e, 3);
    }

    /* renamed from: static, reason: not valid java name */
    public C15514e m932static(String str) {
        HashMap hashMap = (HashMap) this.f6388e;
        C15514e c15514e = (C15514e) hashMap.get(str);
        if (c15514e != null) {
            return c15514e;
        }
        SparseArray sparseArray = (SparseArray) this.f6386e;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        C15514e c15514e2 = new C15514e(keyAt, str, C4660e.metrica);
        hashMap.put(str, c15514e2);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.f6387e).put(keyAt, true);
        ((InterfaceC14610e) this.f6384e).yandex(c15514e2);
        return c15514e2;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void m933strictfp(AbstractC16408e abstractC16408e, C1506e c1506e) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (abstractC16408e instanceof AbstractC14697e) {
                arrayList.add(0, (AbstractC14697e) abstractC16408e);
            }
            Object obj = abstractC16408e.vip;
            if (obj == null) {
                break;
            } else {
                abstractC16408e = (AbstractC16408e) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m908e(c1506e, (AbstractC14697e) it.next());
        }
        C1506e c1506e2 = (C1506e) this.f6385e;
        c1506e.billing = c1506e2.billing;
        c1506e.purchase = c1506e2.purchase;
    }

    public void subs(AbstractC6547e abstractC6547e, C2359e c2359e) {
        Path isPro;
        if (((C1506e) this.f6385e).ad.f34526e == null || (isPro = isPro(abstractC6547e, c2359e)) == null) {
            return;
        }
        ((Canvas) this.f6388e).clipPath(isPro);
    }

    @Override // defpackage.InterfaceC18372e
    public Object subscription(AbstractC7919e abstractC7919e, C17485e c17485e, AbstractC1186e abstractC1186e) {
        return m923for(abstractC7919e, c17485e, 2, abstractC1186e, C5983e.f12600e);
    }

    /* renamed from: switch, reason: not valid java name */
    public boolean m934switch(C11709e c11709e) {
        C6798e purchase;
        if (c11709e.appmetrica() != null && AbstractC7890e.billing(c11709e.purchase().vip(), "Container") && (purchase = AbstractC12511e.purchase((C7850e) this.f6388e, c11709e, (C16308e) this.f6389e)) != null) {
            LinkedHashSet linkedHashSet = AbstractC13894e.ad;
            boolean z = false;
            for (Annotation annotation : purchase.ad.getDeclaredAnnotations()) {
                if (AbstractC2677e.ad(((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs()).equals(AbstractC7903e.vip)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /* renamed from: throw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m935throw(defpackage.AbstractC6547e r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2532e.m935throw(eؙٞۙ, android.graphics.Path):void");
    }

    /* renamed from: transient, reason: not valid java name */
    public int m936transient() {
        int i;
        C17619e c17619e = ((C1506e) this.f6385e).ad;
        return (c17619e.f34509e == 1 || (i = c17619e.f34527e) == 2) ? c17619e.f34527e : i == 1 ? 3 : 1;
    }

    /* renamed from: try, reason: not valid java name */
    public void m937try(AbstractC2781e abstractC2781e, AbstractC6874e abstractC6874e) {
        float f;
        float f2;
        float f3;
        int m936transient;
        if (m884extends()) {
            Iterator it = abstractC2781e.startapp.iterator();
            boolean z = true;
            while (it.hasNext()) {
                AbstractC16408e abstractC16408e = (AbstractC16408e) it.next();
                if (abstractC16408e instanceof C3530e) {
                    abstractC6874e.smaato(m910e(((C3530e) abstractC16408e).metrica, z, !it.hasNext()));
                } else if (abstractC6874e.appmetrica((AbstractC2781e) abstractC16408e)) {
                    if (abstractC16408e instanceof C7896e) {
                        m911e();
                        C7896e c7896e = (C7896e) abstractC16408e;
                        m908e((C1506e) this.f6385e, c7896e);
                        if (m884extends() && m898e()) {
                            AbstractC14697e loadAd = c7896e.ad.loadAd(c7896e.amazon);
                            if (loadAd == null) {
                                m873protected("TextPath reference '%s' not found", c7896e.amazon);
                            } else {
                                C8754e c8754e = (C8754e) loadAd;
                                C0926e c0926e = new C0926e(c8754e.loadAd);
                                Matrix matrix = c8754e.amazon;
                                Path path = c0926e.ad;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C17102e c17102e = c7896e.loadAd;
                                r6 = c17102e != null ? c17102e.vip(this, pathMeasure.getLength()) : 0.0f;
                                int m936transient2 = m936transient();
                                if (m936transient2 != 1) {
                                    float ads = ads(c7896e);
                                    if (m936transient2 == 2) {
                                        ads /= 2.0f;
                                    }
                                    r6 -= ads;
                                }
                                crashlytics(c7896e.Signature);
                                boolean m915e = m915e();
                                m937try(c7896e, new C15465e(this, path, r6));
                                if (m915e) {
                                    m893e(c7896e.yandex);
                                }
                            }
                        }
                        m903e();
                    } else if (abstractC16408e instanceof C4493e) {
                        m911e();
                        C4493e c4493e = (C4493e) abstractC16408e;
                        m908e((C1506e) this.f6385e, c4493e);
                        if (m884extends()) {
                            ArrayList arrayList = c4493e.amazon;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC6874e instanceof C1268e;
                            if (z3) {
                                float license = !z2 ? ((C1268e) abstractC6874e).vip : ((C17102e) c4493e.amazon.get(0)).license(this);
                                ArrayList arrayList2 = c4493e.loadAd;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((C1268e) abstractC6874e).metrica : ((C17102e) c4493e.loadAd.get(0)).appmetrica(this);
                                ArrayList arrayList3 = c4493e.Signature;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C17102e) c4493e.Signature.get(0)).license(this);
                                ArrayList arrayList4 = c4493e.admob;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r6 = ((C17102e) c4493e.admob.get(0)).appmetrica(this);
                                }
                                float f4 = license;
                                f = r6;
                                r6 = f4;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z2 && (m936transient = m936transient()) != 1) {
                                float ads2 = ads(c4493e);
                                if (m936transient == 2) {
                                    ads2 /= 2.0f;
                                }
                                r6 -= ads2;
                            }
                            crashlytics(c4493e.subscription);
                            if (z3) {
                                C1268e c1268e = (C1268e) abstractC6874e;
                                c1268e.vip = r6 + f3;
                                c1268e.metrica = f2 + f;
                            }
                            boolean m915e2 = m915e();
                            m937try(c4493e, abstractC6874e);
                            if (m915e2) {
                                m893e(c4493e.yandex);
                            }
                        }
                        m903e();
                    } else if (abstractC16408e instanceof C0130e) {
                        m911e();
                        C0130e c0130e = (C0130e) abstractC16408e;
                        m908e((C1506e) this.f6385e, c0130e);
                        if (m884extends()) {
                            crashlytics(c0130e.loadAd);
                            AbstractC14697e loadAd2 = abstractC16408e.ad.loadAd(c0130e.amazon);
                            if (loadAd2 == null || !(loadAd2 instanceof AbstractC2781e)) {
                                m873protected("Tref reference '%s' not found", c0130e.amazon);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                m879break((AbstractC2781e) loadAd2, sb);
                                if (sb.length() > 0) {
                                    abstractC6874e.smaato(sb.toString());
                                }
                            }
                        }
                        m903e();
                    }
                }
                z = false;
            }
        }
    }

    @Override // defpackage.InterfaceC17564e
    public List vip(AbstractC7919e abstractC7919e, C13754e c13754e) {
        return m868final(this, abstractC7919e, new C17613e(AbstractC0869e.tapsense('#', ((InterfaceC11824e) abstractC7919e.f16035e).getString(c13754e.f27249e), AbstractC13133e.vip(((C15447e) abstractC7919e).f30531e.vip()))), null, false, 60);
    }

    /* renamed from: volatile, reason: not valid java name */
    public C14461e m938volatile(C11709e c11709e, C0515e c0515e, List list) {
        if (AbstractC13894e.ad.contains(c11709e)) {
            return null;
        }
        return new C14461e(this, AbstractC1284e.purchase((C16113e) this.f6385e, c11709e, (C11980e) this.f6387e), c11709e, list, c0515e);
    }

    /* renamed from: while, reason: not valid java name */
    public void m939while(Path path) {
        Canvas canvas = (Canvas) this.f6388e;
        C1506e c1506e = (C1506e) this.f6385e;
        if (c1506e.ad.f34529e != 2) {
            canvas.drawPath(path, c1506e.appmetrica);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((C1506e) this.f6385e).appmetrica.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((C1506e) this.f6385e).appmetrica);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }
}
