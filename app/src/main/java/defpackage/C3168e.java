package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.KeyAgreement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3168e implements InterfaceC12233e, InterfaceC4045e, InterfaceC7218e, InterfaceC2295e, InterfaceC15269e, InterfaceC0569e, InterfaceC17556e, InterfaceC14403e, InterfaceC12765e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f7271e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f7272e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7273e;

    public C3168e(int i) {
        this.f7273e = i;
        switch (i) {
            case 6:
                this.f7271e = new AtomicInteger();
                this.f7272e = new AtomicInteger();
                return;
            case 11:
                this.f7271e = new LinkedHashMap();
                this.f7272e = new LinkedHashMap();
                return;
            case 16:
                this.f7271e = (ImageCaptureFailedForSpecificCombinationQuirk) AbstractC2170e.ad.vip(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f7272e = (PreviewGreenTintQuirk) AbstractC2170e.ad.vip(PreviewGreenTintQuirk.class);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f7271e = new C12431e(0, new Reference[16]);
                this.f7272e = new ReferenceQueue();
                return;
            default:
                this.f7271e = new LinkedHashMap();
                this.f7272e = BuildConfig.FLAVOR;
                return;
        }
    }

    public /* synthetic */ C3168e(int i, Object obj) {
        this.f7273e = i;
        this.f7271e = obj;
    }

    public C3168e(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7273e = 8;
        this.f7271e = parcelFileDescriptor;
        this.f7272e = null;
    }

    public C3168e(C0680e c0680e) {
        InterfaceC16567e c7249e;
        Provider billing;
        this.f7273e = 27;
        this.f7271e = c0680e;
        try {
            billing = AbstractC1358e.billing();
        } catch (GeneralSecurityException unused) {
            c7249e = new C7249e(13);
        }
        if (billing == null) {
            throw new GeneralSecurityException("Conscrypt is not available.");
        }
        KeyFactory.getInstance("XDH", billing);
        KeyAgreement.getInstance("XDH", billing);
        c7249e = new C12916e(2, billing);
        c7249e.appmetrica();
        this.f7272e = c7249e;
    }

    public C3168e(C1410e c1410e, int[] iArr) {
        this.f7273e = 4;
        this.f7271e = AbstractC17475e.remoteconfig(c1410e);
        this.f7272e = iArr;
    }

    public C3168e(C5720e c5720e, C8988e c8988e) {
        this.f7273e = 29;
        this.f7271e = c8988e;
        Objects.requireNonNull(c5720e);
        this.f7272e = c5720e;
    }

    public C3168e(C12569e c12569e, C16675e c16675e) {
        this.f7273e = 18;
        this.f7271e = c16675e;
        this.f7272e = AbstractC14533e.startapp(c12569e);
    }

    public C3168e(InterfaceC14989e interfaceC14989e) {
        this.f7273e = 20;
        this.f7271e = interfaceC14989e;
        C16374e c16374e = new C16374e();
        c16374e.vip = 0;
        this.f7272e = c16374e;
    }

    public C3168e(C16728e c16728e) {
        this.f7273e = 19;
        C6272e c6272e = new C6272e("Type parameter upper bound erasure results");
        this.f7271e = new C5363e(new C17197e(9, this));
        this.f7272e = c6272e.vip(new C14772e(10, this));
    }

    public /* synthetic */ C3168e(Object obj, Object obj2, int i) {
        this.f7273e = i;
        this.f7271e = obj;
        this.f7272e = obj2;
    }

    public /* synthetic */ C3168e(Object obj, Object obj2, boolean z, int i) {
        this.f7273e = i;
        this.f7272e = obj;
        this.f7271e = obj2;
    }

    public C3168e(String str, Bundle bundle) {
        this.f7273e = 1;
        if (str == null) {
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        this.f7272e = str;
        this.f7271e = bundle;
    }

    public C3168e(Function1 function1) {
        this.f7273e = 15;
        this.f7271e = function1;
        this.f7272e = new C1737e(new C12350e(1, this), new Handler(Looper.getMainLooper()), C1737e.appmetrica);
    }

    /* renamed from: protected, reason: not valid java name */
    public static C3168e m1232protected(EnumC6205e enumC6205e) {
        int ordinal = enumC6205e.ordinal();
        if (ordinal == 0) {
            boolean z = false;
            return new C3168e(new C0680e("HmacSha256", z), EnumC6205e.f12969e, z, 5);
        }
        if (ordinal == 1) {
            boolean z2 = false;
            return new C3168e(new C0680e("HmacSha384", z2), EnumC6205e.f12967e, z2, 5);
        }
        if (ordinal == 2) {
            boolean z3 = false;
            return new C3168e(new C0680e("HmacSha512", z3), EnumC6205e.f12966e, z3, 5);
        }
        throw new GeneralSecurityException("invalid curve type: " + enumC6205e);
    }

    @Override // defpackage.InterfaceC4045e, defpackage.InterfaceC5876e
    public /* bridge */ AbstractC10226e Signature(InterfaceC13215e interfaceC13215e) {
        return AbstractC0083e.m245private(interfaceC13215e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ InterfaceC14822e Signature(InterfaceC13215e interfaceC13215e) {
        return AbstractC0083e.m245private(interfaceC13215e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: abstract, reason: not valid java name */
    public boolean mo1233abstract(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.appmetrica(interfaceC14822e) != null;
    }

    @Override // defpackage.InterfaceC14403e
    public int ad(int i) {
        CharSequence charSequence = (CharSequence) this.f7271e;
        do {
            i = ((C9831e) this.f7272e).m2675break(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ boolean adcel(InterfaceC0023e interfaceC0023e) {
        return AbstractC0083e.m236extends(interfaceC0023e);
    }

    @Override // defpackage.InterfaceC4045e, defpackage.InterfaceC5876e
    public /* bridge */ AbstractC10226e admob(InterfaceC13215e interfaceC13215e) {
        return AbstractC0083e.m252try(interfaceC13215e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ InterfaceC14822e admob(InterfaceC13215e interfaceC13215e) {
        return AbstractC0083e.m252try(interfaceC13215e);
    }

    @Override // defpackage.InterfaceC5876e
    public boolean ads(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.isPro(AbstractC0083e.m247strictfp(interfaceC14822e));
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ int advert(InterfaceC0023e interfaceC0023e) {
        return AbstractC0083e.pro(interfaceC0023e);
    }

    @Override // defpackage.InterfaceC4045e
    public AbstractC13270e amazon() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.InterfaceC5876e
    public boolean applovin(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m241interface(mo1238const(interfaceC14822e)) && !AbstractC0083e.m238goto(interfaceC14822e);
    }

    @Override // defpackage.InterfaceC14403e
    public int appmetrica(int i) {
        do {
            i = ((C9831e) this.f7272e).m2706static(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7271e).charAt(i)));
        return i;
    }

    @Override // defpackage.InterfaceC5876e
    public boolean billing(InterfaceC12198e interfaceC12198e) {
        return interfaceC12198e instanceof C18086e;
    }

    @Override // defpackage.InterfaceC4045e
    /* renamed from: break, reason: not valid java name */
    public /* bridge */ AbstractC10226e mo1234break(AbstractC1186e abstractC1186e) {
        return AbstractC0083e.billing(abstractC1186e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: case, reason: not valid java name */
    public /* bridge */ Collection mo1235case(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m235default(this, interfaceC14822e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: catch, reason: not valid java name */
    public InterfaceC9905e mo1236catch(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.m231break(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: class, reason: not valid java name */
    public /* bridge */ InterfaceC9905e mo1237class(InterfaceC12198e interfaceC12198e) {
        return AbstractC0083e.m246protected(interfaceC12198e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: const, reason: not valid java name */
    public InterfaceC10269e mo1238const(InterfaceC9905e interfaceC9905e) {
        InterfaceC14822e billing = AbstractC0083e.billing(interfaceC9905e);
        if (billing == null) {
            billing = firebase(interfaceC9905e);
        }
        return AbstractC0083e.m247strictfp(billing);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: continue, reason: not valid java name */
    public /* bridge */ InterfaceC14822e mo1239continue(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.billing(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ int crashlytics(InterfaceC4752e interfaceC4752e) {
        return AbstractC0083e.signatures(interfaceC4752e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: default, reason: not valid java name */
    public boolean mo1240default(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.crashlytics(AbstractC0083e.m247strictfp(interfaceC14822e));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: else, reason: not valid java name */
    public boolean mo1241else(InterfaceC14822e interfaceC14822e) {
        AbstractC10226e billing = AbstractC0083e.billing(interfaceC14822e);
        return (billing != null ? mo1276public(billing) : null) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C12948e mo378extends(android.view.View r17, defpackage.C12948e r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f7271e
            eٗؒۤ r3 = (defpackage.C16722e) r3
            java.lang.Object r4 = r0.f7272e
            eؖؗؖ r4 = (defpackage.C3900e) r4
            int r5 = r4.vip
            int r6 = r4.metrica
            int r4 = r4.license
            eٖؔ۟ r7 = r2.ad
            r8 = 519(0x207, float:7.27E-43)
            eؚِٟ r8 = r7.startapp(r8)
            r9 = 32
            eؚِٟ r7 = r7.startapp(r9)
            java.lang.Object r9 = r3.f32780e
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.vip
            int r11 = r8.metrica
            int r12 = r8.ad
            r9.isVip = r10
            boolean r10 = defpackage.AbstractC6286e.mopub(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.loadAd
            if (r0 == 0) goto L49
            int r13 = r2.ad()
            r9.tapsense = r13
            int r13 = r13 + r4
        L49:
            boolean r4 = r9.Signature
            if (r4 == 0) goto L54
            if (r10 == 0) goto L51
            r4 = r6
            goto L52
        L51:
            r4 = r5
        L52:
            int r14 = r4 + r12
        L54:
            boolean r4 = r9.admob
            if (r4 == 0) goto L5e
            if (r10 == 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r15 = r5 + r11
        L5e:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.remoteconfig
            r6 = 1
            if (r5 == 0) goto L71
            int r5 = r4.leftMargin
            if (r5 == r12) goto L71
            r4.leftMargin = r12
            r5 = r6
            goto L72
        L71:
            r5 = 0
        L72:
            boolean r10 = r9.pro
            if (r10 == 0) goto L7d
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7d
            r4.rightMargin = r11
            r5 = r6
        L7d:
            boolean r10 = r9.signatures
            if (r10 == 0) goto L8a
            int r10 = r4.topMargin
            int r8 = r8.vip
            if (r10 == r8) goto L8a
            r4.topMargin = r8
            goto L8b
        L8a:
            r6 = r5
        L8b:
            if (r6 == 0) goto L90
            r1.setLayoutParams(r4)
        L90:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.f32781e
            if (r1 == 0) goto L9f
            int r3 = r7.license
            r9.smaato = r3
        L9f:
            if (r0 != 0) goto La5
            if (r1 == 0) goto La4
            goto La5
        La4:
            return r2
        La5:
            r9.m177extends()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3168e.mo378extends(android.view.View, eْؐٛ):eْؐٛ");
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public AbstractC15728e m1242e(C9265e c9265e) {
        AbstractC15728e smaato;
        AbstractC10226e abstractC10226e = c9265e.purchase;
        return (abstractC10226e == null || (smaato = AbstractC16279e.smaato(abstractC10226e)) == null) ? (C3267e) ((C5363e) this.f7271e).getValue() : smaato;
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public C5891e m1243e(String str) {
        String license = AbstractC17190e.license((String) this.f7272e, str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7271e;
        if (license.length() != 0 && !linkedHashMap.containsKey(license) && !linkedHashMap.containsKey(license.concat(".size"))) {
            Set<String> keySet = linkedHashMap.keySet();
            if ((keySet instanceof Collection) && keySet.isEmpty()) {
                return null;
            }
            for (String str2 : keySet) {
                if (!AbstractC6507e.pro(str2, license, false) || str2.length() <= license.length() || str2.charAt(license.length()) != '.') {
                }
            }
            return null;
        }
        return new C5891e(linkedHashMap, license, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001f, code lost:
    
        if (r0.equals("HmacSha512") == false) goto L6;
     */
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m1244e() {
        /*
            r6 = this;
            int r0 = r6.f7273e
            java.lang.String r1 = "Could not determine HPKE KEM ID"
            r2 = 2
            r3 = 1
            java.lang.Object r4 = r6.f7271e
            switch(r0) {
                case 5: goto L5b;
                default: goto Lb;
            }
        Lb:
            eؑۤۨ r4 = (defpackage.C0680e) r4
            java.lang.String r0 = r4.ad
            int r4 = r0.hashCode()
            r5 = -1
            switch(r4) {
                case 984523022: goto L2d;
                case 984524074: goto L22;
                case 984525777: goto L19;
                default: goto L17;
            }
        L17:
            r2 = r5
            goto L37
        L19:
            java.lang.String r3 = "HmacSha512"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L37
            goto L17
        L22:
            java.lang.String r2 = "HmacSha384"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2b
            goto L17
        L2b:
            r2 = r3
            goto L37
        L2d:
            java.lang.String r2 = "HmacSha256"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L36
            goto L17
        L36:
            r2 = 0
        L37:
            switch(r2) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L3a;
            }
        L3a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L42:
            byte[] r0 = defpackage.AbstractC0097e.yandex
            goto L4a
        L45:
            byte[] r0 = defpackage.AbstractC0097e.billing
            goto L4a
        L48:
            byte[] r0 = defpackage.AbstractC0097e.purchase
        L4a:
            byte[] r2 = defpackage.AbstractC0097e.purchase
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L55
            byte[] r0 = defpackage.AbstractC0097e.vip
            return r0
        L55:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
        L5b:
            eؙؖۧ r4 = (defpackage.EnumC6205e) r4
            int r0 = r4.ordinal()
            if (r0 == 0) goto L73
            if (r0 == r3) goto L70
            if (r0 != r2) goto L6a
            byte[] r0 = defpackage.AbstractC0097e.appmetrica
            goto L75
        L6a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r1)
            throw r0
        L70:
            byte[] r0 = defpackage.AbstractC0097e.license
            goto L75
        L73:
            byte[] r0 = defpackage.AbstractC0097e.metrica
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3168e.m1244e():byte[]");
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public InterfaceC0023e mo1245e(InterfaceC13961e interfaceC13961e, int i) {
        if (interfaceC13961e instanceof InterfaceC7557e) {
            return AbstractC0083e.advert((InterfaceC9905e) interfaceC13961e, i);
        }
        if (interfaceC13961e instanceof C3299e) {
            return (InterfaceC0023e) ((C3299e) interfaceC13961e).get(i);
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC13961e + ", " + AbstractC3820e.ad.vip(interfaceC13961e.getClass())).toString());
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public /* bridge */ boolean mo1246e(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.applovin(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public boolean mo1247e(InterfaceC9905e interfaceC9905e) {
        return !AbstractC7890e.billing(AbstractC0083e.m247strictfp(firebase(interfaceC9905e)), AbstractC0083e.m247strictfp(mo1279strictfp(interfaceC9905e)));
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public AbstractC1186e m1248e(InterfaceC16046e interfaceC16046e, C9265e c9265e) {
        return (AbstractC1186e) ((C1159e) this.f7272e).invoke(new C10549e(interfaceC16046e, c9265e));
    }

    @Override // defpackage.InterfaceC4045e
    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public /* bridge */ AbstractC15728e mo1249e(InterfaceC7557e interfaceC7557e, InterfaceC7557e interfaceC7557e2) {
        return AbstractC0083e.mopub(this, interfaceC7557e, interfaceC7557e2);
    }

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public void m1250e(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        C1737e c1737e = (C1737e) this.f7272e;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (c1737e == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC6772e.vip(audioManager, c1737e.ad());
        } else {
            audioManager.requestAudioFocus(c1737e.ad, c1737e.metrica.ad.ad(), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1251e(defpackage.C12569e r29) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3168e.m1251e(eًّٚ):void");
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public boolean m1252e(View view) {
        C16374e c16374e = (C16374e) this.f7272e;
        InterfaceC14989e interfaceC14989e = (InterfaceC14989e) this.f7271e;
        int startapp = interfaceC14989e.startapp();
        int smaato = interfaceC14989e.smaato();
        int purchase = interfaceC14989e.purchase(view);
        int ads = interfaceC14989e.ads(view);
        c16374e.metrica = startapp;
        c16374e.license = smaato;
        c16374e.appmetrica = purchase;
        c16374e.purchase = ads;
        c16374e.vip = 24579;
        return c16374e.ad();
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public /* bridge */ boolean mo1253e(InterfaceC12198e interfaceC12198e) {
        return AbstractC0083e.m242native(interfaceC12198e);
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public C17611e m1254e() {
        return new C17611e(true, true, this, C10990e.f21772e, C13520e.ad);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public /* bridge */ InterfaceC0023e mo1255e(InterfaceC9905e interfaceC9905e, int i) {
        return AbstractC0083e.advert(interfaceC9905e, i);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public /* bridge */ boolean mo1256e(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.m241interface(interfaceC10269e);
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public C2555e m1257e(C4542e c4542e, List list, C9265e c9265e) {
        AbstractC15728e abstractC15728e;
        C2555e c2555e = new C2555e(new C1239e());
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC1186e abstractC1186e = (AbstractC1186e) it.next();
            InterfaceC4077e advert = abstractC1186e.loadAd().advert();
            if (advert instanceof InterfaceC5052e) {
                Set set = c9265e.appmetrica;
                AbstractC15728e subscription = abstractC1186e.subscription();
                if (subscription instanceof AbstractC14773e) {
                    AbstractC14773e abstractC14773e = (AbstractC14773e) subscription;
                    AbstractC10226e abstractC10226e = abstractC14773e.f29222e;
                    if (!abstractC10226e.loadAd().getParameters().isEmpty() && abstractC10226e.loadAd().advert() != null) {
                        List<InterfaceC16046e> parameters = abstractC10226e.loadAd().getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(parameters, 10));
                        for (InterfaceC16046e interfaceC16046e : parameters) {
                            AbstractC16232e abstractC16232e = (AbstractC16232e) AbstractC13480e.m3592native(interfaceC16046e.getIndex(), abstractC1186e.mopub());
                            boolean z = set != null && set.contains(interfaceC16046e);
                            if (abstractC16232e == null || z || c4542e.purchase().license(abstractC16232e.vip()) == null) {
                                abstractC16232e = new C15786e(interfaceC16046e);
                            }
                            arrayList.add(abstractC16232e);
                        }
                        abstractC10226e = AbstractC14430e.mopub(abstractC10226e, arrayList, null, 2);
                    }
                    AbstractC10226e abstractC10226e2 = abstractC14773e.f29221e;
                    if (!abstractC10226e2.loadAd().getParameters().isEmpty() && abstractC10226e2.loadAd().advert() != null) {
                        List<InterfaceC16046e> parameters2 = abstractC10226e2.loadAd().getParameters();
                        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(parameters2, 10));
                        for (InterfaceC16046e interfaceC16046e2 : parameters2) {
                            AbstractC16232e abstractC16232e2 = (AbstractC16232e) AbstractC13480e.m3592native(interfaceC16046e2.getIndex(), abstractC1186e.mopub());
                            boolean z2 = set != null && set.contains(interfaceC16046e2);
                            if (abstractC16232e2 == null || z2 || c4542e.purchase().license(abstractC16232e2.vip()) == null) {
                                abstractC16232e2 = new C15786e(interfaceC16046e2);
                            }
                            arrayList2.add(abstractC16232e2);
                        }
                        abstractC10226e2 = AbstractC14430e.mopub(abstractC10226e2, arrayList2, null, 2);
                    }
                    abstractC15728e = AbstractC1596e.ad(abstractC10226e, abstractC10226e2);
                } else {
                    if (!(subscription instanceof AbstractC10226e)) {
                        throw new C14803e(10);
                    }
                    AbstractC10226e abstractC10226e3 = (AbstractC10226e) subscription;
                    if (abstractC10226e3.loadAd().getParameters().isEmpty() || abstractC10226e3.loadAd().advert() == null) {
                        abstractC15728e = abstractC10226e3;
                    } else {
                        List<InterfaceC16046e> parameters3 = abstractC10226e3.loadAd().getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(parameters3, 10));
                        for (InterfaceC16046e interfaceC16046e3 : parameters3) {
                            AbstractC16232e abstractC16232e3 = (AbstractC16232e) AbstractC13480e.m3592native(interfaceC16046e3.getIndex(), abstractC1186e.mopub());
                            boolean z3 = set != null && set.contains(interfaceC16046e3);
                            if (abstractC16232e3 == null || z3 || c4542e.purchase().license(abstractC16232e3.vip()) == null) {
                                abstractC16232e3 = new C15786e(interfaceC16046e3);
                            }
                            arrayList3.add(abstractC16232e3);
                        }
                        abstractC15728e = AbstractC14430e.mopub(abstractC10226e3, arrayList3, null, 2);
                    }
                }
                c2555e.add(c4542e.billing(3, AbstractC10653e.appmetrica(abstractC15728e, AbstractC10653e.vip(subscription))));
            } else if (advert instanceof InterfaceC16046e) {
                Set set2 = c9265e.appmetrica;
                if (set2 == null || !set2.contains(advert)) {
                    c2555e.addAll(m1257e(c4542e, ((InterfaceC16046e) advert).getUpperBounds(), c9265e));
                } else {
                    c2555e.add(m1242e(c9265e));
                }
            }
        }
        C1239e c1239e = c2555e.f6416e;
        c1239e.vip();
        return c1239e.f3917e > 0 ? c2555e : C2555e.f6415e;
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public InterfaceC8498e m1258e(String str) {
        InterfaceC8498e interfaceC8498e;
        C3560e c3560e = (C3560e) this.f7271e;
        synchronized (((C10215e) c3560e.purchase)) {
            Iterator it = ((LinkedHashMap) c3560e.billing).entrySet().iterator();
            do {
                interfaceC8498e = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC8498e interfaceC8498e2 = (InterfaceC8498e) entry.getValue();
                if (AbstractC7890e.billing(str2, str)) {
                    interfaceC8498e = interfaceC8498e2;
                }
            } while (interfaceC8498e == null);
        }
        return interfaceC8498e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public /* bridge */ InterfaceC9905e mo1259e(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.m244package(this, interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public /* bridge */ boolean mo1260e(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.m234class(interfaceC9905e);
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public void m1261e(String str, InterfaceC8498e interfaceC8498e) {
        C3560e c3560e = (C3560e) this.f7271e;
        synchronized (((C10215e) c3560e.purchase)) {
            if (((LinkedHashMap) c3560e.billing).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) c3560e.billing).put(str, interfaceC8498e);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public /* bridge */ InterfaceC13961e mo1262e(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.metrica(interfaceC14822e);
    }

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public void m1263e() {
        if (!((C3560e) this.f7271e).metrica) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4587e c4587e = (C4587e) this.f7272e;
        if (c4587e == null) {
            c4587e = new C4587e(this);
        }
        this.f7272e = c4587e;
        try {
            C6825e.class.getDeclaredConstructor(null);
            C4587e c4587e2 = (C4587e) this.f7272e;
            if (c4587e2 != null) {
                ((LinkedHashSet) c4587e2.vip).add(C6825e.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C6825e.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public /* bridge */ boolean mo1264e(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.inmobi(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        ((C5720e) this.f7272e).vip.remove((C8988e) this.f7271e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: finally, reason: not valid java name */
    public /* bridge */ InterfaceC13215e mo1265finally(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.purchase(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC14822e firebase(InterfaceC9905e interfaceC9905e) {
        AbstractC10226e m252try;
        AbstractC14773e purchase = AbstractC0083e.purchase(interfaceC9905e);
        return (purchase == null || (m252try = AbstractC0083e.m252try(purchase)) == null) ? AbstractC0083e.billing(interfaceC9905e) : m252try;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: for, reason: not valid java name */
    public /* bridge */ InterfaceC14822e mo1266for(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.startapp(interfaceC14822e);
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f7273e) {
            case 3:
                return new C11833e((Context) ((C5389e) this.f7271e).f11540e, (C12894e) ((C5389e) this.f7272e).get());
            default:
                return new C7596e((C16723e) ((InterfaceC16964e) this.f7271e).get(), (C10618e) ((InterfaceC18006e) this.f7272e).get());
        }
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: goto, reason: not valid java name */
    public /* bridge */ boolean mo1267goto(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.ads(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: implements, reason: not valid java name */
    public /* bridge */ AbstractC0181e mo1268implements(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m237final(this, interfaceC14822e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: import, reason: not valid java name */
    public /* bridge */ InterfaceC0023e mo1269import(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.yandex(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ boolean inmobi(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.isPro(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: instanceof, reason: not valid java name */
    public /* bridge */ InterfaceC0023e mo1270instanceof(InterfaceC9192e interfaceC9192e) {
        return AbstractC0083e.m239implements(interfaceC9192e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: interface, reason: not valid java name */
    public /* bridge */ Collection mo1271interface(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.m248super(interfaceC10269e);
    }

    public Bundle isPro(String str) {
        C3560e c3560e = (C3560e) this.f7271e;
        if (!c3560e.vip) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) c3560e.yandex;
        if (bundle == null) {
            return null;
        }
        Bundle vip = bundle.containsKey(str) ? AbstractC1596e.vip(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c3560e.yandex = null;
        }
        return vip;
    }

    public void isVip(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        C1737e c1737e = (C1737e) this.f7272e;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (c1737e == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC6772e.ad(audioManager, c1737e.ad());
        } else {
            audioManager.abandonAudioFocus(c1737e.ad);
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        C18405e c18405e;
        switch (this.f7273e) {
            case 10:
                InterfaceC1664e interfaceC1664e = (InterfaceC1664e) obj;
                C13343e c13343e = (C13343e) this.f7272e;
                AbstractC9464e.yandex("Recorder", "VideoEncoder can be released: " + interfaceC1664e);
                if (interfaceC1664e == null) {
                    return;
                }
                ScheduledFuture scheduledFuture = c13343e.tapsense;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (c18405e = c13343e.remoteconfig) != null && c18405e == interfaceC1664e) {
                    C13343e.smaato(c18405e);
                }
                c13343e.inmobi = (C2245e) this.f7271e;
                c13343e.subscription(null);
                c13343e.loadAd();
                return;
            default:
                AbstractC4265e.yandex(null, ((C7169e) this.f7271e).ad(null));
                return;
        }
    }

    @Override // defpackage.InterfaceC4045e, defpackage.InterfaceC5876e
    public /* bridge */ AbstractC10226e loadAd(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m251transient(interfaceC14822e, true);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ InterfaceC14822e loadAd(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m251transient(interfaceC14822e, false);
    }

    @Override // defpackage.InterfaceC14403e
    public int metrica(int i) {
        do {
            i = ((C9831e) this.f7272e).m2706static(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7271e).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.InterfaceC5876e
    public int mopub(InterfaceC13961e interfaceC13961e) {
        if (interfaceC13961e instanceof InterfaceC14822e) {
            return AbstractC0083e.vip((InterfaceC9905e) interfaceC13961e);
        }
        if (interfaceC13961e instanceof C3299e) {
            return ((C3299e) interfaceC13961e).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC13961e + ", " + AbstractC3820e.ad.vip(interfaceC13961e.getClass())).toString());
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: native, reason: not valid java name */
    public /* bridge */ InterfaceC10269e mo1272native(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.m247strictfp(interfaceC14822e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: new, reason: not valid java name */
    public /* bridge */ int mo1273new(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.m230abstract(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: package, reason: not valid java name */
    public InterfaceC9905e mo1274package(ArrayList arrayList) {
        return AbstractC9764e.startapp(arrayList);
    }

    @Override // defpackage.InterfaceC5876e
    public boolean premium(AbstractC15728e abstractC15728e) {
        return AbstractC0083e.m234class(firebase(abstractC15728e)) != AbstractC0083e.m234class(mo1279strictfp(abstractC15728e));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: private, reason: not valid java name */
    public /* bridge */ InterfaceC12198e mo1275private(InterfaceC7557e interfaceC7557e) {
        return AbstractC0083e.license(this, interfaceC7557e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ boolean pro(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.firebase(interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: public, reason: not valid java name */
    public InterfaceC12198e mo1276public(InterfaceC14822e interfaceC14822e) {
        InterfaceC7557e interfaceC7557e;
        C12519e appmetrica = AbstractC0083e.appmetrica(interfaceC14822e);
        if (appmetrica == null || (interfaceC7557e = appmetrica.f25058e) == null) {
            interfaceC7557e = (InterfaceC7557e) interfaceC14822e;
        }
        return AbstractC0083e.license(this, interfaceC7557e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ int purchase(InterfaceC9905e interfaceC9905e) {
        return AbstractC0083e.vip(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ InterfaceC9905e remoteconfig(InterfaceC0023e interfaceC0023e) {
        return AbstractC0083e.subscription(this, interfaceC0023e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: return, reason: not valid java name */
    public boolean mo1277return(InterfaceC10269e interfaceC10269e, InterfaceC10269e interfaceC10269e2) {
        if (!(interfaceC10269e instanceof InterfaceC5021e)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(interfaceC10269e2 instanceof InterfaceC5021e)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (AbstractC0083e.ad(interfaceC10269e, interfaceC10269e2)) {
            return true;
        }
        InterfaceC5021e interfaceC5021e = (InterfaceC5021e) interfaceC10269e;
        InterfaceC5021e interfaceC5021e2 = (InterfaceC5021e) interfaceC10269e2;
        Map map = (Map) this.f7271e;
        if (((InterfaceC15558e) this.f7272e).startapp(interfaceC5021e, interfaceC5021e2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        InterfaceC5021e interfaceC5021e3 = (InterfaceC5021e) map.get(interfaceC5021e);
        InterfaceC5021e interfaceC5021e4 = (InterfaceC5021e) map.get(interfaceC5021e2);
        if (interfaceC5021e3 == null || !interfaceC5021e3.equals(interfaceC5021e2)) {
            return interfaceC5021e4 != null && interfaceC5021e4.equals(interfaceC5021e);
        }
        return true;
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ InterfaceC9192e signatures(InterfaceC12198e interfaceC12198e) {
        return AbstractC0083e.m243new(interfaceC12198e);
    }

    @Override // defpackage.InterfaceC14403e
    public int smaato(int i) {
        do {
            i = ((C9831e) this.f7272e).m2675break(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f7271e).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ boolean startapp(InterfaceC14822e interfaceC14822e) {
        return AbstractC0083e.premium(interfaceC14822e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: static, reason: not valid java name */
    public /* bridge */ boolean mo1278static(InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2) {
        return AbstractC0083e.isVip(interfaceC14822e, interfaceC14822e2);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: strictfp, reason: not valid java name */
    public InterfaceC14822e mo1279strictfp(InterfaceC9905e interfaceC9905e) {
        AbstractC10226e m245private;
        AbstractC14773e purchase = AbstractC0083e.purchase(interfaceC9905e);
        return (purchase == null || (m245private = AbstractC0083e.m245private(purchase)) == null) ? AbstractC0083e.billing(interfaceC9905e) : m245private;
    }

    @Override // defpackage.InterfaceC5876e
    public InterfaceC0023e subs(InterfaceC14822e interfaceC14822e, int i) {
        if (i < 0 || i >= AbstractC0083e.vip(interfaceC14822e)) {
            return null;
        }
        return AbstractC0083e.advert(interfaceC14822e, i);
    }

    @Override // defpackage.InterfaceC5876e
    public void subscription(InterfaceC9905e interfaceC9905e) {
        AbstractC0083e.purchase(interfaceC9905e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: super, reason: not valid java name */
    public /* bridge */ void mo1280super(InterfaceC14822e interfaceC14822e) {
        AbstractC0083e.m250throw(interfaceC14822e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: switch, reason: not valid java name */
    public boolean mo1281switch(InterfaceC9905e interfaceC9905e) {
        return interfaceC9905e instanceof C9579e;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: synchronized, reason: not valid java name */
    public /* bridge */ InterfaceC4752e mo1282synchronized(InterfaceC10269e interfaceC10269e, int i) {
        return AbstractC0083e.loadAd(interfaceC10269e, i);
    }

    @Override // defpackage.InterfaceC7218e
    public byte[] tapsense(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((C14186e) this.f7271e).tapsense(i, bArr) : ((C5891e) this.f7272e).tapsense(i, bArr);
    }

    /* renamed from: this, reason: not valid java name */
    public View m1283this(int i, int i2, int i3, int i4) {
        C16374e c16374e = (C16374e) this.f7272e;
        InterfaceC14989e interfaceC14989e = (InterfaceC14989e) this.f7271e;
        int startapp = interfaceC14989e.startapp();
        int smaato = interfaceC14989e.smaato();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View applovin = interfaceC14989e.applovin(i);
            int purchase = interfaceC14989e.purchase(applovin);
            int ads = interfaceC14989e.ads(applovin);
            c16374e.metrica = startapp;
            c16374e.license = smaato;
            c16374e.appmetrica = purchase;
            c16374e.purchase = ads;
            if (i3 != 0) {
                c16374e.vip = i3;
                if (c16374e.ad()) {
                    return applovin;
                }
            }
            if (i4 != 0) {
                c16374e.vip = i4;
                if (c16374e.ad()) {
                    view = applovin;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: throw, reason: not valid java name */
    public /* bridge */ int mo1284throw(InterfaceC12198e interfaceC12198e) {
        return AbstractC0083e.adcel(interfaceC12198e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: throws, reason: not valid java name */
    public /* bridge */ void mo1285throws(InterfaceC14822e interfaceC14822e) {
        AbstractC0083e.m253while(interfaceC14822e);
    }

    public String toString() {
        switch (this.f7273e) {
            case 22:
                return AbstractC17540e.license("\nif (" + ((C9770e) this.f7271e) + ") {\n    " + AbstractC13480e.m3608try((List) this.f7272e, ";\n", null, null, null, 62) + "\n};\n            ");
            case 23:
                return ((C2443e) this.f7271e) + ".push(" + ((C2443e) this.f7272e) + ");";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C2443e) this.f7271e) + " != " + ((C5401e) this.f7272e);
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m1286transient(String str, String str2, Function1 function1) {
        LinkedHashMap linkedHashMap = ((C11704e) this.f7271e).ad;
        C0639e c0639e = new C0639e(this, str, str2);
        function1.invoke(c0639e);
        String str3 = (String) this.f7272e;
        ArrayList arrayList = c0639e.vip;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((C6571e) it.next()).f13544e);
        }
        String str4 = (String) c0639e.metrica.f13544e;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC13480e.m3608try(arrayList2, BuildConfig.FLAVOR, null, null, C15146e.f29949e, 30));
        sb.append(')');
        if (str4.length() > 1) {
            str4 = AbstractC17861e.advert(';', "L", str4);
        }
        sb.append(str4);
        String tapsense = AbstractC0869e.tapsense('.', str3, sb.toString());
        C7639e c7639e = (C7639e) c0639e.metrica.f13543e;
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C7639e) ((C6571e) it2.next()).f13543e);
        }
        linkedHashMap.put(tapsense, new C1438e(c7639e, arrayList3, c0639e.ad));
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: try, reason: not valid java name */
    public boolean mo1287try(InterfaceC9905e interfaceC9905e) {
        AbstractC10226e billing = AbstractC0083e.billing(interfaceC9905e);
        return (billing != null ? AbstractC0083e.appmetrica(billing) : null) != null;
    }

    @Override // defpackage.InterfaceC5876e
    public /* bridge */ boolean vip(InterfaceC4752e interfaceC4752e, InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.tapsense(interfaceC4752e, interfaceC10269e);
    }

    @Override // defpackage.InterfaceC5876e
    /* renamed from: volatile, reason: not valid java name */
    public /* bridge */ boolean mo1288volatile(InterfaceC10269e interfaceC10269e) {
        return AbstractC0083e.crashlytics(interfaceC10269e);
    }

    /* renamed from: while, reason: not valid java name */
    public void m1289while() {
        C0576e c0576e = (C0576e) this.f7272e;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            C12569e c12569e = (C12569e) c0576e.getValue();
            if (c12569e != null) {
                C16675e c16675e = (C16675e) this.f7271e;
                C12742e c12742e = c16675e.vip;
                C12742e c12742e2 = c16675e.metrica;
                c12742e2.clear();
                while (c12742e2.size() + c12742e.size() > c16675e.ad - 1) {
                    AbstractC13480e.m3600strictfp(c12742e);
                }
                c12742e.add(c12569e);
            }
            c0576e.setValue(null);
        } finally {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        switch (this.f7273e) {
            case 10:
                AbstractC9464e.yandex("Recorder", "Error in ReadyToReleaseFuture: " + th);
                return;
            default:
                if (th instanceof C9336e) {
                    AbstractC4265e.yandex(null, ((C9689e) this.f7272e).cancel(false));
                    return;
                } else {
                    AbstractC4265e.yandex(null, ((C7169e) this.f7271e).ad(null));
                    return;
                }
        }
    }
}
