package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.inputmethodservice.InputMethodService;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6114e implements InterfaceC0020e, InterfaceC9274e, InterfaceC11962e, InterfaceC11628e, InterfaceC5204e, InterfaceC5876e, InterfaceC0774e, InterfaceC15917e, InterfaceC2581e, InterfaceC17801e, InterfaceC9307e, InterfaceC4871e, InterfaceC1598e, InterfaceC13969e, InterfaceC14469e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static C17424e f12862e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12864e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6114e f12850e = new C6114e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6114e f12845e = new C6114e(2);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6114e f12858e = new C6114e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6114e f12842e = new C6114e(5);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C6114e f12861e = new C6114e(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C6114e f12854e = new C6114e(7);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C6114e f12860e = new C6114e(8);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C6114e f12846e = new C6114e(9);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C6114e f12855e = new C6114e(10);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C6114e f12844e = new C6114e(11);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C6114e f12843e = new C6114e(12);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C6114e f12848e = new C6114e(13);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C6114e f12852e = new C6114e(14);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C6114e f12853e = new C6114e(15);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C6114e f12851e = new C6114e(16);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final /* synthetic */ C6114e f12849e = new C6114e(17);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C6114e f12857e = new C6114e(18);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final /* synthetic */ C6114e f12863e = new C6114e(19);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C6114e f12847e = new C6114e(20);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C6114e f12856e = new C6114e(21);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C6114e f12859e = new C6114e(22);

    public /* synthetic */ C6114e(int i) {
        this.f12864e = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؔٞۘ] */
    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public static C2513e m2033e(boolean z) {
        ?? obj = new Object();
        obj.ad = VKXApplication.f36528e.getResources().getInteger(R.integer.music_playing_drawable_count);
        obj.purchase = VKXApplication.f36528e.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_width);
        obj.license = VKXApplication.f36528e.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_height);
        obj.appmetrica = VKXApplication.f36528e.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_rect_min_height);
        obj.vip = VKXApplication.f36528e.getResources().getDimensionPixelSize(R.dimen.music_playing_drawable_gap);
        if (z) {
            obj.metrica = AbstractC15933e.ad(R.attr.global_accent);
        } else {
            obj.metrica = VKXApplication.f36528e.getColor(R.color.google_white);
        }
        return new C2513e(obj);
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public static C15563e m2034e(long j, long j2) {
        return new C15563e(j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public static C2012e m2035e(Surface surface, Integer num, C15802e c15802e, C17560e c17560e, C8487e c8487e, C8469e c8469e, Size size, boolean z, int i, String str, int i2) {
        Class cls;
        ?? r1 = surface;
        C15802e c15802e2 = C15802e.f31130e;
        Integer num2 = (i2 & 2) != 0 ? null : num;
        C15802e c15802e3 = (i2 & 4) != 0 ? c15802e2 : c15802e;
        boolean z2 = (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? false : z;
        int i3 = (i2 & 1024) != 0 ? -1 : i;
        if (!c15802e3.equals(C15802e.f31133e) || Build.VERSION.SDK_INT < 35) {
            if (!c15802e3.equals(c15802e2)) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 26) {
                    throw new IllegalStateException(AbstractC1634e.smaato("Deferred OutputConfigurations are not supported on API ", i4, " (requires API 26)"));
                }
                if (size == null) {
                    throw new IllegalStateException("Size must defined when creating a deferred OutputConfiguration.");
                }
                if (c15802e3.equals(C15802e.f31122e)) {
                    cls = SurfaceTexture.class;
                } else if (c15802e3.equals(C15802e.f31139e)) {
                    cls = SurfaceHolder.class;
                } else if (c15802e3.equals(C15802e.f31120e)) {
                    if (i4 < 35) {
                        throw new IllegalStateException("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    }
                    cls = MediaCodec.class;
                } else {
                    if (!c15802e3.equals(C15802e.f31119e)) {
                        throw new IllegalStateException("Unsupported OutputType: " + c15802e3);
                    }
                    if (i4 < 35) {
                        throw new IllegalStateException("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    }
                    cls = MediaRecorder.class;
                }
                r1 = AbstractC16781e.ad(size, cls);
            } else {
                if (r1 == 0) {
                    throw new IllegalStateException("non-null surface!");
                }
                try {
                    if (i3 != -1) {
                        AbstractC6418e.billing();
                        r1 = AbstractC6418e.ad(i3, r1);
                    } else {
                        AbstractC6418e.billing();
                        r1 = AbstractC6418e.vip(r1);
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to create an OutputConfiguration for " + r1 + '!', th);
                    return null;
                }
            }
        } else {
            if (num2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (size == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r1 = AbstractC3387e.ad(num2.intValue(), size);
        }
        if (z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 24) {
                throw new IllegalStateException(AbstractC1634e.smaato("surfaceSharing is not supported on API ", i5, " (requires API 24)").toString());
            }
            if (i5 >= 26) {
                AbstractC11815e.pro(r1);
            }
        }
        if (str != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 28) {
                throw new IllegalStateException(AbstractC1634e.smaato("physicalCameraId is not supported on API ", i6, " (requires API 28)").toString());
            }
            if (i6 >= 28) {
                AbstractC17305e.m4292private(r1, str);
            }
        }
        if (c17560e != null) {
            int i7 = c17560e.ad;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                AbstractC14380e.subs(r1, i7);
            } else if (i7 != 0) {
                StringBuilder premium = AbstractC4653e.premium("Cannot set mirrorMode to a non-default value on API ", i8, ". This may result in unexpected behavior. Requested ");
                premium.append((Object) C17560e.ad(i7));
                Log.w("CXCP", premium.toString());
            }
        }
        if (c8487e != null) {
            long j = c8487e.ad;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                AbstractC14380e.isPro(r1, j);
            } else if (j != 1) {
                StringBuilder premium2 = AbstractC4653e.premium("Cannot set dynamicRangeProfile to a non-default value on API ", i9, ". This may result in unexpected behavior. Requested ");
                premium2.append((Object) C8487e.ad(j));
                Log.w("CXCP", premium2.toString());
            }
        }
        if (c8469e != null && Build.VERSION.SDK_INT >= 33) {
            AbstractC14380e.crashlytics(r1, c8469e.ad);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC17305e.signatures(r1);
        }
        return new C2012e(r1);
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public static final int m2036e(long j) {
        C3087e c3087e = C15563e.metrica;
        if (Long.compare((6917529027641081856L & j) ^ Long.MIN_VALUE, -4611686018427387904L) <= 0) {
            int i = (int) ((j & 9222809086901354496L) >>> 49);
            return i <= 6111 ? i : i - 12288;
        }
        long j2 = Long.MIN_VALUE ^ (8646911284551352320L & j);
        if (!(Long.compare(j2, -2305843009213693952L) >= 0) || !(Long.compare(j2, -1152921504606846976L) <= 0)) {
            throw new IllegalStateException("getExponent cannot be called for Infinity or NaN.");
        }
        int i2 = (int) ((j & 2305702271725338624L) >>> 47);
        return i2 <= 6111 ? i2 : i2 - 12288;
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public static void m2037e(Object obj) {
        throw new Error("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC14822e Signature(InterfaceC13215e interfaceC13215e) {
        return ((AbstractC8761e) interfaceC13215e).mo2502interface();
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: abstract */
    public boolean mo1233abstract(InterfaceC14822e interfaceC14822e) {
        return m2039e(interfaceC14822e) != null;
    }

    @Override // defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public AbstractC1186e ad() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC5876e
    public boolean adcel(InterfaceC0023e interfaceC0023e) {
        C5538e c5538e = ((C11520e) interfaceC0023e).ad;
        C5538e c5538e2 = C5538e.metrica;
        return AbstractC7890e.billing(c5538e, C5538e.metrica);
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC14822e admob(InterfaceC13215e interfaceC13215e) {
        return ((AbstractC8761e) interfaceC13215e).crashlytics();
    }

    @Override // defpackage.InterfaceC5876e
    public boolean ads(InterfaceC14822e interfaceC14822e) {
        return mo1272native(interfaceC14822e) instanceof InterfaceC7227e;
    }

    @Override // defpackage.InterfaceC5876e
    public int advert(InterfaceC0023e interfaceC0023e) {
        int i = ((C11520e) interfaceC0023e).ad.ad;
        if (i == 0) {
            return 2;
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return 3;
        }
        if (m2467class == 1) {
            return 1;
        }
        if (m2467class == 2) {
            return 2;
        }
        throw new C14803e(10);
    }

    @Override // defpackage.InterfaceC5876e
    public boolean applovin(InterfaceC14822e interfaceC14822e) {
        if (!mo1256e(mo1238const(interfaceC14822e))) {
            return false;
        }
        m2037e(interfaceC14822e);
        throw null;
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC17801e
    public C14191e appmetrica(Activity activity, InterfaceC3971e interfaceC3971e) {
        InterfaceC9274e.vip.getClass();
        return new C14191e(new C16466e(C7673e.ad().isVip(activity)), interfaceC3971e.vip(activity));
    }

    @Override // defpackage.InterfaceC5876e
    public boolean billing(InterfaceC12198e interfaceC12198e) {
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: case */
    public Collection mo1235case(InterfaceC14822e interfaceC14822e) {
        m2037e(interfaceC14822e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: catch */
    public InterfaceC9905e mo1236catch(InterfaceC9905e interfaceC9905e) {
        m2037e(interfaceC9905e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: class */
    public InterfaceC9905e mo1237class(InterfaceC12198e interfaceC12198e) {
        return (InterfaceC9905e) ((C9572e) interfaceC12198e).f19007e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: const */
    public InterfaceC10269e mo1238const(InterfaceC9905e interfaceC9905e) {
        InterfaceC14822e mo1239continue = mo1239continue(interfaceC9905e);
        if (mo1239continue == null) {
            mo1239continue = firebase(interfaceC9905e);
        }
        return mo1272native(mo1239continue);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: continue */
    public InterfaceC14822e mo1239continue(InterfaceC9905e interfaceC9905e) {
        if (mo1265finally(interfaceC9905e) != null) {
            return null;
        }
        return (InterfaceC14822e) interfaceC9905e;
    }

    @Override // defpackage.InterfaceC5876e
    public int crashlytics(InterfaceC4752e interfaceC4752e) {
        int m2467class = AbstractC8703e.m2467class(((InterfaceC12635e) interfaceC4752e).adcel());
        if (m2467class == 0) {
            return 3;
        }
        if (m2467class == 1) {
            return 1;
        }
        if (m2467class == 2) {
            return 2;
        }
        throw new C14803e(10);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: default */
    public boolean mo1240default(InterfaceC14822e interfaceC14822e) {
        mo1272native(interfaceC14822e);
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: else */
    public boolean mo1241else(InterfaceC14822e interfaceC14822e) {
        InterfaceC14822e mo1239continue = mo1239continue(interfaceC14822e);
        return (mo1239continue != null ? mo1276public(mo1239continue) : null) != null;
    }

    @Override // defpackage.InterfaceC0020e
    /* renamed from: extends */
    public Collection mo202extends(InterfaceC5052e interfaceC5052e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC14469e
    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public int mo2038e(C16975e c16975e) {
        return c16975e.remoteconfig != null ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        c9398e.f18713e.mopub(C13886e.f27520e, new C12358e((Function2) abstractC7185e, false, null, 9));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؒۤۨ */
    public InterfaceC0023e mo1245e(InterfaceC13961e interfaceC13961e, int i) {
        if (interfaceC13961e instanceof InterfaceC7557e) {
            return mo1255e((InterfaceC9905e) interfaceC13961e, i);
        }
        if (interfaceC13961e instanceof C3299e) {
            return (InterfaceC0023e) ((C3299e) interfaceC13961e).get(i);
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC13961e + ", " + AbstractC3820e.ad.vip(interfaceC13961e.getClass())).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؘْؖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1246e(defpackage.InterfaceC10269e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C8404e
            if (r0 == 0) goto Lad
            eٌؐۘ r9 = (defpackage.C8404e) r9
            java.lang.Class r0 = r9.f17185e
            eًَۖ r1 = r9.m2426final()
            if (r1 == 0) goto L1d
            eِۚۘ r2 = defpackage.AbstractC8781e.vip
            eٌَۧ[] r3 = defpackage.AbstractC8781e.ad
            r4 = 7
            r3 = r3[r4]
            java.lang.Enum r1 = r2.m3293case(r1)
            eٔۗۤ r1 = (defpackage.EnumC14920e) r1
            if (r1 != 0) goto L8f
        L1d:
            boolean r1 = r0.isAnnotation()
            if (r1 != 0) goto L8d
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L2a
            goto L8d
        L2a:
            eِؒۜ r1 = defpackage.AbstractC4256e.metrica
            r2 = 0
            if (r1 != 0) goto L57
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            eِؒۜ r3 = new eِؒۜ     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.String r4 = "isSealed"
            java.lang.reflect.Method r4 = r1.getMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.String r5 = "getPermittedSubclasses"
            java.lang.reflect.Method r5 = r1.getMethod(r5, r2)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.String r6 = "isRecord"
            java.lang.reflect.Method r6 = r1.getMethod(r6, r2)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.String r7 = "getRecordComponents"
            java.lang.reflect.Method r1 = r1.getMethod(r7, r2)     // Catch: java.lang.NoSuchMethodException -> L50
            r3.<init>(r4, r5, r6, r1)     // Catch: java.lang.NoSuchMethodException -> L50
            r1 = r3
            goto L55
        L50:
            eِؒۜ r1 = new eِؒۜ
            r1.<init>(r2, r2, r2, r2)
        L55:
            defpackage.AbstractC4256e.metrica = r1
        L57:
            java.lang.Object r1 = r1.f23072e
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L5e
            goto L65
        L5e:
            java.lang.Object r1 = r1.invoke(r0, r2)
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L65:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = defpackage.AbstractC7890e.billing(r2, r1)
            if (r1 == 0) goto L70
            eٔۗۤ r1 = defpackage.EnumC14920e.f29592e
            goto L8f
        L70:
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 == 0) goto L7d
            eٔۗۤ r1 = defpackage.EnumC14920e.f29595e
            goto L8f
        L7d:
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L8a
            eٔۗۤ r1 = defpackage.EnumC14920e.f29593e
            goto L8f
        L8a:
            eٔۗۤ r1 = defpackage.EnumC14920e.f29594e
            goto L8f
        L8d:
            eٔۗۤ r1 = defpackage.EnumC14920e.f29594e
        L8f:
            eٔۗۤ r0 = defpackage.EnumC14920e.f29594e
            if (r1 != r0) goto Lad
            eًؑؖ r0 = r9.m2423case()
            eًؑؖ r1 = defpackage.EnumC7649e.f15531e
            if (r0 == r1) goto Lad
            eًؑؖ r0 = r9.m2423case()
            eًؑؖ r1 = defpackage.EnumC7649e.f15526e
            if (r0 == r1) goto Lad
            eًؑؖ r9 = r9.m2423case()
            eًؑؖ r0 = defpackage.EnumC7649e.f15534e
            if (r9 == r0) goto Lad
            r9 = 1
            goto Lae
        Lad:
            r9 = 0
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6114e.mo1246e(eَٔ۟):boolean");
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٌؖۡ */
    public boolean mo1247e(InterfaceC9905e interfaceC9905e) {
        return !AbstractC7890e.billing(mo1272native(firebase(interfaceC9905e)), mo1272native(mo1279strictfp(interfaceC9905e)));
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        Log.w("NearbyConnections", "Failed to start discovery.", exc);
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public InterfaceC1755e m2039e(InterfaceC14822e interfaceC14822e) {
        if ((interfaceC14822e instanceof AbstractC8761e) && ((AbstractC8761e) interfaceC14822e).amazon()) {
            return (InterfaceC1755e) interfaceC14822e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eًًؓ */
    public boolean mo1253e(InterfaceC12198e interfaceC12198e) {
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eُٓؓ */
    public InterfaceC0023e mo1255e(InterfaceC9905e interfaceC9905e, int i) {
        return new C11520e((C5538e) ((InterfaceC13984e) interfaceC9905e).signatures().get(i));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eُؚٕ */
    public boolean mo1256e(InterfaceC10269e interfaceC10269e) {
        return interfaceC10269e.equals(AbstractC3820e.ad.vip(Void.class));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٓٛۢ */
    public InterfaceC9905e mo1259e(InterfaceC9905e interfaceC9905e) {
        m2037e(interfaceC9905e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eّٔؖ */
    public boolean mo1260e(InterfaceC9905e interfaceC9905e) {
        return ((InterfaceC13984e) interfaceC9905e).startapp();
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٟٗۦ */
    public InterfaceC13961e mo1262e(InterfaceC14822e interfaceC14822e) {
        return (InterfaceC13961e) interfaceC14822e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؙٟ٘ */
    public boolean mo1264e(InterfaceC10269e interfaceC10269e) {
        return interfaceC10269e.equals(AbstractC3820e.ad.vip(Object.class));
    }

    @Override // defpackage.InterfaceC17801e
    /* renamed from: final, reason: not valid java name */
    public C14191e mo2040final(ContextWrapper contextWrapper, InterfaceC3971e interfaceC3971e) {
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
        }
        if (context instanceof Activity) {
            return appmetrica((Activity) context, interfaceC3971e);
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Display defaultDisplay = ((WindowManager) contextWrapper.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C14191e(new Rect(0, 0, point.x, point.y), interfaceC3971e.vip(contextWrapper));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: finally */
    public InterfaceC13215e mo1265finally(InterfaceC9905e interfaceC9905e) {
        if (!(interfaceC9905e instanceof AbstractC8761e) || ((AbstractC8761e) interfaceC9905e).crashlytics() == null) {
            return null;
        }
        return (InterfaceC13215e) interfaceC9905e;
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC14822e firebase(InterfaceC9905e interfaceC9905e) {
        AbstractC8761e crashlytics;
        InterfaceC13215e mo1265finally = mo1265finally(interfaceC9905e);
        return (mo1265finally == null || (crashlytics = ((AbstractC8761e) mo1265finally).crashlytics()) == null) ? mo1239continue(interfaceC9905e) : crashlytics;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: for */
    public InterfaceC14822e mo1266for(InterfaceC14822e interfaceC14822e) {
        List signatures;
        int i;
        InterfaceC13984e interfaceC13984e = (InterfaceC13984e) interfaceC14822e;
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        InterfaceC7227e interfaceC7227e = isVip instanceof InterfaceC7227e ? (InterfaceC7227e) isVip : null;
        if (interfaceC7227e != null && ((signatures = interfaceC13984e.signatures()) == null || !signatures.isEmpty())) {
            Iterator it = signatures.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5538e) it.next()).ad != 1) {
                    List vip = AbstractC10589e.vip(interfaceC7227e);
                    if (vip.size() == signatures.size()) {
                        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(signatures, 10));
                        Iterator it2 = signatures.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C5538e c5538e = (C5538e) it2.next();
                            int i2 = c5538e.ad;
                            if (i2 != 1) {
                                InterfaceC13984e interfaceC13984e2 = c5538e.vip;
                                if (i2 != 2) {
                                    interfaceC13984e2 = null;
                                }
                                C5538e c5538e2 = C5538e.metrica;
                                c5538e = AbstractC16704e.license(new C9572e(interfaceC13984e2, new C13774e(c5538e), false));
                            }
                            arrayList.add(c5538e);
                        }
                        C18101e c18101e = new C18101e(AbstractC10064e.mopub(AbstractC13480e.m3579e(arrayList, AbstractC10589e.vip(interfaceC7227e))));
                        int size = signatures.size();
                        for (i = 0; i < size; i++) {
                            C5538e c5538e3 = (C5538e) signatures.get(i);
                            if (c5538e3.ad != 1) {
                                List upperBounds = ((InterfaceC12635e) vip.get(i)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(c18101e.ad((InterfaceC13984e) it3.next()).vip);
                                }
                                if (c5538e3.ad == 3) {
                                    arrayList2.add(c5538e3.vip);
                                }
                                ((C9572e) ((C5538e) arrayList.get(i)).vip).f19006e.f27307e = arrayList2;
                            }
                        }
                        boolean startapp = interfaceC13984e.startapp();
                        List annotations = interfaceC13984e.getAnnotations();
                        boolean z = interfaceC13984e instanceof AbstractC8761e;
                        AbstractC8761e abstractC8761e = z ? (AbstractC8761e) interfaceC13984e : null;
                        InterfaceC13984e adcel = abstractC8761e != null ? abstractC8761e.adcel() : null;
                        AbstractC8761e abstractC8761e2 = z ? (AbstractC8761e) interfaceC13984e : null;
                        return new C14377e(interfaceC7227e, arrayList, startapp, annotations, adcel, false, false, false, abstractC8761e2 != null ? abstractC8761e2.advert() : null, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: goto */
    public boolean mo1267goto(InterfaceC10269e interfaceC10269e) {
        return !(interfaceC10269e instanceof C13774e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: implements */
    public AbstractC0181e mo1268implements(InterfaceC14822e interfaceC14822e) {
        C18101e c18101e = C18101e.vip;
        InterfaceC13984e interfaceC13984e = (InterfaceC13984e) interfaceC14822e;
        C6114e c6114e = f12846e;
        InterfaceC10269e mo1272native = c6114e.mo1272native((AbstractC8761e) interfaceC13984e);
        int mo1273new = c6114e.mo1273new(mo1272native);
        ArrayList arrayList = new ArrayList(mo1273new);
        for (int i = 0; i < mo1273new; i++) {
            arrayList.add((InterfaceC12635e) c6114e.mo1282synchronized(mo1272native, i));
        }
        return new C3256e(!arrayList.isEmpty() ? new C18101e(AbstractC10064e.mopub(AbstractC13480e.m3579e(interfaceC13984e.signatures(), arrayList))) : C18101e.vip);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: import */
    public InterfaceC0023e mo1269import(InterfaceC9905e interfaceC9905e) {
        m2037e(interfaceC9905e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    public boolean inmobi(InterfaceC10269e interfaceC10269e) {
        return interfaceC10269e instanceof InterfaceC7227e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: instanceof */
    public InterfaceC0023e mo1270instanceof(InterfaceC9192e interfaceC9192e) {
        return new C11520e(((C13774e) interfaceC9192e).f27308e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: interface */
    public Collection mo1271interface(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC7227e) {
            List ad = ((InterfaceC7227e) interfaceC10269e).ad();
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
            Iterator it = ad.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC9905e) ((InterfaceC13984e) it.next()));
            }
            return arrayList;
        }
        if (interfaceC10269e instanceof InterfaceC12635e) {
            List upperBounds = ((InterfaceC12635e) interfaceC10269e).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(upperBounds, 10));
            Iterator it2 = upperBounds.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC9905e) ((InterfaceC13984e) it2.next()));
            }
            return arrayList2;
        }
        if (!(interfaceC10269e instanceof C13774e)) {
            StringBuilder signatures = AbstractC17861e.signatures("Unsupported type constructor: ", interfaceC10269e, " (");
            signatures.append(interfaceC10269e.getClass().getName());
            signatures.append(')');
            throw new IllegalStateException(signatures.toString().toString());
        }
        ArrayList arrayList3 = ((C13774e) interfaceC10269e).f27307e;
        if (arrayList3 == null) {
            arrayList3 = null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add((InterfaceC9905e) ((InterfaceC13984e) it3.next()));
        }
        return arrayList4;
    }

    @Override // defpackage.InterfaceC0020e
    public Collection isPro(C0520e c0520e, InterfaceC5052e interfaceC5052e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC9274e
    public Rect isVip(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            InterfaceC9274e.vip.getClass();
            Log.w(C7673e.vip, e);
            return C10990e.f21754e.isVip(activity);
        }
    }

    @Override // defpackage.InterfaceC14469e
    public /* synthetic */ void license() {
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC14822e loadAd(InterfaceC14822e interfaceC14822e) {
        return ((AbstractC8761e) interfaceC14822e).mo2501class(false);
    }

    @Override // defpackage.InterfaceC0020e
    public Collection metrica(InterfaceC5052e interfaceC5052e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC5876e
    public int mopub(InterfaceC13961e interfaceC13961e) {
        if (interfaceC13961e instanceof InterfaceC14822e) {
            return purchase((InterfaceC9905e) interfaceC13961e);
        }
        if (interfaceC13961e instanceof C3299e) {
            return ((C3299e) interfaceC13961e).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC13961e + ", " + AbstractC3820e.ad.vip(interfaceC13961e.getClass())).toString());
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: native */
    public InterfaceC10269e mo1272native(InterfaceC14822e interfaceC14822e) {
        Class<?> componentType;
        if (interfaceC14822e instanceof C9572e) {
            return ((C9572e) interfaceC14822e).f19006e;
        }
        AbstractC8761e abstractC8761e = (AbstractC8761e) interfaceC14822e;
        if (abstractC8761e.admob()) {
            return C11947e.f23928e;
        }
        InterfaceC0861e isVip = abstractC8761e.isVip();
        C8404e c8404e = isVip instanceof C8404e ? (C8404e) isVip : null;
        if (c8404e != null && (componentType = c8404e.f17185e.getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC10269e) AbstractC3820e.ad.vip(Object[].class);
        }
        InterfaceC0861e advert = abstractC8761e.advert();
        if (advert == null) {
            advert = abstractC8761e.isVip();
        }
        return (InterfaceC10269e) advert;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: new */
    public int mo1273new(InterfaceC10269e interfaceC10269e) {
        if (interfaceC10269e instanceof InterfaceC7227e) {
            return AbstractC10589e.vip((InterfaceC7227e) interfaceC10269e).size();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: package */
    public InterfaceC9905e mo1274package(ArrayList arrayList) {
        m2037e(this);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    public boolean premium(AbstractC15728e abstractC15728e) {
        return ((InterfaceC13984e) firebase(abstractC15728e)).startapp() != ((InterfaceC13984e) mo1279strictfp(abstractC15728e)).startapp();
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: private */
    public InterfaceC12198e mo1275private(InterfaceC7557e interfaceC7557e) {
        if (interfaceC7557e instanceof InterfaceC12198e) {
            return (InterfaceC12198e) interfaceC7557e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC5876e
    public boolean pro(InterfaceC10269e interfaceC10269e) {
        return false;
    }

    @Override // defpackage.InterfaceC0020e
    /* renamed from: protected */
    public Collection mo203protected(InterfaceC5052e interfaceC5052e) {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: public */
    public InterfaceC12198e mo1276public(InterfaceC14822e interfaceC14822e) {
        InterfaceC1755e m2039e = m2039e(interfaceC14822e);
        if (m2039e == null) {
            return mo1275private((InterfaceC7557e) interfaceC14822e);
        }
        m2037e(m2039e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    public int purchase(InterfaceC9905e interfaceC9905e) {
        return ((InterfaceC13984e) interfaceC9905e).signatures().size();
    }

    @Override // defpackage.InterfaceC14469e
    public /* synthetic */ void release() {
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC9905e remoteconfig(InterfaceC0023e interfaceC0023e) {
        return (InterfaceC9905e) ((C11520e) interfaceC0023e).ad.vip;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: return */
    public boolean mo1277return(InterfaceC10269e interfaceC10269e, InterfaceC10269e interfaceC10269e2) {
        return interfaceC10269e.equals(interfaceC10269e2);
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC9192e signatures(InterfaceC12198e interfaceC12198e) {
        return ((C9572e) interfaceC12198e).f19006e;
    }

    @Override // defpackage.InterfaceC11628e
    public Iterable smaato(Object obj) {
        int i = C10437e.Signature;
        return new C8950e(2, AbstractC7762e.loadAd(new C1356e(1, ((InterfaceC5052e) obj).mo1459goto().ad()), C8865e.f17823e));
    }

    @Override // defpackage.InterfaceC5876e
    public boolean startapp(InterfaceC14822e interfaceC14822e) {
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: static */
    public /* bridge */ boolean mo1278static(InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2) {
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: strictfp */
    public InterfaceC14822e mo1279strictfp(InterfaceC9905e interfaceC9905e) {
        AbstractC8761e mo2502interface;
        InterfaceC13215e mo1265finally = mo1265finally(interfaceC9905e);
        return (mo1265finally == null || (mo2502interface = ((AbstractC8761e) mo1265finally).mo2502interface()) == null) ? mo1239continue(interfaceC9905e) : mo2502interface;
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC0023e subs(InterfaceC14822e interfaceC14822e, int i) {
        if (i < 0 || i >= purchase(interfaceC14822e)) {
            return null;
        }
        return mo1255e(interfaceC14822e, i);
    }

    @Override // defpackage.InterfaceC5876e
    public void subscription(InterfaceC9905e interfaceC9905e) {
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: super */
    public void mo1280super(InterfaceC14822e interfaceC14822e) {
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: switch */
    public /* bridge */ boolean mo1281switch(InterfaceC9905e interfaceC9905e) {
        return false;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: synchronized */
    public InterfaceC4752e mo1282synchronized(InterfaceC10269e interfaceC10269e, int i) {
        return (C17936e) AbstractC10589e.vip((InterfaceC7227e) interfaceC10269e).get(i);
    }

    @Override // defpackage.InterfaceC14469e
    public /* synthetic */ InterfaceC11751e tapsense(C15683e c15683e, C16975e c16975e) {
        return InterfaceC11751e.smaato;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6114e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: throw */
    public int mo1284throw(InterfaceC12198e interfaceC12198e) {
        return 1;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: throws */
    public void mo1285throws(InterfaceC14822e interfaceC14822e) {
    }

    public String toString() {
        switch (this.f12864e) {
            case 7:
                return "NoDeclaredBrand";
            case 11:
                return "TextFieldLineLimits.SingleLine";
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC14469e
    /* renamed from: transient, reason: not valid java name */
    public void mo2041transient(Looper looper, C5350e c5350e) {
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: try */
    public boolean mo1287try(InterfaceC9905e interfaceC9905e) {
        InterfaceC14822e mo1239continue = mo1239continue(interfaceC9905e);
        return (mo1239continue != null ? m2039e(mo1239continue) : null) != null;
    }

    @Override // defpackage.InterfaceC5876e
    public boolean vip(InterfaceC4752e interfaceC4752e, InterfaceC10269e interfaceC10269e) {
        m2037e(interfaceC4752e);
        throw null;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: volatile */
    public boolean mo1288volatile(InterfaceC10269e interfaceC10269e) {
        return false;
    }

    @Override // defpackage.InterfaceC2581e
    /* renamed from: while */
    public Function0 mo357while(AbstractC5133e abstractC5133e) {
        ViewOnAttachStateChangeListenerC3060e viewOnAttachStateChangeListenerC3060e = new ViewOnAttachStateChangeListenerC3060e(abstractC5133e, 1);
        abstractC5133e.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3060e);
        C11691e c11691e = new C11691e(abstractC5133e);
        AbstractC6069e.billing(abstractC5133e).ad.add(c11691e);
        return new C4676e(abstractC5133e, viewOnAttachStateChangeListenerC3060e, c11691e);
    }

    @Override // defpackage.InterfaceC14469e
    public InterfaceC16612e yandex(C15683e c15683e, C16975e c16975e) {
        if (c16975e.remoteconfig == null) {
            return null;
        }
        return new C12134e(new C7923e(new Exception(), 6001));
    }
}
