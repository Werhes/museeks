package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11268e extends AbstractC5604e implements InterfaceC18435e, InterfaceC9392e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public AbstractC16049e f22629e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public ArrayList f22630e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f22631e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C12344e f22632e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final AbstractC16994e f22633e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C17651e f22634e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function1 f22635e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final InterfaceC1686e f22636e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final InterfaceC8370e f22637e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Function0 f22638e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f22639e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f22640e;

    public C11268e(boolean z, boolean z2, int i, InterfaceC1686e interfaceC1686e, Function0 function0, InterfaceC8370e interfaceC8370e, int i2) {
        AbstractC16994e c6474e;
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        i = (i2 & 4) != 0 ? 4 : i;
        C12344e c12344e = null;
        interfaceC1686e = (i2 & 8) != 0 ? null : interfaceC1686e;
        function0 = (i2 & 16) != 0 ? null : function0;
        boolean z3 = (i2 & 32) == 0;
        interfaceC8370e = (i2 & 64) != 0 ? null : interfaceC8370e;
        this.f22640e = AbstractC9743e.vip();
        this.f22639e = i;
        this.f22636e = interfaceC1686e;
        this.f22638e = function0;
        this.f22631e = z3;
        this.f22637e = interfaceC8370e;
        this.f22630e = new ArrayList();
        this.f22634e = AbstractC12751e.ad();
        if (i == 5) {
            if (interfaceC8370e != null) {
                try {
                    c12344e = interfaceC8370e.startapp();
                } catch (IllegalStateException unused) {
                }
            }
            this.f22632e = c12344e;
            if (c12344e != null) {
                c12344e.f24751e = this;
            }
        }
        int m2467class = AbstractC8703e.m2467class(this.f22639e);
        if (m2467class == 0) {
            c6474e = new C6474e(1);
        } else if (m2467class == 1 || m2467class == 2) {
            c6474e = new C6474e(0);
        } else if (m2467class == 3) {
            c6474e = new C11710e(z, z2, this.f22631e);
        } else {
            if (m2467class != 4) {
                throw new C14803e(10);
            }
            c6474e = new AbstractC16994e(2);
        }
        this.f22633e = c6474e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: class, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3186class(defpackage.C11268e r6, java.util.List r7, defpackage.AbstractC10731e r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.C7064e
            if (r0 == 0) goto L16
            r0 = r8
            eُؚ r0 = (defpackage.C7064e) r0
            int r1 = r0.f14492e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14492e = r1
            goto L1b
        L16:
            eُؚ r0 = new eُؚ
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f14495e
            int r1 = r0.f14492e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            eُٜۛ r7 = r0.f14491e
            java.util.List r0 = r0.f14493e
            defpackage.AbstractC2003e.purchase(r8)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r8)
            eّٕٓ r8 = defpackage.AbstractC6731e.ad
            eْؐؔ r8 = defpackage.AbstractC1497e.ad
            eَٔۘ r1 = new eَٔۘ
            r3 = 2
            r4 = 13
            r5 = 0
            r1.<init>(r3, r4, r5)
            r0.f14493e = r7
            r0.f14491e = r6
            r0.f14492e = r2
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r8, r1, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r8 != r0) goto L53
            return r0
        L53:
            r0 = r7
            r7 = r6
        L55:
            eؙٖۛ r8 = (defpackage.AbstractC16049e) r8
            r7.f22629e = r8
            if (r0 != 0) goto L5d
            eْۨٝ r0 = defpackage.C13664e.f27089e
        L5d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6.f22630e = r7
            super.firebase(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11268e.m3186class(eُٜۛ, java.util.List, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC9392e
    public final void ad(int i) {
        C13029e c13029e;
        C1847e c1847e = this.f11959e;
        AudioTrack audioTrack = (AudioTrack) AbstractC13480e.m3592native(i, c1847e.purchase);
        if (audioTrack == null) {
            return;
        }
        if (i == 0) {
            c13029e = new C13029e(audioTrack, Integer.valueOf(((AudioTrack) c1847e.purchase.get(1)).vip), (Integer) null, 4);
        } else if (i == AbstractC6874e.billing(c1847e.purchase)) {
            List list = c1847e.purchase;
            c13029e = new C13029e(audioTrack, (Integer) null, Integer.valueOf(((AudioTrack) list.get(AbstractC6874e.billing(list) - 1)).vip), 2);
        } else {
            c13029e = new C13029e(audioTrack, (Integer) null, Integer.valueOf(((AudioTrack) c1847e.purchase.get(i - 1)).vip), 2);
        }
        AbstractC18406e.appmetrica(c13029e);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f22640e.f29359e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void applovin(loadAd loadad) {
        this.f22633e.smaato(((C5272e) loadad).signatures);
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return this.f22633e.startapp();
    }

    @Override // defpackage.AbstractC5604e
    public final void firebase(List list) {
        if (this.f22629e == null && list != null) {
            C15420e c15420e = AbstractC6731e.ad;
            AbstractC5336e.purchase(this, AbstractC1497e.ad, 0, new C18474e(this, null, 27), 2);
        }
        if (list == null) {
            list = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(list);
        this.f22630e = arrayList;
        super.firebase(arrayList);
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3187goto(C17510e c17510e) {
        AbstractC5336e.purchase(this, AbstractC6731e.ad, 0, new C17184e(this, c17510e, null), 2);
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3188interface(C12920e c12920e) {
        AbstractC5336e.purchase(this, AbstractC6731e.ad, 0, new C7908e(this, c12920e, null), 2);
    }

    @Override // defpackage.InterfaceC9392e
    public final boolean metrica() {
        if (this.f22639e == 5) {
            C12344e c12344e = this.f22632e;
            if (!(c12344e != null ? c12344e.f24750e : false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5604e
    public final void premium(int i, Object obj, final InterfaceC10283e interfaceC10283e, C5272e c5272e) {
        final AudioTrack audioTrack = (AudioTrack) obj;
        if (!metrica()) {
            interfaceC10283e.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: eٌؗۤ
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i2 = C3566e.f8039e;
                    AbstractC0890e.appmetrica(audioTrack, C11268e.this.f22638e).signatures((Activity) interfaceC10283e.getRoot().getContext());
                    return true;
                }
            });
        }
        interfaceC10283e.getRoot().setOnClickListener(new ViewOnClickListenerC10470e(this, audioTrack, c5272e, interfaceC10283e, 1));
        int i2 = this.f22639e;
        AbstractC16994e abstractC16994e = this.f22633e;
        if (i2 != 5) {
            List list = this.f11959e.purchase;
            abstractC16994e.metrica(interfaceC10283e, audioTrack, i);
        } else {
            if ((abstractC16994e instanceof C12595e ? (C12595e) abstractC16994e : null) != null) {
                C12595e.loadAd((C15415e) interfaceC10283e, audioTrack, i, this.f22632e, new C16200e(this, c5272e, 6));
            }
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void pro(loadAd loadad, int i, List list) {
        C5272e c5272e = (C5272e) loadad;
        if (list.isEmpty()) {
            remoteconfig(c5272e, i);
            return;
        }
        InterfaceC10283e interfaceC10283e = c5272e.signatures;
        Object obj = list.get(0);
        AbstractC16994e abstractC16994e = this.f22633e;
        abstractC16994e.getClass();
        AbstractC9080e abstractC9080e = obj instanceof AbstractC9080e ? (AbstractC9080e) obj : null;
        if (abstractC9080e == null) {
            return;
        }
        ImageView amazon = abstractC16994e.amazon(interfaceC10283e);
        if (abstractC9080e instanceof C16504e) {
            amazon.setVisibility(8);
            amazon.setActivated(false);
            abstractC16994e.vip(interfaceC10283e, false);
            return;
        }
        if (!(abstractC9080e instanceof C7827e) && !(abstractC9080e instanceof C8153e)) {
            throw new C14803e(10);
        }
        AbstractC16049e abstractC16049e = abstractC9080e.ad;
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        C14609e vip = c7838e.vip();
        if (AbstractC7890e.billing(abstractC16049e, vip != null ? vip.vip : null)) {
            amazon.setVisibility(0);
            amazon.setActivated(abstractC9080e instanceof C8153e);
            abstractC16994e.vip(interfaceC10283e, true);
        } else if (amazon.getVisibility() != 8) {
            amazon.setVisibility(8);
            amazon.setActivated(false);
            abstractC16994e.vip(interfaceC10283e, false);
        }
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f22633e.purchase(layoutInflater, viewGroup);
    }

    @Override // defpackage.InterfaceC9392e
    public final void vip(int i, int i2) {
        Collections.swap(this.f22630e, i, i2);
        smaato(i, i2);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final long yandex(int i) {
        return ((AudioTrack) this.f11959e.purchase.get(i)).hashCode();
    }
}
