package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.q;
import j$.time.temporal.ChronoField;
import j$.time.temporal.n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public ZoneRules(ZoneOffset zoneOffset) {
        this.b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        this.b = r0;
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.i()) {
                    arrayList.add(bVar.b);
                    arrayList.add(bVar.b.R(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                } else {
                    arrayList.add(bVar.b.R(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.i()) {
            if (localDateTime.O(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.O(bVar.b.R(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.O(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.O(bVar.b.R(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(j$.com.android.tools.r8.a.W(j2 + zoneOffset.getTotalSeconds(), 86400)).getYear();
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        LocalDate N;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) this.h.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.MIN;
            LocalDate of = LocalDate.of(i2 - 1, 12, 31);
            ChronoField.HOUR_OF_DAY.D(0);
            long z = j$.com.android.tools.r8.a.z(new LocalDateTime(of, LocalTime.f[0]), this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(z * 1000);
            long j4 = 31968000 + z;
            while (z < j4) {
                long j5 = z + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - z > j2) {
                        long W = j$.com.android.tools.r8.a.W(j5 + z, 2L);
                        if (this.g.getOffset(W * j6) == offset) {
                            z = W;
                        } else {
                            j5 = W;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(z * j6) == offset) {
                        z = j5;
                    }
                    ZoneOffset h = h(offset);
                    int offset2 = this.g.getOffset(z * j6);
                    ZoneOffset h2 = h(offset2);
                    if (c(z, h2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(z, h, h2);
                    }
                    offset = offset2;
                } else {
                    z = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            byte b = eVar.b;
            if (b < 0) {
                Month month = eVar.a;
                long j7 = i2;
                int N2 = month.N(q.c.K(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.MIN;
                ChronoField.YEAR.D(j7);
                Objects.requireNonNull(month, "month");
                ChronoField.DAY_OF_MONTH.D(N2);
                N = LocalDate.N(i2, month.getValue(), N2);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    N = N.j(new n(dayOfWeek.getValue(), i4));
                }
            } else {
                Month month2 = eVar.a;
                LocalDate localDate2 = LocalDate.MIN;
                ChronoField.YEAR.D(i2);
                Objects.requireNonNull(month2, "month");
                ChronoField.DAY_OF_MONTH.D(b);
                N = LocalDate.N(i2, month2.getValue(), b);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    N = N.j(new n(dayOfWeek2.getValue(), i3));
                }
            }
            if (eVar.e) {
                N = N.X(1L);
            }
            LocalDateTime of2 = LocalDateTime.of(N, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            dVar.getClass();
            int i6 = c.a[dVar.ordinal()];
            if (i6 == 1) {
                of2 = of2.R(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i6 == 2) {
                of2 = of2.R(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i5] = new b(of2, eVar.h, eVar.i);
            i5++;
            i3 = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            if (epochSecond > this.c[r7.length - 1]) {
                b[] b = b(c(epochSecond, this.e[r7.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < b.length; i2++) {
                    bVar = b[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int binarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r8.M(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r8.b.W() <= r0.b.W()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((ZoneOffset) e);
        }
        b bVar = (b) e;
        return bVar.i() ? Collections.EMPTY_LIST : j$.com.android.tools.r8.a.S(new Object[]{bVar.c, bVar.d});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            zoneOffset = this.b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.b[binarySearch + 1];
        }
        return !zoneOffset.equals(d(instant));
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        return e instanceof b ? ((b) e).c : (ZoneOffset) e;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public boolean isFixedOffset() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.g.getDSTSavings() != 0) {
                return false;
            }
            Instant now = Instant.now();
            b bVar2 = null;
            if (this.g != null) {
                long epochSecond = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int c = c(epochSecond, d(now));
                b[] b = b(c);
                int length = b.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = b[length];
                        if (epochSecond > bVar.a) {
                            break;
                        }
                        length--;
                    } else if (c > 1800) {
                        b[] b2 = b(c - 1);
                        for (int length2 = b2.length - 1; length2 >= 0; length2--) {
                            bVar = b2[length2];
                            if (epochSecond <= bVar.a) {
                            }
                        }
                        j$.time.a.b.getClass();
                        long min = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000);
                        int offset = this.g.getOffset((epochSecond - 1) * 1000);
                        long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                        while (true) {
                            if (epochDay > min) {
                                break;
                            }
                            int offset2 = this.g.getOffset(min * 1000);
                            if (offset != offset2) {
                                int c2 = c(min, h(offset2));
                                b[] b3 = b(c2 + 1);
                                int length3 = b3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        b[] b4 = b(c2);
                                        bVar2 = b4[b4.length - 1];
                                        break;
                                    }
                                    bVar2 = b3[length3];
                                    if (epochSecond > bVar2.a) {
                                        break;
                                    }
                                    length3--;
                                }
                            } else {
                                min -= 7776000;
                            }
                        }
                    }
                }
                bVar2 = bVar;
            } else if (this.c.length != 0) {
                long epochSecond2 = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.c;
                long j2 = jArr[jArr.length - 1];
                if (this.f.length > 0 && epochSecond2 > j2) {
                    ZoneOffset[] zoneOffsetArr = this.e;
                    ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int c3 = c(epochSecond2, zoneOffset);
                    b[] b5 = b(c3);
                    int length4 = b5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i2 = c3 - 1;
                            if (i2 > c(j2, zoneOffset)) {
                                b[] b6 = b(i2);
                                bVar2 = b6[b6.length - 1];
                            }
                        } else {
                            b bVar3 = b5[length4];
                            if (epochSecond2 > bVar3.a) {
                                bVar2 = bVar3;
                                break;
                            }
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.c, epochSecond2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i3 = binarySearch - 1;
                    long j3 = this.c[i3];
                    ZoneOffset[] zoneOffsetArr2 = this.e;
                    bVar2 = new b(j3, zoneOffsetArr2[i3], zoneOffsetArr2[binarySearch]);
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
