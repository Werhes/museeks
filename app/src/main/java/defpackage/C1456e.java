package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: eؒۥۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1456e extends AbstractC15853e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final BigInteger f4292e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final BigInteger f4293e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final BigInteger f4294e;

    public C1456e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(3);
        this.f4294e = bigInteger;
        this.f4293e = bigInteger2;
        this.f4292e = bigInteger3;
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e Signature() {
        BigInteger bigInteger = this.f4292e;
        BigInteger bigInteger2 = this.f4294e;
        return new C1456e(bigInteger2, this.f4293e, AbstractC5907e.startapp(bigInteger2, bigInteger));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ad(AbstractC7861e abstractC7861e) {
        BigInteger add = this.f4292e.add(abstractC7861e.firebase());
        BigInteger bigInteger = this.f4294e;
        if (add.compareTo(bigInteger) >= 0) {
            add = add.subtract(bigInteger);
        }
        return new C1456e(bigInteger, this.f4293e, add);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e ads(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2) {
        BigInteger firebase = abstractC7861e.firebase();
        BigInteger firebase2 = abstractC7861e2.firebase();
        BigInteger bigInteger = this.f4292e;
        return new C1456e(this.f4294e, this.f4293e, m611interface(bigInteger.multiply(bigInteger).add(firebase.multiply(firebase2))));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e applovin() {
        BigInteger bigInteger = this.f4292e;
        return new C1456e(this.f4294e, this.f4293e, m610class(bigInteger, bigInteger));
    }

    /* renamed from: class, reason: not valid java name */
    public final BigInteger m610class(BigInteger bigInteger, BigInteger bigInteger2) {
        return m611interface(bigInteger.multiply(bigInteger2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1456e)) {
            return false;
        }
        C1456e c1456e = (C1456e) obj;
        return this.f4294e.equals(c1456e.f4294e) && this.f4292e.equals(c1456e.f4292e);
    }

    @Override // defpackage.AbstractC7861e
    public final BigInteger firebase() {
        return this.f4292e;
    }

    public final int hashCode() {
        return this.f4294e.hashCode() ^ this.f4292e.hashCode();
    }

    /* renamed from: interface, reason: not valid java name */
    public final BigInteger m611interface(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.f4294e;
        BigInteger bigInteger3 = this.f4293e;
        if (bigInteger3 == null) {
            return bigInteger.mod(bigInteger2);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        int bitLength = bigInteger2.bitLength();
        boolean equals = bigInteger3.equals(InterfaceC4563e.Signature);
        while (bigInteger.bitLength() > bitLength + 1) {
            BigInteger shiftRight = bigInteger.shiftRight(bitLength);
            BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
            if (!equals) {
                shiftRight = shiftRight.multiply(bigInteger3);
            }
            bigInteger = shiftRight.add(subtract);
        }
        while (bigInteger.compareTo(bigInteger2) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger2);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e isPro() {
        BigInteger bigInteger;
        if (subscription() || admob()) {
            return this;
        }
        BigInteger bigInteger2 = this.f4294e;
        int i = 0;
        if (!bigInteger2.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        int i2 = 1;
        boolean testBit = bigInteger2.testBit(1);
        AbstractC7861e abstractC7861e = null;
        BigInteger bigInteger3 = this.f4293e;
        BigInteger bigInteger4 = this.f4292e;
        BigInteger bigInteger5 = InterfaceC4563e.Signature;
        if (testBit) {
            C1456e c1456e = new C1456e(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
            if (c1456e.applovin().equals(this)) {
                return c1456e;
            }
            return null;
        }
        boolean testBit2 = bigInteger2.testBit(2);
        BigInteger bigInteger6 = InterfaceC4563e.admob;
        if (testBit2) {
            BigInteger modPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
            BigInteger m610class = m610class(modPow, bigInteger4);
            if (m610class(m610class, modPow).equals(bigInteger5)) {
                C1456e c1456e2 = new C1456e(bigInteger2, bigInteger3, m610class);
                if (c1456e2.applovin().equals(this)) {
                    return c1456e2;
                }
                return null;
            }
            C1456e c1456e3 = new C1456e(bigInteger2, bigInteger3, m611interface(m610class.multiply(bigInteger6.modPow(bigInteger2.shiftRight(2), bigInteger2))));
            if (c1456e3.applovin().equals(this)) {
                return c1456e3;
            }
            return null;
        }
        BigInteger shiftRight = bigInteger2.shiftRight(1);
        if (!bigInteger4.modPow(shiftRight, bigInteger2).equals(bigInteger5)) {
            return null;
        }
        BigInteger shiftLeft = bigInteger4.shiftLeft(1);
        if (shiftLeft.compareTo(bigInteger2) >= 0) {
            shiftLeft = shiftLeft.subtract(bigInteger2);
        }
        BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
        if (shiftLeft2.compareTo(bigInteger2) >= 0) {
            shiftLeft2 = shiftLeft2.subtract(bigInteger2);
        }
        BigInteger add = shiftRight.add(bigInteger5);
        BigInteger subtract = bigInteger2.subtract(bigInteger5);
        Random random = new Random();
        while (true) {
            AbstractC7861e abstractC7861e2 = abstractC7861e;
            BigInteger bigInteger7 = new BigInteger(bigInteger2.bitLength(), random);
            if (bigInteger7.compareTo(bigInteger2) >= 0 || !m611interface(bigInteger7.multiply(bigInteger7).subtract(shiftLeft2)).modPow(shiftRight, bigInteger2).equals(subtract)) {
                abstractC7861e = abstractC7861e2;
                bigInteger6 = bigInteger6;
            } else {
                int bitLength = add.bitLength();
                int i3 = i;
                int lowestSetBit = add.getLowestSetBit();
                int i4 = bitLength - i2;
                BigInteger bigInteger8 = shiftRight;
                BigInteger bigInteger9 = bigInteger5;
                BigInteger bigInteger10 = bigInteger9;
                BigInteger bigInteger11 = bigInteger10;
                BigInteger bigInteger12 = bigInteger6;
                Random random2 = random;
                BigInteger bigInteger13 = bigInteger7;
                while (true) {
                    bigInteger = subtract;
                    if (i4 < lowestSetBit + 1) {
                        break;
                    }
                    bigInteger11 = m610class(bigInteger11, bigInteger9);
                    if (add.testBit(i4)) {
                        bigInteger9 = m610class(bigInteger11, bigInteger4);
                        BigInteger m610class2 = m610class(bigInteger10, bigInteger13);
                        bigInteger6 = m611interface(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger11)));
                        bigInteger13 = m611interface(bigInteger13.multiply(bigInteger13).subtract(bigInteger9.shiftLeft(1)));
                        bigInteger10 = m610class2;
                    } else {
                        BigInteger m611interface = m611interface(bigInteger10.multiply(bigInteger6).subtract(bigInteger11));
                        BigInteger m611interface2 = m611interface(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger11)));
                        bigInteger6 = m611interface(bigInteger6.multiply(bigInteger6).subtract(bigInteger11.shiftLeft(1)));
                        bigInteger13 = m611interface2;
                        bigInteger10 = m611interface;
                        bigInteger9 = bigInteger11;
                    }
                    i4--;
                    subtract = bigInteger;
                }
                BigInteger m610class3 = m610class(bigInteger11, bigInteger9);
                BigInteger m610class4 = m610class(m610class3, bigInteger4);
                BigInteger m611interface3 = m611interface(bigInteger10.multiply(bigInteger6).subtract(m610class3));
                BigInteger m611interface4 = m611interface(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(m610class3)));
                BigInteger m611interface5 = m611interface(m610class3.multiply(m610class4));
                for (int i5 = 1; i5 <= lowestSetBit; i5++) {
                    m611interface3 = m610class(m611interface3, m611interface4);
                    m611interface4 = m611interface(m611interface4.multiply(m611interface4).subtract(m611interface5.shiftLeft(1)));
                    m611interface5 = m611interface(m611interface5.multiply(m611interface5));
                }
                BigInteger[] bigIntegerArr = new BigInteger[2];
                bigIntegerArr[i3] = m611interface3;
                bigIntegerArr[1] = m611interface4;
                BigInteger bigInteger14 = bigIntegerArr[i3];
                BigInteger bigInteger15 = bigIntegerArr[1];
                if (m610class(bigInteger15, bigInteger15).equals(shiftLeft2)) {
                    if (bigInteger15.testBit(i3)) {
                        bigInteger15 = bigInteger2.subtract(bigInteger15);
                    }
                    return new C1456e(bigInteger2, bigInteger3, bigInteger15.shiftRight(1));
                }
                if (bigInteger14.equals(bigInteger5)) {
                    i = i3;
                    i2 = 1;
                    abstractC7861e = abstractC7861e2;
                    shiftRight = bigInteger8;
                    bigInteger6 = bigInteger12;
                    random = random2;
                    subtract = bigInteger;
                } else {
                    if (!bigInteger14.equals(bigInteger)) {
                        return abstractC7861e2;
                    }
                    subtract = bigInteger;
                    i = i3;
                    i2 = 1;
                    abstractC7861e = abstractC7861e2;
                    shiftRight = bigInteger8;
                    bigInteger6 = bigInteger12;
                    random = random2;
                }
            }
        }
    }

    @Override // defpackage.AbstractC7861e
    public final int loadAd() {
        return this.f4294e.bitLength();
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e pro(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return new C1456e(this.f4294e, this.f4293e, m611interface(this.f4292e.multiply(abstractC7861e.firebase()).subtract(abstractC7861e2.firebase().multiply(abstractC7861e3.firebase()))));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e remoteconfig(AbstractC7861e abstractC7861e) {
        return new C1456e(this.f4294e, this.f4293e, m610class(this.f4292e, abstractC7861e.firebase()));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e signatures(AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e abstractC7861e3) {
        return new C1456e(this.f4294e, this.f4293e, m611interface(this.f4292e.multiply(abstractC7861e.firebase()).add(abstractC7861e2.firebase().multiply(abstractC7861e3.firebase()))));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e subs(AbstractC7861e abstractC7861e) {
        BigInteger subtract = this.f4292e.subtract(abstractC7861e.firebase());
        int signum = subtract.signum();
        BigInteger bigInteger = this.f4294e;
        if (signum < 0) {
            subtract = subtract.add(bigInteger);
        }
        return new C1456e(bigInteger, this.f4293e, subtract);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e tapsense() {
        BigInteger bigInteger = this.f4292e;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.f4293e;
        BigInteger bigInteger3 = this.f4294e;
        return new C1456e(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e vip() {
        BigInteger add = this.f4292e.add(InterfaceC4563e.Signature);
        BigInteger bigInteger = this.f4294e;
        if (add.compareTo(bigInteger) == 0) {
            add = InterfaceC4563e.loadAd;
        }
        return new C1456e(bigInteger, this.f4293e, add);
    }

    @Override // defpackage.AbstractC7861e
    public final AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        BigInteger firebase = abstractC7861e.firebase();
        BigInteger bigInteger = this.f4294e;
        return new C1456e(bigInteger, this.f4293e, m610class(this.f4292e, AbstractC5907e.startapp(bigInteger, firebase)));
    }
}
