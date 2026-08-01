package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17150e {
    public final /* synthetic */ int ad;
    public static final C2892e vip = new C2892e(-865932534, false, new C9012e(15));
    public static final C2892e metrica = new C2892e(1419435051, false, new C9012e(17));
    public static final C2892e license = new C2892e(1075026205, false, new C9012e(21));
    public static final C2892e appmetrica = new C2892e(-523081575, false, new C9012e(22));
    public static final C2892e purchase = new C2892e(616608316, false, new C10417e(25));
    public static final C2892e billing = new C2892e(141781201, false, new C9012e(23));
    public static final C2892e yandex = new C2892e(-626757043, false, new C9012e(24));
    public static final C2892e startapp = new C2892e(1909138297, false, new C9012e(26));
    public static final C2892e adcel = new C2892e(-208217502, false, new C9012e(27));
    public static final C2892e mopub = new C2892e(910092198, false, new C9868e(3));
    public static final C2892e advert = new C2892e(152493271, false, new C9012e(25));
    public static final C2892e smaato = new C2892e(-71920384, false, new C10417e(26));
    public static final C2892e amazon = new C2892e(-1575018690, false, new C10417e(27));
    public static final C2892e loadAd = new C2892e(-637985703, false, new C9012e(28));
    public static final C2892e Signature = new C2892e(-2054213950, false, new C10417e(28));
    public static final C2892e admob = new C2892e(737655040, false, new C10417e(29));
    public static final C2892e subscription = new C2892e(1674688027, false, new C9012e(29));
    public static final C2892e remoteconfig = new C2892e(-1299016819, false, new C4509e(0));
    public static final C2892e pro = new C2892e(-1648251914, false, new C4509e(1));
    public static final C2892e signatures = new C2892e(1535873927, false, new C9012e(16));
    public static final C2892e tapsense = new C2892e(57364080, false, new C9012e(18));
    public static final C2892e isVip = new C2892e(-1433111381, false, new C9012e(19));
    public static final C2892e inmobi = new C2892e(-315199660, false, new C9012e(20));

    public /* synthetic */ C17150e(int i) {
        this.ad = i;
    }

    public static final void ad(String str, Function1 function1, Function0 function0, final boolean z, final boolean z2, C13770e c13770e, int i) {
        String str2 = str;
        c13770e.m3671package(-662098782);
        int i2 = 2;
        int i3 = i | (c13770e.purchase(str2) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | (c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.billing(z) ? 2048 : 1024) | (c13770e.billing(z2) ? 16384 : 8192);
        if (c13770e.m3673protected(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z3 || m3681throw == c5170e) {
                m3681throw = (AbstractC16049e) function1.invoke(str2);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16049e abstractC16049e = (AbstractC16049e) m3681throw;
            boolean z4 = i4 == 4;
            Object m3681throw2 = c13770e.m3681throw();
            if (z4 || m3681throw2 == c5170e) {
                m3681throw2 = abstractC16049e instanceof AudioTrack ? AbstractC6914e.ad((AudioTrack) abstractC16049e) : abstractC16049e.getLicense();
                c13770e.m3682throws(m3681throw2);
            }
            final String str3 = (String) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == c5170e) {
                m3681throw3 = AbstractC4628e.purchase(context, R.drawable.placeholder_audio);
                c13770e.m3682throws(m3681throw3);
            }
            final AbstractC10727e ad = AbstractC6845e.ad((Drawable) m3681throw3, c13770e);
            InterfaceC12864e license2 = AbstractC9546e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), false, null, function0, 15);
            float f = AbstractC11992e.ad;
            str2 = str;
            AbstractC16429e.ad(AbstractC16653e.license(-1825552384, new C10270e(abstractC16049e, i2), c13770e), license2, null, AbstractC16653e.license(-212389821, new C10270e(abstractC16049e, 3), c13770e), AbstractC16653e.license(-1106324732, new Function2() { // from class: eؚٗٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        AbstractC8230e.ad(z2, z, AbstractC16653e.license(-741074192, new C6949e(str3, ad, 0), c13770e2), c13770e2, 384);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), AbstractC16653e.license(-2000259643, new C11197e(str2, abstractC16049e, 1), c13770e), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, 224262, 388);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription2 = c13770e.subscription();
        if (subscription2 != null) {
            subscription2.license = new C14492e(str2, function1, function0, z, z2, i);
        }
    }

    public static final boolean appmetrica(C11795e c11795e, C11795e c11795e2, int i, C7314e c7314e) {
        if (startapp(c11795e, c11795e2, i, c7314e)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC8433e.vip(c11795e, i, new C5909e(((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).purchase(), c11795e, c11795e2, i, c7314e, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean billing(C11795e c11795e, C7314e c7314e) {
        C11795e[] c11795eArr = new C11795e[16];
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitChildren called on an unattached node");
        }
        C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e = c11795e.f27022e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        if (abstractC13616e2 == null) {
            AbstractC5851e.ad(c12431e, abstractC13616e);
        } else {
            c12431e.license(abstractC13616e2);
        }
        int i = 0;
        while (true) {
            int i2 = c12431e.f24868e;
            if (i2 == 0) {
                break;
            }
            AbstractC13616e abstractC13616e3 = (AbstractC13616e) c12431e.amazon(i2 - 1);
            if ((abstractC13616e3.f27020e & 1024) == 0) {
                AbstractC5851e.ad(c12431e, abstractC13616e3);
            } else {
                while (true) {
                    if (abstractC13616e3 == null) {
                        break;
                    }
                    if ((abstractC13616e3.f27014e & 1024) != 0) {
                        C12431e c12431e2 = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof C11795e) {
                                C11795e c11795e2 = (C11795e) abstractC13616e3;
                                int i3 = i + 1;
                                if (c11795eArr.length < i3) {
                                    int length = c11795eArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(c11795eArr, 0, r10, 0, length);
                                    c11795eArr = r10;
                                }
                                c11795eArr[i] = c11795e2;
                                i = i3;
                            } else if ((abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i4 = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e2 == null) {
                                                c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e2.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e2.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e2);
                        }
                    } else {
                        abstractC13616e3 = abstractC13616e3.f27024e;
                    }
                }
            }
        }
        Arrays.sort(c11795eArr, 0, i, C11021e.f21837e);
        int i5 = i - 1;
        if (i5 < c11795eArr.length) {
            while (i5 >= 0) {
                C11795e c11795e3 = c11795eArr[i5];
                if (AbstractC11267e.purchase(c11795e3) && vip(c11795e3, c7314e)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean license(C11795e c11795e, C7314e c7314e) {
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C11795e appmetrica2 = AbstractC11267e.appmetrica(c11795e);
                if (appmetrica2 != null) {
                    return license(appmetrica2, c7314e) || appmetrica(c11795e, appmetrica2, 1, c7314e);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c11795e.m3238e().ad ? ((Boolean) c7314e.invoke(c11795e)).booleanValue() : yandex(c11795e, c7314e);
                }
                throw new C14803e(10);
            }
        }
        return yandex(c11795e, c7314e);
    }

    public static boolean purchase(C13825e c13825e) {
        Boolean bool;
        try {
            bool = (Boolean) ((C9000e) c13825e.vip).metrica(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (AbstractC16338e.ad(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (AbstractC9464e.amazon()) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && AbstractC9464e.admob()) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean startapp(defpackage.C11795e r12, defpackage.C11795e r13, int r14, defpackage.C7314e r15) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17150e.startapp(eِ٘ؔ, eِ٘ؔ, int, eؚّٝ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean vip(defpackage.C11795e r7, defpackage.C7314e r8) {
        /*
            eٖۚۡ r0 = r7.m3239e()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8d
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L39
            if (r0 == r3) goto L8d
            if (r0 != r1) goto L31
            boolean r0 = billing(r7, r8)
            if (r0 != 0) goto L81
            eؚٖۚ r0 = r7.m3238e()
            boolean r0 = r0.ad
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L80
            goto L81
        L31:
            eٔٚؖ r7 = new eٔٚؖ
            r8 = 10
            r7.<init>(r8)
            throw r7
        L39:
            eِ٘ؔ r0 = defpackage.AbstractC11267e.appmetrica(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L87
            eٖۚۡ r6 = r0.m3239e()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L82
            if (r6 == r4) goto L5f
            if (r6 == r3) goto L82
            if (r6 == r1) goto L59
            eٔٚؖ r7 = new eٔٚؖ
            r8 = 10
            r7.<init>(r8)
            throw r7
        L59:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5f:
            boolean r1 = vip(r0, r8)
            if (r1 != 0) goto L81
            boolean r7 = appmetrica(r7, r0, r3, r8)
            if (r7 != 0) goto L81
            eؚٖۚ r7 = r0.m3238e()
            boolean r7 = r7.ad
            if (r7 == 0) goto L80
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L80
            goto L81
        L80:
            return r2
        L81:
            return r4
        L82:
            boolean r7 = appmetrica(r7, r0, r3, r8)
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L8d:
            boolean r7 = billing(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17150e.vip(eِ٘ؔ, eؚّٝ):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean yandex(C11795e c11795e, C7314e c7314e) {
        C11795e[] c11795eArr = new C11795e[16];
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitChildren called on an unattached node");
        }
        C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e = c11795e.f27022e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        if (abstractC13616e2 == null) {
            AbstractC5851e.ad(c12431e, abstractC13616e);
        } else {
            c12431e.license(abstractC13616e2);
        }
        int i = 0;
        while (true) {
            int i2 = c12431e.f24868e;
            if (i2 == 0) {
                break;
            }
            AbstractC13616e abstractC13616e3 = (AbstractC13616e) c12431e.amazon(i2 - 1);
            if ((abstractC13616e3.f27020e & 1024) == 0) {
                AbstractC5851e.ad(c12431e, abstractC13616e3);
            } else {
                while (true) {
                    if (abstractC13616e3 == null) {
                        break;
                    }
                    if ((abstractC13616e3.f27014e & 1024) != 0) {
                        C12431e c12431e2 = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof C11795e) {
                                C11795e c11795e2 = (C11795e) abstractC13616e3;
                                int i3 = i + 1;
                                if (c11795eArr.length < i3) {
                                    int length = c11795eArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(c11795eArr, 0, r10, 0, length);
                                    c11795eArr = r10;
                                }
                                c11795eArr[i] = c11795e2;
                                i = i3;
                            } else if ((abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i4 = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e2 == null) {
                                                c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e2.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e2.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e2);
                        }
                    } else {
                        abstractC13616e3 = abstractC13616e3.f27024e;
                    }
                }
            }
        }
        Arrays.sort(c11795eArr, 0, i, C11021e.f21837e);
        for (int i5 = 0; i5 < i; i5++) {
            C11795e c11795e3 = c11795eArr[i5];
            if (AbstractC11267e.purchase(c11795e3) && license(c11795e3, c7314e)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC2367e metrica(Context context, Looper looper, C2532e c2532e, Object obj, InterfaceC11335e interfaceC11335e, InterfaceC11914e interfaceC11914e) {
        switch (this.ad) {
            case 0:
                c2532e.getClass();
                Integer num = (Integer) c2532e.f6389e;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C12514e(context, looper, c2532e, bundle, interfaceC11335e, interfaceC11914e);
            case 1:
                throw AbstractC8647e.isVip(obj);
            case 2:
            case 3:
            case 4:
            default:
                C1623e c1623e = (C1623e) interfaceC11335e;
                C1623e c1623e2 = (C1623e) interfaceC11914e;
                switch (this.ad) {
                    case 2:
                        return new AbstractC8031e(context, looper, 308, c2532e, c1623e, c1623e2);
                    case 3:
                        return new AbstractC8031e(context, looper, 449, c2532e, c1623e, c1623e2);
                    case 4:
                        return new C9803e(context, looper, c2532e, (C16172e) obj, c1623e, c1623e2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 5:
                C9826e c9826e = (C9826e) obj;
                AbstractC9528e.adcel(c9826e, "Setting the API options is required.");
                return new C4379e(context, looper, c2532e, c9826e.vip, 0, c9826e.license, c9826e.appmetrica, (C1623e) interfaceC11335e, (C1623e) interfaceC11914e);
            case 6:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C7971e c7971e = new C7971e(context, looper, c2532e, (C1623e) interfaceC11335e, (C1623e) interfaceC11914e);
                c7971e.subs = c7971e.hashCode();
                return c7971e;
            case 7:
                return new AbstractC8031e(context, looper, 161, c2532e, interfaceC11335e, interfaceC11914e);
            case 8:
                C9826e c9826e2 = (C9826e) obj;
                AbstractC9528e.adcel(c9826e2, "Setting the API options is required.");
                return new C7568e(context, looper, c2532e, c9826e2.vip, 0, c9826e2.metrica, c9826e2.license, (C1623e) interfaceC11335e, (C1623e) interfaceC11914e);
            case 9:
                return new C8819e(context, looper, c2532e, (C1623e) interfaceC11335e, (C1623e) interfaceC11914e);
            case 10:
                return new AbstractC8031e(context, looper, 51, c2532e, interfaceC11335e, interfaceC11914e);
        }
    }
}
