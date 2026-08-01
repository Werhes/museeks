package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؐؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9156e implements InterfaceC8632e, InterfaceC14309e, InterfaceC10645e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f18314e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f18315e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f18316e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f18317e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f18318e;

    public /* synthetic */ C9156e(C15398e c15398e) {
        this.f18314e = c15398e;
    }

    public C9156e(InterfaceC16154e interfaceC16154e, long j, EnumC7792e enumC7792e, C4017e c4017e) {
        this.f18316e = interfaceC16154e;
        this.f18318e = j;
        this.f18315e = enumC7792e;
        this.f18317e = c4017e;
    }

    public void Signature() {
        int i;
        C18501e c18501e;
        C5537e c5537e = (C5537e) this.f18314e;
        C13391e c13391e = c5537e.amazon;
        C6268e c6268e = c5537e.yandex.pro;
        if (c6268e.mo2131new().ad == 0) {
            c18501e = null;
        } else {
            C5298e firebase = c6268e.firebase();
            if (firebase.ad.ad(26, 34)) {
                i = firebase.ad.ad(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(((InterfaceC16843e) c6268e.f22047e).mo3030e());
            int isPro = c6268e.mo2107e(23) ? c6268e.isPro() : 0;
            C5251e mo2131new = c6268e.mo2131new();
            c18501e = new C18501e(i, mo2131new.metrica, isPro, mo2131new.license, handler, c6268e);
        }
        c5537e.admob = c18501e;
        if (c18501e == null) {
            ((C2584e) c13391e.f26645e).ad.setPlaybackToLocal((c6268e.mo2107e(21) ? c6268e.smaato() : C3335e.startapp).metrica());
        } else {
            ((C2584e) c13391e.f26645e).ad.setPlaybackToRemote(c18501e.ad());
        }
    }

    @Override // defpackage.InterfaceC10645e
    public void ad() {
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void adcel(int i, C9759e c9759e) {
    }

    public void admob(C1962e c1962e) {
        C5537e c5537e = (C5537e) this.f18314e;
        C13391e c13391e = c5537e.amazon;
        isPro();
        if (c1962e == null) {
            ((C2584e) c13391e.f26645e).ad.setRatingType(0);
        } else {
            ((C2584e) c13391e.f26645e).ad.setRatingType(AbstractC13256e.isVip(c1962e.license.startapp));
        }
        c5537e.m1934static(c5537e.yandex.pro);
    }

    public AbstractC14073e ads(InterfaceC16154e interfaceC16154e, long j, EnumC7792e enumC7792e, C4017e c4017e) {
        if (((AbstractC14073e) this.f18314e) == null || !AbstractC7890e.billing(interfaceC16154e, (InterfaceC16154e) this.f18316e) || !C2108e.vip(j, this.f18318e) || enumC7792e != ((EnumC7792e) this.f18315e) || !c4017e.equals((C4017e) this.f18317e)) {
            this.f18316e = interfaceC16154e;
            this.f18318e = j;
            this.f18315e = enumC7792e;
            this.f18317e = c4017e;
            this.f18314e = interfaceC16154e.ad(j, enumC7792e, c4017e);
        }
        return (AbstractC14073e) this.f18314e;
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void advert(int i, int i2, int i3) {
    }

    @Override // defpackage.InterfaceC10645e
    public void amazon(int i, C12693e c12693e, boolean z, boolean z2, int i2) {
        C5537e c5537e = (C5537e) this.f18314e;
        c5537e.m1934static(c5537e.yandex.pro);
    }

    public void applovin(AbstractC6690e abstractC6690e) {
        C5537e c5537e = (C5537e) this.f18314e;
        C6584e c6584e = c5537e.yandex;
        C6268e c6268e = c6584e.pro;
        if (!c5537e.ads.ad(17) || !c6268e.firebase().ad(17) || abstractC6690e.Signature()) {
            C5537e.m1921case(c5537e.amazon, null);
            return;
        }
        AbstractC12614e abstractC12614e = AbstractC13256e.ad;
        ArrayList arrayList = new ArrayList();
        C11501e c11501e = new C11501e();
        int i = 0;
        for (int i2 = 0; i2 < abstractC6690e.loadAd(); i2++) {
            arrayList.add(abstractC6690e.smaato(i2, c11501e, 0L).metrica);
        }
        ArrayList arrayList2 = new ArrayList();
        RunnableC6795e runnableC6795e = new RunnableC6795e(this, new AtomicInteger(0), arrayList, arrayList2, 11);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr = ((C1962e) arrayList.get(i3)).license.mopub;
            if (bArr == null) {
                arrayList2.add(null);
                runnableC6795e.run();
            } else {
                ListenableFuture smaato = c6584e.smaato.smaato(bArr);
                arrayList2.add(smaato);
                Handler handler = c6584e.advert;
                Objects.requireNonNull(handler);
                smaato.ad(runnableC6795e, new ExecutorC17160e(i, handler));
            }
        }
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void appmetrica(int i, C11753e c11753e, String str) {
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void billing(int i, C8802e c8802e) {
    }

    public void inmobi(AbstractC6690e abstractC6690e) {
        applovin(abstractC6690e);
        isPro();
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [eٍؐؗ, java.lang.Object] */
    public void isPro() {
        Bitmap bitmap;
        Uri uri;
        C5537e c5537e = (C5537e) this.f18314e;
        C6584e c6584e = c5537e.yandex;
        C6268e c6268e = c6584e.pro;
        C1962e m2082e = c6268e.m2082e();
        C12053e m2084e = c6268e.m2084e();
        long j = -9223372036854775807L;
        if ((!c6268e.mo2107e(16) || !c6268e.mo2081e()) && c6268e.mo2107e(16)) {
            j = c6268e.getDuration();
        }
        String str = m2082e != null ? m2082e.ad : BuildConfig.FLAVOR;
        Uri uri2 = (m2082e == null || (uri = m2082e.purchase.ad) == null) ? null : uri;
        if (Objects.equals((C12053e) this.f18316e, m2084e) && Objects.equals((String) this.f18315e, str) && Objects.equals((Uri) this.f18317e, uri2) && this.f18318e == j) {
            return;
        }
        this.f18315e = str;
        this.f18317e = uri2;
        this.f18316e = m2084e;
        this.f18318e = j;
        ListenableFuture billing = c6584e.smaato.billing(m2084e);
        if (billing != null) {
            c5537e.pro = null;
            if (billing.isDone()) {
                try {
                    bitmap = (Bitmap) AbstractC2017e.vip(billing);
                } catch (CancellationException | ExecutionException e) {
                    AbstractC2803e.smaato("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
                C5537e.m1922catch(c5537e.amazon, AbstractC13256e.amazon(m2084e, str, uri2, j, bitmap));
            }
            ?? obj = new Object();
            obj.f18314e = this;
            obj.f18316e = m2084e;
            obj.f18315e = str;
            obj.f18317e = uri2;
            obj.f18318e = j;
            c5537e.pro = obj;
            Handler handler = c6584e.advert;
            Objects.requireNonNull(handler);
            billing.ad(new RunnableC17144e(billing, (Object) obj, 11), new ExecutorC17160e(0, handler));
        }
        bitmap = null;
        C5537e.m1922catch(c5537e.amazon, AbstractC13256e.amazon(m2084e, str, uri2, j, bitmap));
    }

    public void isVip(boolean z) {
        C13391e c13391e = ((C5537e) this.f18314e).amazon;
        AbstractC12614e abstractC12614e = AbstractC13256e.ad;
        C2584e c2584e = (C2584e) c13391e.f26645e;
        if (c2584e.mopub != z) {
            c2584e.mopub = z ? 1 : 0;
            synchronized (c2584e.license) {
                for (int beginBroadcast = c2584e.purchase.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((InterfaceC4687e) c2584e.purchase.getBroadcastItem(beginBroadcast)).mo1670e(z ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        AbstractC2803e.billing("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                c2584e.purchase.finishBroadcast();
            }
        }
    }

    @Override // defpackage.InterfaceC14309e
    public void license(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C5537e c5537e = (C5537e) ((C9156e) this.f18314e).f18314e;
        if (this != c5537e.pro) {
            return;
        }
        C5537e.m1922catch(c5537e.amazon, AbstractC13256e.amazon((C12053e) this.f18316e, (String) this.f18315e, (Uri) this.f18317e, this.f18318e, bitmap));
        C6584e c6584e = c5537e.yandex;
        AbstractC9413e.m2565strictfp(c6584e.loadAd, new RunnableC9624e(c6584e, 0));
    }

    public InterfaceC1108e loadAd() {
        InterfaceC15348e interfaceC15348e = (InterfaceC15348e) this.f18316e;
        interfaceC15348e.mo3328goto();
        return AbstractC7535e.yandex(new C7371e(interfaceC15348e.inmobi().mo1504e(this, null), 2));
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void metrica(int i) {
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void mopub(int i, C11753e c11753e, String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) defpackage.AbstractC17254e.adcel.ad(null)).intValue())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) defpackage.AbstractC17254e.adcel.ad(null)).intValue())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean premium(long r11, defpackage.C2266e r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f18317e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f18317e = r0
        Ld:
            java.lang.Object r0 = r10.f18315e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f18315e = r0
        L1a:
            java.lang.Object r0 = r10.f18317e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L47
            java.lang.Object r0 = r10.f18317e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            eؓۨٙ r0 = (defpackage.C2266e) r0
            long r2 = r0.premium()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.premium()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L47
            goto Ld4
        L47:
            long r2 = r10.f18318e
            int r0 = r13.amazon()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f18314e
            eؙِٕ r0 = (defpackage.C15398e) r0
            eَۘٓ r4 = r0.m3958package()
            eَؙؚ r5 = defpackage.AbstractC17254e.f33819e
            r6 = 0
            boolean r4 = r4.m2822e(r6, r5)
            if (r4 == 0) goto L83
            java.lang.Object r4 = r10.f18317e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9c
            r0.m3958package()
            eَؙؚ r4 = defpackage.AbstractC17254e.adcel
            java.lang.Object r4 = r4.ad(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Ld4
            goto L9c
        L83:
            r0.m3958package()
            eَؙؚ r4 = defpackage.AbstractC17254e.adcel
            java.lang.Object r4 = r4.ad(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9c
            goto Ld4
        L9c:
            r10.f18318e = r2
            java.lang.Object r2 = r10.f18317e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f18315e
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f18316e
            eؔٛۨ r11 = (defpackage.C2709e) r11
            if (r11 != 0) goto Lb7
            goto Lbb
        Lb7:
            java.lang.String r6 = r11.signatures()
        Lbb:
            java.lang.Object r11 = r10.f18317e
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            eَۘٓ r12 = r0.m3958package()
            eَؙؚ r13 = defpackage.AbstractC17254e.mopub
            int r12 = r12.m2825e(r6, r13)
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Ld5
        Ld4:
            return r1
        Ld5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9156e.premium(long, eؓۨٙ):boolean");
    }

    public void pro(C12053e c12053e) {
        C5537e c5537e = (C5537e) this.f18314e;
        C13391e c13391e = c5537e.amazon;
        CharSequence queueTitle = ((C8603e) ((C5891e) c13391e.f26644e).f12440e).ad.getQueueTitle();
        CharSequence charSequence = c12053e.ad;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        C6268e c6268e = c5537e.yandex.pro;
        if (!c5537e.ads.ad(17) || !c6268e.firebase().ad(17)) {
            charSequence = null;
        }
        ((C2584e) c13391e.f26645e).ad.setQueueTitle(charSequence);
    }

    @Override // defpackage.InterfaceC10645e
    public void purchase(int i, List list) {
        C5537e c5537e = (C5537e) this.f18314e;
        c5537e.m1934static(c5537e.yandex.pro);
    }

    public void remoteconfig(int i, C6268e c6268e) {
        C5537e c5537e = (C5537e) this.f18314e;
        inmobi(c6268e.m2073e());
        pro(c6268e.mo2107e(18) ? c6268e.mo2085e() : C12053e.f24142throw);
        c6268e.m2084e();
        isPro();
        isVip(c6268e.mo2091e());
        signatures(c6268e.startapp());
        c6268e.mo2131new();
        Signature();
        int i2 = c6268e.mo2107e(20) ? 4 : 0;
        if (c5537e.signatures != i2) {
            c5537e.signatures = i2;
            ((C2584e) c5537e.amazon.f26645e).ad.setFlags(i2 | 3);
        }
        admob(c6268e.m2082e());
    }

    public void signatures(int i) {
        C13391e c13391e = ((C5537e) this.f18314e).amazon;
        int Signature = AbstractC13256e.Signature(i);
        C2584e c2584e = (C2584e) c13391e.f26645e;
        if (c2584e.adcel != Signature) {
            c2584e.adcel = Signature;
            synchronized (c2584e.license) {
                for (int beginBroadcast = c2584e.purchase.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((InterfaceC4687e) c2584e.purchase.getBroadcastItem(beginBroadcast)).Signature(Signature);
                    } catch (RemoteException | SecurityException e) {
                        AbstractC2803e.billing("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                c2584e.purchase.finishBroadcast();
            }
        }
    }

    @Override // defpackage.InterfaceC10645e
    public /* synthetic */ void smaato(int i, C2411e c2411e, C5298e c5298e, boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC10645e
    public void startapp(int i, C5298e c5298e) {
        C5537e c5537e = (C5537e) this.f18314e;
        C6268e c6268e = c5537e.yandex.pro;
        int i2 = c6268e.mo2107e(20) ? 4 : 0;
        if (c5537e.signatures != i2) {
            c5537e.signatures = i2;
            ((C2584e) c5537e.amazon.f26645e).ad.setFlags(i2 | 3);
        }
        c5537e.m1934static(c6268e);
    }

    public void subs() {
        C1195e c1195e = (C1195e) this.f18314e;
        c1195e.mo2250e();
        ((C6936e) c1195e.f36443e).f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c1195e.m490e().edit();
        edit.remove((String) this.f18315e);
        edit.remove((String) this.f18317e);
        edit.putLong((String) this.f18316e, currentTimeMillis);
        edit.apply();
    }

    @Override // defpackage.InterfaceC8632e
    public InterfaceC16883e subscription() {
        long ptr$cinterop_release = ((LongPointerWrapper) ((NativePointer) this.f18315e)).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C16389e(new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null), this.f18318e, (InterfaceC7227e) this.f18314e, (C17974e) this.f18317e);
    }

    @Override // defpackage.InterfaceC10645e
    public void vip(int i, C11858e c11858e) {
        Bundle bundle = c11858e.metrica;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        C13391e c13391e = ((C5537e) this.f18314e).amazon;
        String str = c11858e.vip;
        c13391e.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((C2584e) c13391e.f26645e).ad.sendSessionEvent(str, bundle);
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
        if (this != ((C5537e) ((C9156e) this.f18314e).f18314e).pro) {
            return;
        }
        AbstractC2803e.smaato("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }
}
