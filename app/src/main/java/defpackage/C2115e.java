package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2115e extends AbstractC8712e {
    public final String purchase;

    public C2115e(String str) {
        this.purchase = str;
    }

    @Override // defpackage.AbstractC8712e
    public final String appmetrica() {
        yandex('\"');
        int i = this.vip;
        String str = this.purchase;
        int m1865interface = AbstractC5304e.m1865interface(str, '\"', i, 4);
        if (m1865interface == -1) {
            advert();
            int i2 = this.vip;
            AbstractC8712e.admob(this, AbstractC5087e.m1746extends("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < m1865interface; i3++) {
            if (str.charAt(i3) == '\\') {
                return mopub(this.vip, i3, str);
            }
        }
        this.vip = m1865interface + 1;
        return str.substring(i, m1865interface);
    }

    @Override // defpackage.AbstractC8712e
    public final int isPro(int i) {
        if (i < this.purchase.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.AbstractC8712e
    public boolean metrica() {
        int i = this.vip;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.purchase;
            if (i >= str.length()) {
                this.vip = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.vip = i;
                return AbstractC8712e.signatures(charAt);
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC8712e
    public int premium() {
        char charAt;
        int i = this.vip;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.purchase;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.vip = i;
        return i;
    }

    @Override // defpackage.AbstractC8712e
    public byte purchase() {
        String str;
        int i = this.vip;
        while (true) {
            str = this.purchase;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.vip = i2;
                return AbstractC7700e.vip(charAt);
            }
            i = i2;
        }
        this.vip = str.length();
        return (byte) 10;
    }

    @Override // defpackage.AbstractC8712e
    public final CharSequence remoteconfig() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC8712e
    public final String tapsense(String str, boolean z) {
        int i = this.vip;
        try {
            if (purchase() == 6 && AbstractC7890e.billing(inmobi(z), str)) {
                this.license = null;
                if (purchase() == 5) {
                    return inmobi(z);
                }
            }
            return null;
        } finally {
            this.vip = i;
            this.license = null;
        }
    }

    @Override // defpackage.AbstractC8712e
    public void yandex(char c) {
        int i = this.vip;
        if (i == -1) {
            m2471class(c);
            throw null;
        }
        while (true) {
            String str = this.purchase;
            if (i >= str.length()) {
                this.vip = -1;
                m2471class(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.vip = i2;
                if (charAt == c) {
                    return;
                }
                m2471class(c);
                throw null;
            }
            i = i2;
        }
    }
}
