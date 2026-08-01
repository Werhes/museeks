package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class h2 implements f2 {
    public final f2 a;
    public final f2 b;
    public final long c;

    public h2(f2 f2Var, f2 f2Var2) {
        this.a = f2Var;
        this.b = f2Var2;
        this.c = f2Var2.count() + f2Var.count();
    }

    @Override // j$.util.stream.f2
    public /* bridge */ /* synthetic */ e2 a(int i) {
        return (e2) a(i);
    }

    @Override // j$.util.stream.f2
    public final f2 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.f2
    public final int i() {
        return 2;
    }
}
