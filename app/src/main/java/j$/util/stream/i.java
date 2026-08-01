package j$.util.stream;

import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final /* synthetic */ class i {
    public final /* synthetic */ Collector a;

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
