package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g6 extends y5 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void end() {
        List.EL.sort(this.d, this.b);
        long size = this.d.size();
        k5 k5Var = this.a;
        k5Var.h(size);
        if (this.c) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (k5Var.m()) {
                    break;
                } else {
                    k5Var.t((k5) obj);
                }
            }
        } else {
            ArrayList arrayList2 = this.d;
            Objects.requireNonNull(k5Var);
            Collection.EL.a(arrayList2, new j$.time.r(8, k5Var));
        }
        k5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
