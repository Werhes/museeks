package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C15105e extends AbstractC8712e {
    public final char[] billing;
    public final InterfaceC2789e purchase;
    public final C4647e startapp;
    public int yandex = 128;

    public C15105e(InterfaceC2789e interfaceC2789e, char[] cArr) {
        this.purchase = interfaceC2789e;
        this.billing = cArr;
        this.startapp = new C4647e(cArr);
        m3919interface(0);
    }

    @Override // defpackage.AbstractC8712e
    public final void amazon() {
        int i = this.startapp.f9978e - this.vip;
        if (i > this.yandex) {
            return;
        }
        m3919interface(i);
    }

    @Override // defpackage.AbstractC8712e
    public final String appmetrica() {
        yandex('\"');
        int i = this.vip;
        C4647e c4647e = this.startapp;
        int i2 = c4647e.f9978e;
        char[] cArr = c4647e.f9979e;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int isPro = isPro(i);
            if (isPro != -1) {
                return mopub(this.vip, isPro, c4647e);
            }
            int i4 = this.vip;
            int i5 = i4 - 1;
            AbstractC8712e.admob(this, AbstractC5087e.m1746extends("Expected quotation mark '\"', but had '", (i4 == c4647e.f9978e || i5 < 0) ? "EOF" : String.valueOf(c4647e.f9979e[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return mopub(this.vip, i6, c4647e);
            }
        }
        this.vip = i3 + 1;
        return AbstractC6507e.startapp(cArr, i, Math.min(i3, c4647e.f9978e));
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3918goto() {
        C12557e c12557e = C12557e.metrica;
        c12557e.getClass();
        char[] cArr = this.billing;
        if (cArr.length == 16384) {
            c12557e.vip(cArr);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3919interface(int i) {
        C4647e c4647e = this.startapp;
        char[] cArr = c4647e.f9979e;
        if (i != 0) {
            int i2 = this.vip;
            AbstractC1660e.amazon(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = c4647e.f9978e;
        while (true) {
            if (i == i3) {
                break;
            }
            int mo1205e = this.purchase.mo1205e(cArr, i, i3 - i);
            if (mo1205e == -1) {
                c4647e.f9978e = Math.min(c4647e.f9979e.length, i);
                this.yandex = -1;
                break;
            }
            i += mo1205e;
        }
        this.vip = 0;
    }

    @Override // defpackage.AbstractC8712e
    public final int isPro(int i) {
        C4647e c4647e = this.startapp;
        if (i < c4647e.f9978e) {
            return i;
        }
        this.vip = i;
        amazon();
        return (this.vip != 0 || c4647e.length() == 0) ? -1 : 0;
    }

    @Override // defpackage.AbstractC8712e
    public boolean metrica() {
        amazon();
        int i = this.vip;
        while (true) {
            int isPro = isPro(i);
            if (isPro == -1) {
                this.vip = isPro;
                return false;
            }
            char c = this.startapp.f9979e[isPro];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.vip = isPro;
                return AbstractC8712e.signatures(c);
            }
            i = isPro + 1;
        }
    }

    @Override // defpackage.AbstractC8712e
    public int premium() {
        int isPro;
        char c;
        int i = this.vip;
        while (true) {
            isPro = isPro(i);
            if (isPro == -1 || !((c = this.startapp.f9979e[isPro]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = isPro + 1;
        }
        this.vip = isPro;
        return isPro;
    }

    @Override // defpackage.AbstractC8712e
    public byte purchase() {
        amazon();
        int i = this.vip;
        while (true) {
            int isPro = isPro(i);
            if (isPro == -1) {
                this.vip = isPro;
                return (byte) 10;
            }
            int i2 = isPro + 1;
            byte vip = AbstractC7700e.vip(this.startapp.f9979e[isPro]);
            if (vip != 3) {
                this.vip = i2;
                return vip;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC8712e
    public final CharSequence remoteconfig() {
        return this.startapp;
    }

    @Override // defpackage.AbstractC8712e
    public final String subs(int i, int i2) {
        C4647e c4647e = this.startapp;
        return AbstractC6507e.startapp(c4647e.f9979e, i, Math.min(i2, c4647e.f9978e));
    }

    @Override // defpackage.AbstractC8712e
    public final String tapsense(String str, boolean z) {
        return null;
    }

    @Override // defpackage.AbstractC8712e
    public final void vip(int i, int i2) {
        ((StringBuilder) this.appmetrica).append(this.startapp.f9979e, i, i2 - i);
    }

    @Override // defpackage.AbstractC8712e
    public void yandex(char c) {
        amazon();
        int i = this.vip;
        while (true) {
            int isPro = isPro(i);
            if (isPro == -1) {
                this.vip = isPro;
                m2471class(c);
                throw null;
            }
            int i2 = isPro + 1;
            char c2 = this.startapp.f9979e[isPro];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.vip = i2;
                if (c2 == c) {
                    return;
                }
                m2471class(c);
                throw null;
            }
            i = i2;
        }
    }
}
