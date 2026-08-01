package j$.util;

/* loaded from: classes2.dex */
public final class a0 {
    public static final a0 c = new a0();
    public final boolean a;
    public final double b;

    public a0() {
        this.a = false;
        this.b = Double.NaN;
    }

    public a0(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        boolean z = a0Var.a;
        boolean z2 = this.a;
        return (z2 && z) ? Double.compare(this.b, a0Var.b) == 0 : z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }
}
