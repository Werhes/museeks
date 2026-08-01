package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes2.dex */
public final class l implements e {
    public final e a;
    public final int b;
    public final char c;

    public l(e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final boolean i(x xVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.i(xVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int i2 = this.b + i;
        if (i2 > charSequence.length()) {
            if (z) {
                return ~i;
            }
            i2 = charSequence.length();
        }
        int i3 = i;
        while (i3 < i2 && vVar.a(charSequence.charAt(i3), this.c)) {
            i3++;
        }
        int j = this.a.j(vVar, charSequence.subSequence(0, i2), i3);
        return (j == i2 || !z) ? j : ~(i + i3);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
