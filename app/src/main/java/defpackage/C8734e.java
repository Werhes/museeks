package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8734e implements InterfaceC2029e, InterfaceC3726e, InterfaceC5374e {
    public final C11054e ad;
    public final Integer license;
    public final Integer metrica;
    public Integer vip;

    public /* synthetic */ C8734e() {
        this(new C11054e(null, null), null, null, null);
    }

    public C8734e(C11054e c11054e, Integer num, Integer num2, Integer num3) {
        this.ad = c11054e;
        this.vip = num;
        this.metrica = num2;
        this.license = num3;
    }

    @Override // defpackage.InterfaceC5374e
    public final Object ad() {
        C11054e c11054e = this.ad;
        return new C8734e(new C11054e(c11054e.ad, c11054e.vip), this.vip, this.metrica, this.license);
    }

    @Override // defpackage.InterfaceC2029e
    public final void adcel(Integer num) {
        this.ad.ad = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8734e)) {
            return false;
        }
        C8734e c8734e = (C8734e) obj;
        return AbstractC7890e.billing(this.ad, c8734e.ad) && AbstractC7890e.billing(this.vip, c8734e.vip) && AbstractC7890e.billing(this.metrica, c8734e.metrica) && AbstractC7890e.billing(this.license, c8734e.license);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 29791;
        Integer num = this.vip;
        int hashCode2 = ((num != null ? num.hashCode() : 0) * 961) + hashCode;
        Integer num2 = this.metrica;
        int hashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + hashCode2;
        Integer num3 = this.license;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC2029e
    public final void metrica(Integer num) {
        this.ad.vip = num;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer mopub() {
        return this.ad.vip;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer purchase() {
        return this.ad.ad;
    }

    @Override // defpackage.InterfaceC3726e
    public final void startapp(Integer num) {
        this.vip = num;
    }

    public final String toString() {
        Integer num = this.license;
        C11054e c11054e = this.ad;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c11054e);
            sb.append('-');
            Object obj = this.vip;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Object obj2 = this.metrica;
            sb.append(obj2 != null ? obj2 : "??");
            sb.append(')');
            return sb.toString();
        }
        if (this.vip == null && c11054e.vip == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj3 = c11054e.ad;
            if (obj3 == null) {
                obj3 = "??";
            }
            sb2.append(obj3);
            sb2.append(")-");
            sb2.append(this.license);
            sb2.append(" (day of week is ");
            Object obj4 = this.metrica;
            sb2.append(obj4 != null ? obj4 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c11054e);
        sb3.append('-');
        Object obj5 = this.vip;
        if (obj5 == null) {
            obj5 = "??";
        }
        sb3.append(obj5);
        sb3.append(" (day of week is ");
        Object obj6 = this.metrica;
        sb3.append(obj6 != null ? obj6 : "??");
        sb3.append(", day of year is ");
        sb3.append(this.license);
        sb3.append(')');
        return sb3.toString();
    }

    public final C13084e vip() {
        C13084e c13084e;
        C11054e c11054e = this.ad;
        Integer num = c11054e.ad;
        AbstractC10763e.ad(num, "year");
        int intValue = num.intValue();
        Integer num2 = this.license;
        if (num2 == null) {
            Integer num3 = c11054e.vip;
            AbstractC10763e.ad(num3, "monthNumber");
            int intValue2 = num3.intValue();
            Integer num4 = this.vip;
            AbstractC10763e.ad(num4, "day");
            c13084e = new C13084e(intValue, intValue2, num4.intValue());
        } else {
            C13084e c13084e2 = new C13084e(intValue, 1, 1);
            int intValue3 = num2.intValue() - 1;
            AbstractC0894e.Companion.getClass();
            C14076e c14076e = AbstractC0894e.vip;
            long j = intValue3;
            int i = AbstractC5362e.metrica;
            C14076e c14076e2 = c14076e != null ? 1 : null;
            LocalDate localDate = c13084e2.f26019e;
            try {
                if (c14076e2 == null) {
                    throw new C14803e(10);
                }
                try {
                    long license = AbstractC3752e.license(j, c14076e.metrica);
                    long epochDay = localDate.toEpochDay();
                    long j2 = epochDay + license;
                    if (!((epochDay ^ j2) >= 0) && !(((license ^ epochDay) > 0 ? 1 : ((license ^ epochDay) == 0 ? 0 : -1)) < 0)) {
                        throw new ArithmeticException();
                    }
                    long j3 = AbstractC5362e.ad;
                    if (j2 > AbstractC5362e.vip || j3 > j2) {
                        throw new DateTimeException("The resulting day " + j2 + " is out of supported LocalDate range.");
                    }
                    LocalDate ofEpochDay = LocalDate.ofEpochDay(j2);
                    C13084e c13084e3 = new C13084e(ofEpochDay);
                    if (ofEpochDay.getYear() != intValue) {
                        throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue);
                    }
                    if (c11054e.vip != null) {
                        int ordinal = c13084e3.ad().ordinal() + 1;
                        Integer num5 = c11054e.vip;
                        if (num5 == null || ordinal != num5.intValue()) {
                            throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is " + c13084e3.ad() + ", but " + c11054e.vip + " was specified as the month number");
                        }
                    }
                    if (this.vip != null) {
                        int dayOfMonth = ofEpochDay.getDayOfMonth();
                        Integer num6 = this.vip;
                        if (num6 == null || dayOfMonth != num6.intValue()) {
                            throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is the day " + ofEpochDay.getDayOfMonth() + " of " + c13084e3.ad() + ", but " + this.vip + " was specified as the day of month");
                        }
                    }
                    c13084e = c13084e3;
                } catch (Exception e) {
                    e = e;
                    c14076e2 = c14076e;
                    if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                        throw e;
                    }
                    throw new C14803e(1, "The result of adding " + j + " of " + c14076e2 + " to " + c13084e2 + " is out of LocalDate range.", e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        Integer num7 = this.metrica;
        if (num7 != null) {
            int intValue4 = num7.intValue();
            LocalDate localDate2 = c13084e.f26019e;
            int value = localDate2.getDayOfWeek().getValue() - 1;
            C15937e c15937e = EnumC5467e.f11735e;
            if (intValue4 != ((EnumC5467e) c15937e.get(value)).ordinal() + 1) {
                StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > intValue4 || intValue4 >= 8) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(intValue4, "Expected ISO day-of-week number in 1..7, got ").toString());
                }
                sb.append((EnumC5467e) c15937e.get(intValue4 - 1));
                sb.append(" but the date is ");
                sb.append(c13084e);
                sb.append(", which is a ");
                sb.append((EnumC5467e) c15937e.get(localDate2.getDayOfWeek().getValue() - 1));
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return c13084e;
    }

    @Override // defpackage.InterfaceC3726e
    public final Integer yandex() {
        return this.vip;
    }
}
