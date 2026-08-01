package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16694e extends AbstractC18109e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public boolean f32750e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public boolean f32751e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public ArrayList f32752e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public int f32753e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public AbstractC18109e[] f32754e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public int f32755e;

    @Override // defpackage.AbstractC18109e
    /* renamed from: adcel */
    public final AbstractC18109e clone() {
        C16694e c16694e = (C16694e) super.clone();
        c16694e.f32752e = new ArrayList();
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            AbstractC18109e clone = ((AbstractC18109e) this.f32752e.get(i)).clone();
            c16694e.f32752e.add(clone);
            clone.f35526e = c16694e;
        }
        return c16694e;
    }

    @Override // defpackage.AbstractC18109e
    public final AbstractC18109e ads(InterfaceC10190e interfaceC10190e) {
        super.ads(interfaceC10190e);
        return this;
    }

    @Override // defpackage.AbstractC18109e
    public final void applovin() {
        this.f35525e = 0L;
        int i = 0;
        C18115e c18115e = new C18115e(this, i);
        while (i < this.f32752e.size()) {
            AbstractC18109e abstractC18109e = (AbstractC18109e) this.f32752e.get(i);
            abstractC18109e.ad(c18115e);
            abstractC18109e.applovin();
            long j = abstractC18109e.f35525e;
            if (this.f32751e) {
                this.f35525e = Math.max(this.f35525e, j);
            } else {
                long j2 = this.f35525e;
                abstractC18109e.f35527e = j2;
                this.f35525e = j2 + j;
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC18109e
    public final void billing(C4314e c4314e) {
        View view = c4314e.vip;
        if (tapsense(view)) {
            Iterator it = this.f32752e.iterator();
            while (it.hasNext()) {
                AbstractC18109e abstractC18109e = (AbstractC18109e) it.next();
                if (abstractC18109e.tapsense(view)) {
                    abstractC18109e.billing(c4314e);
                    c4314e.metrica.add(abstractC18109e);
                }
            }
        }
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: class, reason: not valid java name */
    public final void mo4169class(AbstractC12681e abstractC12681e) {
        this.f32755e |= 8;
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18109e) this.f32752e.get(i)).mo4169class(abstractC12681e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC18109e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void crashlytics(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16694e.crashlytics(long, long):void");
    }

    @Override // defpackage.AbstractC18109e
    public final void firebase(long j) {
        ArrayList arrayList;
        this.f35511e = j;
        if (j < 0 || (arrayList = this.f32752e) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18109e) this.f32752e.get(i)).firebase(j);
        }
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: goto, reason: not valid java name */
    public final void mo4170goto(C7249e c7249e) {
        super.mo4170goto(c7249e);
        this.f32755e |= 4;
        if (this.f32752e != null) {
            for (int i = 0; i < this.f32752e.size(); i++) {
                ((AbstractC18109e) this.f32752e.get(i)).mo4170goto(c7249e);
            }
        }
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: interface, reason: not valid java name */
    public final void mo4171interface(TimeInterpolator timeInterpolator) {
        this.f32755e |= 1;
        ArrayList arrayList = this.f32752e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC18109e) this.f32752e.get(i)).mo4171interface(timeInterpolator);
            }
        }
        this.f35524e = timeInterpolator;
    }

    @Override // defpackage.AbstractC18109e
    public final void isPro(View view) {
        super.isPro(view);
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18109e) this.f32752e.get(i)).isPro(view);
        }
    }

    @Override // defpackage.AbstractC18109e
    public final void license(C4314e c4314e) {
        View view = c4314e.vip;
        if (tapsense(view)) {
            Iterator it = this.f32752e.iterator();
            while (it.hasNext()) {
                AbstractC18109e abstractC18109e = (AbstractC18109e) it.next();
                if (abstractC18109e.tapsense(view)) {
                    abstractC18109e.license(c4314e);
                    c4314e.metrica.add(abstractC18109e);
                }
            }
        }
    }

    @Override // defpackage.AbstractC18109e
    public final void metrica() {
        super.metrica();
        AbstractC18109e[] abstractC18109eArr = this.f32754e;
        this.f32754e = null;
        if (abstractC18109eArr == null) {
            abstractC18109eArr = new AbstractC18109e[this.f32752e.size()];
        }
        AbstractC18109e[] abstractC18109eArr2 = (AbstractC18109e[]) this.f32752e.toArray(abstractC18109eArr);
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            abstractC18109eArr2[i].metrica();
        }
        Arrays.fill(abstractC18109eArr2, (Object) null);
        this.f32754e = abstractC18109eArr2;
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: native, reason: not valid java name */
    public final void mo4172native(long j) {
        this.f35516e = j;
    }

    @Override // defpackage.AbstractC18109e
    public final void premium(View view) {
        super.premium(view);
        AbstractC18109e[] abstractC18109eArr = this.f32754e;
        this.f32754e = null;
        if (abstractC18109eArr == null) {
            abstractC18109eArr = new AbstractC18109e[this.f32752e.size()];
        }
        AbstractC18109e[] abstractC18109eArr2 = (AbstractC18109e[]) this.f32752e.toArray(abstractC18109eArr);
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            abstractC18109eArr2[i].premium(view);
        }
        Arrays.fill(abstractC18109eArr2, (Object) null);
        this.f32754e = abstractC18109eArr2;
    }

    @Override // defpackage.AbstractC18109e
    public final boolean pro() {
        for (int i = 0; i < this.f32752e.size(); i++) {
            if (((AbstractC18109e) this.f32752e.get(i)).pro()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC18109e
    public final void purchase(C4314e c4314e) {
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18109e) this.f32752e.get(i)).purchase(c4314e);
        }
    }

    @Override // defpackage.AbstractC18109e
    public final void smaato(ViewGroup viewGroup, C11980e c11980e, C11980e c11980e2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f35516e;
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            AbstractC18109e abstractC18109e = (AbstractC18109e) this.f32752e.get(i);
            if (j > 0 && (this.f32751e || i == 0)) {
                long j2 = abstractC18109e.f35516e;
                if (j2 > 0) {
                    abstractC18109e.mo4172native(j2 + j);
                } else {
                    abstractC18109e.mo4172native(j);
                }
            }
            abstractC18109e.smaato(viewGroup, c11980e, c11980e2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC18109e
    public final void subs() {
        if (this.f32752e.isEmpty()) {
            m4473extends();
            amazon();
            return;
        }
        C18115e c18115e = new C18115e();
        c18115e.vip = this;
        Iterator it = this.f32752e.iterator();
        while (it.hasNext()) {
            ((AbstractC18109e) it.next()).ad(c18115e);
        }
        this.f32753e = this.f32752e.size();
        if (this.f32751e) {
            Iterator it2 = this.f32752e.iterator();
            while (it2.hasNext()) {
                ((AbstractC18109e) it2.next()).subs();
            }
            return;
        }
        for (int i = 1; i < this.f32752e.size(); i++) {
            ((AbstractC18109e) this.f32752e.get(i - 1)).ad(new C18115e((AbstractC18109e) this.f32752e.get(i), 2));
        }
        AbstractC18109e abstractC18109e = (AbstractC18109e) this.f32752e.get(0);
        if (abstractC18109e != null) {
            abstractC18109e.subs();
        }
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: this, reason: not valid java name */
    public final void mo4173this() {
        this.f32755e |= 2;
        int size = this.f32752e.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18109e) this.f32752e.get(i)).mo4173this();
        }
    }

    @Override // defpackage.AbstractC18109e
    /* renamed from: throw, reason: not valid java name */
    public final String mo4174throw(String str) {
        String mo4174throw = super.mo4174throw(str);
        for (int i = 0; i < this.f32752e.size(); i++) {
            StringBuilder isPro = AbstractC8703e.isPro(mo4174throw, "\n");
            isPro.append(((AbstractC18109e) this.f32752e.get(i)).mo4174throw(str + "  "));
            mo4174throw = isPro.toString();
        }
        return mo4174throw;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m4175while(AbstractC18109e abstractC18109e) {
        this.f32752e.add(abstractC18109e);
        abstractC18109e.f35526e = this;
        long j = this.f35511e;
        if (j >= 0) {
            abstractC18109e.firebase(j);
        }
        if ((this.f32755e & 1) != 0) {
            abstractC18109e.mo4171interface(this.f35524e);
        }
        if ((this.f32755e & 2) != 0) {
            abstractC18109e.mo4173this();
        }
        if ((this.f32755e & 4) != 0) {
            abstractC18109e.mo4170goto(this.f35522e);
        }
        if ((this.f32755e & 8) != 0) {
            abstractC18109e.mo4169class(null);
        }
    }
}
