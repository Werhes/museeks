package j$.util;

/* loaded from: classes2.dex */
public final class z {
    public static final z b = new z();
    public final Object a;

    public z() {
        this.a = null;
    }

    public z(Object obj) {
        this.a = Objects.requireNonNull(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return Objects.equals(this.a, ((z) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
